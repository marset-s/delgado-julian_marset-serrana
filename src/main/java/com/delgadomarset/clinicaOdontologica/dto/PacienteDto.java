package com.delgadomarset.clinicaOdontologica.dto;

import com.delgadomarset.clinicaOdontologica.entity.Paciente;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.time.LocalDate;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PacienteDto {

    private Long id;
    private String nombre;
    private String apellido;

    private String dni;
    private LocalDate fechaIngreso;
    private DomicilioDto domicilio;


    public PacienteDto() {
    }

    public PacienteDto(Long id, String nombre, String apellido, String dni, LocalDate fechaIngreso, DomicilioDto domicilioDto) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaIngreso = fechaIngreso;
        this.domicilio = domicilioDto;
    }

    public static PacienteDto fromPaciente(Paciente paciente) {
        return new PacienteDto(
                paciente.getId(),
                paciente.getNombre(),
                paciente.getApellido(),
                paciente.getDni(),
                paciente.getFechaIngreso(),
                DomicilioDto.fromDomicilio(paciente.getDomicilio())
        );
    }

    public DomicilioDto getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(DomicilioDto domicilio) {
        this.domicilio = domicilio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    @Override
    public String toString() {
        return "PacienteDto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", fechaIngreso=" + fechaIngreso +
                ", domicilioDto=" + domicilio +
                '}';
    }
}
