package com.nomina.ejemplo.domain.usecases;

import com.nomina.ejemplo.domain.model.empleado.Empleado;
import com.nomina.ejemplo.domain.model.empleado.dto.EmpleadoDTO;
import com.nomina.ejemplo.domain.model.gateways.IEmpleadoRepository;

import java.util.List;
import java.util.stream.Collectors;

public class EmpleadoUseCase {

    private final IEmpleadoRepository iEmpleadoRepository;


    public EmpleadoUseCase(IEmpleadoRepository iEmpleadoRepository) {
        this.iEmpleadoRepository = iEmpleadoRepository;
    }

    public EmpleadoDTO saveEmpleado(EmpleadoDTO empleadoDTO){
        return  EmpleadoDTO.fromDomain(iEmpleadoRepository.saveEmpleado(EmpleadoDTO.toDomain(empleadoDTO)));
    }

    public List<EmpleadoDTO> getEmpleados(){
        List<Empleado> listaVO = iEmpleadoRepository.getEmpleados();
        return listaVO.stream().map(e -> EmpleadoDTO.fromDomain(e)).collect(Collectors.toList());
    }

}
