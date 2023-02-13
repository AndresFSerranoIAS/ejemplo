package com.nomina.ejemplo.infrastructure.entrypoint;

import com.nomina.ejemplo.domain.model.empleado.dto.EmpleadoDTO;
import com.nomina.ejemplo.domain.usecases.EmpleadoUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/empleado")
@AllArgsConstructor
@CrossOrigin(origins = "*",allowedHeaders = "*",methods = {RequestMethod.DELETE,RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT})
public class EmpleadoEntryPoint {

    private EmpleadoUseCase empleadoUseCase;

    @PostMapping("/create")
    public ResponseEntity<?> saveEmpleado(@RequestBody EmpleadoDTO empleadoDTO){
        return new ResponseEntity(empleadoUseCase.saveEmpleado(empleadoDTO), HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<?> getEmpleados(){
        return new ResponseEntity<>(empleadoUseCase.getEmpleados(),HttpStatus.OK);
    }

}
