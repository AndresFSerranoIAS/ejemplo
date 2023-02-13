package com.nomina.ejemplo.application.configuration;

import com.nomina.ejemplo.domain.model.gateways.IEmpleadoRepository;
import com.nomina.ejemplo.domain.model.gateways.IEstadoEmpleadoRespository;
import com.nomina.ejemplo.domain.usecases.EmpleadoUseCase;
import com.nomina.ejemplo.domain.usecases.EstadoEmpleadoUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseBeanConfig {

    @Bean("empleadoService")
    public EmpleadoUseCase empleadoUseCase (IEmpleadoRepository iEmpleadoRepository){
        return new EmpleadoUseCase(iEmpleadoRepository);
    }

    @Bean("empleadoService")
    public EstadoEmpleadoUseCase estadoEmpleadoUseCase (IEstadoEmpleadoRespository iEstadoEmpleadoRespository){
        return new EstadoEmpleadoUseCase(iEstadoEmpleadoRespository);
    }


}
