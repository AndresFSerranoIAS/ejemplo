package com.nomina.ejemplo.domain.model.gateways;

import com.nomina.ejemplo.domain.model.empleado.Empleado;
import com.nomina.ejemplo.domain.model.estadoempleado.EstadoEmpleado;

import java.util.List;

public interface IEstadoEmpleadoRespository {

    EstadoEmpleado saveEstadoEmpleado(EstadoEmpleado estadoEmpleado);

    List<EstadoEmpleado> getEstadoEmpleados();

}
