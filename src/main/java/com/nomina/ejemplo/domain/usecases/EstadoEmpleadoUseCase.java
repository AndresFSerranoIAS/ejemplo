package com.nomina.ejemplo.domain.usecases;

import com.nomina.ejemplo.domain.model.empleado.Empleado;
import com.nomina.ejemplo.domain.model.empleado.dto.EmpleadoDTO;
import com.nomina.ejemplo.domain.model.estadoempleado.EstadoEmpleado;
import com.nomina.ejemplo.domain.model.estadoempleado.dto.EstadoEmpleadoDTO;
import com.nomina.ejemplo.domain.model.gateways.IEstadoEmpleadoRespository;

import java.util.List;
import java.util.stream.Collectors;

public class EstadoEmpleadoUseCase {

    private final IEstadoEmpleadoRespository iEstadoEmpleadoRespository;

    public EstadoEmpleadoUseCase(IEstadoEmpleadoRespository iEstadoEmpleadoRespository) {
        this.iEstadoEmpleadoRespository = iEstadoEmpleadoRespository;
    }
    public EstadoEmpleadoDTO saveEstadoEmpleado(EstadoEmpleadoDTO estadoEmpleadoDTO){
        return  EstadoEmpleadoDTO.fromDomain(iEstadoEmpleadoRespository.saveEstadoEmpleado(EstadoEmpleadoDTO.toDomain(estadoEmpleadoDTO)));
    }

    public List<EstadoEmpleadoDTO> getEstadoEmpleados(){
        List<EstadoEmpleado> listaVO = iEstadoEmpleadoRespository.getEstadoEmpleados();
        return listaVO.stream().map(e -> EstadoEmpleadoDTO.fromDomain(e)).collect(Collectors.toList());
    }
}
