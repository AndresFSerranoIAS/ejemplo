package com.nomina.ejemplo.infrastructure.adapters.jpa.estadoempleado;

import com.nomina.ejemplo.domain.model.estadoempleado.EstadoEmpleado;
import com.nomina.ejemplo.domain.model.gateways.IEstadoEmpleadoRespository;
import com.nomina.ejemplo.infrastructure.adapters.jpa.entity.EstadoEmpleadoDBO;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Collectors;
@Repository
public class EstadoEmpleadoAdapterRepository implements IEstadoEmpleadoRespository {

    private final IEstadoEmpleadoRespositoryAdapter iEstadoEmpleadoRespositoryAdapter;

    public EstadoEmpleadoAdapterRepository(IEstadoEmpleadoRespositoryAdapter iEstadoEmpleadoRespositoryAdapter) {
        this.iEstadoEmpleadoRespositoryAdapter = iEstadoEmpleadoRespositoryAdapter;
    }


    @Override
    public EstadoEmpleado saveEstadoEmpleado(EstadoEmpleado estadoEmpleado) {
        return EstadoEmpleadoDBO.toDomain(iEstadoEmpleadoRespositoryAdapter.save(EstadoEmpleadoDBO.fromDomain(estadoEmpleado)));
    }

    @Override
    public List<EstadoEmpleado> getEstadoEmpleados() {
        return iEstadoEmpleadoRespositoryAdapter
                .findAll()
                .stream()
                .map(EstadoEmpleadoDBO::toDomain)
                .collect(Collectors.toList());
    }
}
