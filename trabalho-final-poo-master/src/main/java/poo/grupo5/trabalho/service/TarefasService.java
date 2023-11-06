package poo.grupo5.trabalho.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poo.grupo5.trabalho.entity.AtividadesProjeto;
import poo.grupo5.trabalho.entity.Colaborador;
import poo.grupo5.trabalho.entity.Tarefas;
import poo.grupo5.trabalho.repository.AtividadesProjetoRepository;
import poo.grupo5.trabalho.repository.ColaboradorRepository;
import poo.grupo5.trabalho.repository.TarefasRepository;
import java.util.List;

@Service
public class TarefasService {
  
  @Autowired()
  private TarefasRepository tarefasRepository;

  @Autowired()
  private AtividadesProjetoRepository atividadesProjetoRepository;

  @Autowired()
  private ColaboradorRepository colaboradorRepository;

  public String createTarefa(
    Tarefas tarefa,
    Long colabId,
    Long atividadeId
  ) {
    AtividadesProjeto atividadeRef = atividadesProjetoRepository.getReferenceById(atividadeId);
    Colaborador colaboradorRef = colaboradorRepository.getReferenceById(colabId);
    tarefa.setAtividadesProjeto(atividadeRef);
    tarefa.setColaborador(colaboradorRef);
    tarefasRepository.save(tarefa);
    return "Tarefa criada com sucesso!";
  }

  public List<Tarefas> getAllColaboradoresTarefas(Long colabId) {
    return tarefasRepository.findByColaboradorId(colabId);
  }

  public List<Tarefas> getAllAtividadeTarefas(Long atividadeId) {
    return tarefasRepository.findByAtividadesProjetoId(atividadeId);
  }

  public String deleteTarefa(Long tarefaId) {
    tarefasRepository.deleteById(tarefaId);
    return "Tarefa deletada com sucesso!";
  }

  public String updateTarefa(Tarefas tarefas, Long tarefaId) {
    Tarefas tarefaRef = tarefasRepository.getReferenceById(tarefaId);
    tarefaRef.setDescricao(tarefas.getDescricao());
    tarefaRef.setTempo_estimado(tarefas.getTempo_estimado());
    tarefasRepository.save(tarefaRef);
    return "Tarefa atualizada com sucesso!";
  }
}
