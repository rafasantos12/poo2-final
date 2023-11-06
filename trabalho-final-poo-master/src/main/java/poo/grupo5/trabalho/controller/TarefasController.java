package poo.grupo5.trabalho.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import poo.grupo5.trabalho.entity.Tarefas;
import poo.grupo5.trabalho.service.TarefasService;

@RestController
@RequestMapping(value = "/tarefas")
public class TarefasController {
  
  @Autowired()
  private TarefasService tarefasService;

  @PostMapping("/{colabId}/{atividadeId}")
  public String createTarefa(
    @RequestBody Tarefas tarefas,
    @PathVariable Long colabId,
    @PathVariable Long atividadeId
  ) {
    return tarefasService.createTarefa(tarefas, colabId, atividadeId);
  }

  @PutMapping("/{tarefaId}")
  public String updateTarefa(
    @RequestBody Tarefas tarefas,
    @PathVariable Long tarefaId
  ) {
    return tarefasService.updateTarefa(tarefas, tarefaId);
  }

  @GetMapping(value = "/all/{colabId}")
  public List<Tarefas> getAllColaboradoresTarefas(
    @PathVariable Long colabId
  ) {
    return tarefasService.getAllColaboradoresTarefas(colabId);
  }

  @GetMapping(value = "/atividades/all/{atividadeId}")
  public List<Tarefas> getAllAtividadeTarefas(
    @PathVariable Long atividadeId
  ) {
    return tarefasService.getAllAtividadeTarefas(atividadeId);
  }

  @DeleteMapping(value = "/{tarefaId}")
  public String deleteTarefa(
    @PathVariable() Long tarefaId
  ) {
    return tarefasService.deleteTarefa(tarefaId);
  }
}
