package poo.grupo5.trabalho.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import poo.grupo5.trabalho.entity.Tarefas;
import java.util.List;


@Repository
public interface TarefasRepository extends JpaRepository<Tarefas, Long> {
  List<Tarefas> findByColaboradorId(Long id);
  List<Tarefas> findByAtividadesProjetoId(Long atividadesProjeto);
}
