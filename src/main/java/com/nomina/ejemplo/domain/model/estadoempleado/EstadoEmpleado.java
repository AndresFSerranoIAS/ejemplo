package com.nomina.ejemplo.domain.model.estadoempleado;

public class EstadoEmpleado {

    private final EstadoEmpleadoId empleadoId;
    private final EstadoEmpleadoName empleadoName;

    public EstadoEmpleado(EstadoEmpleadoId empleadoId, EstadoEmpleadoName empleadoName) {
        this.empleadoId = empleadoId;
        this.empleadoName = empleadoName;
    }

    public EstadoEmpleadoId getEmpleadoId() {
        return empleadoId;
    }

    public EstadoEmpleadoName getEmpleadoName() {
        return empleadoName;
    }
}
