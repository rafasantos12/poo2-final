package poo.grupo5.trabalho.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import poo.grupo5.trabalho.entity.Cliente;
import poo.grupo5.trabalho.entity.Projeto;
import java.util.List;


public interface ProjetoRepository extends JpaRepository<Projeto, Long> {
  List<Projeto> findByClienteId(Long id);
}
