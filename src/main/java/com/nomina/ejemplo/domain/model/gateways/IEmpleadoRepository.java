package com.nomina.ejemplo.domain.model.gateways;

import com.nomina.ejemplo.domain.model.empleado.Empleado;

import java.util.List;

public interface IEmpleadoRepository {

    Empleado saveEmpleado(Empleado empleado);

    List<Empleado> getEmpleados();

}
