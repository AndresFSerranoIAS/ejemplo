package com.nomina.ejemplo.infrastructure.entrypoint;

import com.nomina.ejemplo.domain.model.empleado.dto.EmpleadoDTO;
import com.nomina.ejemplo.domain.model.estadoempleado.dto.EstadoEmpleadoDTO;
import com.nomina.ejemplo.domain.usecases.EmpleadoUseCase;
import com.nomina.ejemplo.domain.usecases.EstadoEmpleadoUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/estado-empleado")
@AllArgsConstructor
@CrossOrigin(origins = "*",allowedHeaders = "*",methods = {RequestMethod.DELETE,RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT})
public class EstadoEmpleadoEntryPoint {

    private EstadoEmpleadoUseCase estadoEmpleadoUseCase;

    @PostMapping("/create")
    public ResponseEntity<?> saveEstadoEmpleado(@RequestBody EstadoEmpleadoDTO estadoEmpleadoDTO){
        return new ResponseEntity(estadoEmpleadoUseCase.saveEstadoEmpleado(estadoEmpleadoDTO), HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<?> getEstadoEmpleados(){
        return new ResponseEntity<>(estadoEmpleadoUseCase.getEstadoEmpleados(),HttpStatus.OK);
    }
}
