package com.delgadomarset.clinicaOdontologica.repository;

import com.delgadomarset.clinicaOdontologica.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteReposirtory extends JpaRepository <Paciente, Long>{
}
