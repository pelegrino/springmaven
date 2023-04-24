package br.com.pelegrino.springmaven.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pelegrino.springmaven.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository <Usuario, Long>{

}
