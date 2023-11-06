package poo.grupo5.trabalho.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import poo.grupo5.trabalho.entity.Funcao;

@Repository
public interface FuncaoRepository extends JpaRepository<Funcao, Long> {
  
}
