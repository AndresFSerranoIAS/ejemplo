package com.nomina.ejemplo.infrastructure.adapters.jpa.entity;

import com.nomina.ejemplo.domain.model.empleado.*;
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
@Table(name="EMPLEADO")
public class EmpleadoDBO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="EMPLEADO_ID")
    private Long empleadoId;

    @Column(name = "NOMBRE_EMPLEADO",unique = true)
    private String empleadoName;

    @Column(name="CUMPLE_EMPLEADO",nullable = false)
    private String empleadoCumple;

    @Column(name="EMPLEADO_ESTADO_ID",nullable = false)
    private Long empleadoEstadoId;

    public static EmpleadoDBO fromDomain(Empleado empleado){
        return new EmpleadoDBO(empleado.getEmpleadoId().getValue(),
                empleado.getEmpleadoName().getValue(),
                empleado.getEmpleadoCumple().getValue(),
                empleado.getEmpleadoEstadoId().getValue());
    }

    public static Empleado toDomain(EmpleadoDBO empleadoDBO){
        return new Empleado(new EmpleadoId(empleadoDBO.getEmpleadoId()),
                new EmpleadoName(empleadoDBO.getEmpleadoName()),
                new EmpleadoCumple(empleadoDBO.getEmpleadoCumple()),
                new EmpleadoEstadoId(empleadoDBO.getEmpleadoId()));
    }

}
