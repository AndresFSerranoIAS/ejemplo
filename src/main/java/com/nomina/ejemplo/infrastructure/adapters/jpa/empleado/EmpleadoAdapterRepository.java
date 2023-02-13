package com.nomina.ejemplo.infrastructure.adapters.jpa.empleado;

import com.nomina.ejemplo.domain.model.empleado.Empleado;
import com.nomina.ejemplo.domain.model.gateways.IEmpleadoRepository;
import com.nomina.ejemplo.infrastructure.adapters.jpa.entity.EmpleadoDBO;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
@Repository
public class EmpleadoAdapterRepository implements IEmpleadoRepository {

    private final IEmpleadoRespositoryAdapter iEmpleadoRespositoryAdapter;

    public EmpleadoAdapterRepository(IEmpleadoRespositoryAdapter iEmpleadoRespositoryAdapter) {
        this.iEmpleadoRespositoryAdapter = iEmpleadoRespositoryAdapter;
    }

    @Override
    public Empleado saveEmpleado(Empleado empleado) {
        return EmpleadoDBO.toDomain(iEmpleadoRespositoryAdapter.save(EmpleadoDBO.fromDomain(empleado)));
    }

    @Override
    public List<Empleado> getEmpleados() {
        return iEmpleadoRespositoryAdapter
                .findAll()
                .stream()
                .map(EmpleadoDBO::toDomain)
                .collect(Collectors.toList());
    }
}
