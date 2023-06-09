package com.delgadomarset.clinicaOdontologica.dto;

import com.delgadomarset.clinicaOdontologica.entity.Odontologo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class OdontologoDto {

    private String matricula;
    private String nombre;
    private String apellido;

    public OdontologoDto(String matricula, String nombre, String apellido) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public OdontologoDto() {
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
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

    public static OdontologoDto fromOdontologo(Odontologo odontologo){
        String matricula = "Matricula: " + odontologo.getMatricula();
        String nombre = "Nombre : " + odontologo.getNombre();
        String apellido = "Apellido " + odontologo.getApellido();
        return new OdontologoDto(matricula, nombre, apellido);
    }

    @Override
    public String toString() {
        return "OdontologoDto{" +
                "matricula='" + matricula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
