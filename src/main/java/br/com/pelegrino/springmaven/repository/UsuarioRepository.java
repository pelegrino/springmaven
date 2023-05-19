package br.com.pelegrino.springmaven.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.pelegrino.springmaven.model.Usuario;

public interface UsuarioRepository extends JpaRepository <Usuario, Long>{
	
	@Query(value = "select u from Usuario u where upper(trim(u.nome)) like %?1%")
	List<Usuario> buscarPorNome(String name);

}
