package com.nomina.ejemplo.infrastructure.adapters.jpa.estadoempleado;

import com.nomina.ejemplo.infrastructure.adapters.jpa.entity.EstadoEmpleadoDBO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEstadoEmpleadoRespositoryAdapter extends JpaRepository<EstadoEmpleadoDBO,Long> {
}
