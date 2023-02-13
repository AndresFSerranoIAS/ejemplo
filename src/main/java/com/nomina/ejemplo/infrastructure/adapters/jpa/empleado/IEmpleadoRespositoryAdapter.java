package com.nomina.ejemplo.infrastructure.adapters.jpa.empleado;

import com.nomina.ejemplo.infrastructure.adapters.jpa.entity.EmpleadoDBO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmpleadoRespositoryAdapter extends JpaRepository<EmpleadoDBO,Long> {


}
