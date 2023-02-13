package com.nomina.ejemplo.domain.model.estadoempleado.dto;

import com.nomina.ejemplo.domain.model.estadoempleado.EstadoEmpleado;
import com.nomina.ejemplo.domain.model.estadoempleado.EstadoEmpleadoId;
import com.nomina.ejemplo.domain.model.estadoempleado.EstadoEmpleadoName;

public class EstadoEmpleadoDTO {

    private Long estadoEmpleadoId;

    private String estadoEmpleadoName;

    public EstadoEmpleadoDTO(Long estadoEmpleadoId, String estadoEmpleadoName) {
        this.estadoEmpleadoId = estadoEmpleadoId;
        this.estadoEmpleadoName = estadoEmpleadoName;
    }

    public Long getEstadoEmpleadoId() {
        return estadoEmpleadoId;
    }

    public String getEstadoEmpleadoName() {
        return estadoEmpleadoName;
    }

    public static EstadoEmpleadoDTO fromDomain(EstadoEmpleado estadoEmpleado){
        return new EstadoEmpleadoDTO(
                estadoEmpleado.getEmpleadoId().getValue(),
                estadoEmpleado.getEmpleadoName().getValue());
    }


    public static EstadoEmpleado toDomain(EstadoEmpleadoDTO estadoEmpleadoDTO){
        return new EstadoEmpleado(
                new EstadoEmpleadoId(estadoEmpleadoDTO.getEstadoEmpleadoId()),
                new EstadoEmpleadoName(estadoEmpleadoDTO.getEstadoEmpleadoName()));
    }

}

