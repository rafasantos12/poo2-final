package poo.grupo5.trabalho.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import poo.grupo5.trabalho.entity.AtividadesProjeto;
import java.util.List;


@Repository
public interface AtividadesProjetoRepository extends JpaRepository<AtividadesProjeto, Long> {
  List<AtividadesProjeto> findByProjetoId(Long id);
}
