package com.nomina.ejemplo.domain.model.empleado;

public class Empleado {

    private final EmpleadoId empleadoId;

    private final EmpleadoName empleadoName;

    private final EmpleadoCumple empleadoCumple;

    private final EmpleadoEstadoId empleadoEstadoId;

    public Empleado(EmpleadoId empleadoId, EmpleadoName empleadoName, EmpleadoCumple empleadoCumple, EmpleadoEstadoId empleadoEstadoId) {
        this.empleadoId = empleadoId;
        this.empleadoName = empleadoName;
        this.empleadoCumple = empleadoCumple;
        this.empleadoEstadoId = empleadoEstadoId;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }

    public EmpleadoName getEmpleadoName() {
        return empleadoName;
    }

    public EmpleadoCumple getEmpleadoCumple() {
        return empleadoCumple;
    }

    public EmpleadoEstadoId getEmpleadoEstadoId() {
        return empleadoEstadoId;
    }
}
