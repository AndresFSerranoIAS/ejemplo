package com.nomina.ejemplo.domain.model.empleado.dto;

import com.nomina.ejemplo.domain.model.empleado.*;

public class EmpleadoDTO {

    private Long empleadoId;

    private String empleadoName;

    private String empleadoCumple;

    private Long empleadoEstadoId;

    public EmpleadoDTO(Long empleadoId, String empleadoName, String empleadoCumple, Long empleadoEstadoId) {
        this.empleadoId = empleadoId;
        this.empleadoName = empleadoName;
        this.empleadoCumple = empleadoCumple;
        this.empleadoEstadoId = empleadoEstadoId;
    }

    public Long getEmpleadoId() {
        return empleadoId;
    }

    public String getEmpleadoName() {
        return empleadoName;
    }

    public String getEmpleadoCumple() {
        return empleadoCumple;
    }

    public Long getEmpleadoEstadoId() {
        return empleadoEstadoId;
    }
    //Traducciones
    public static EmpleadoDTO fromDomain(Empleado empleado){
        return new EmpleadoDTO(
                empleado.getEmpleadoId().getValue(),
                empleado.getEmpleadoName().getValue(),
                empleado.getEmpleadoCumple().getValue(),
                empleado.getEmpleadoEstadoId().getValue());
    }

    public static Empleado toDomain(EmpleadoDTO empleadoDTO){
        return new Empleado(new EmpleadoId(empleadoDTO.getEmpleadoId()),
                new EmpleadoName(empleadoDTO.getEmpleadoName()),
                new EmpleadoCumple(empleadoDTO.getEmpleadoCumple()),
                new EmpleadoEstadoId(empleadoDTO.getEmpleadoEstadoId()));
    }

}
