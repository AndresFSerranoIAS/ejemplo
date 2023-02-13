package com.nomina.ejemplo.infrastructure.adapters.jpa.entity;

import com.nomina.ejemplo.domain.model.estadoempleado.EstadoEmpleado;
import com.nomina.ejemplo.domain.model.estadoempleado.EstadoEmpleadoId;
import com.nomina.ejemplo.domain.model.estadoempleado.EstadoEmpleadoName;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="ESTADO_EMPLEADO")
public class EstadoEmpleadoDBO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ESTADO_EMPLEADO_ID")
    private Long estadoEmpleadoId;

    @Column(name="ESTADO_EMPLEADO_NAME",unique = true)
    private String estadoEmpleadoName;

    public static EstadoEmpleadoDBO fromDomain(EstadoEmpleado estadoEmpleado){
        return new EstadoEmpleadoDBO(estadoEmpleado.getEmpleadoId().getValue(),
                estadoEmpleado.getEmpleadoName().getValue());
    }

    public static EstadoEmpleado toDomain(EstadoEmpleadoDBO estadoEmpleadoDBO){
        return new EstadoEmpleado(new EstadoEmpleadoId(estadoEmpleadoDBO.getEstadoEmpleadoId()),
                new EstadoEmpleadoName(estadoEmpleadoDBO.getEstadoEmpleadoName()));
    }
}
