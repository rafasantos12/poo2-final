package poo.grupo5.trabalho.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import poo.grupo5.trabalho.entity.AtividadesProjeto;
import poo.grupo5.trabalho.service.AtividadesProjetoService;

@RestController
@RequestMapping(value = "/atividades")
public class AtividadesProjetoController {
  
  @Autowired()
  AtividadesProjetoService atividadesProjetoService;

  @PostMapping("{projetoId}") 
  public String createAtividade(
    @RequestBody AtividadesProjeto atividadesProjeto, 
    @PathVariable Long projetoId
  ) {
    return atividadesProjetoService.createAtividade(atividadesProjeto, projetoId);
  }

  @PutMapping("{id}")
  public String updateAtividade(
    @RequestBody AtividadesProjeto atividadesProjeto, 
    @PathVariable Long id
  ) {
    return atividadesProjetoService.updateAtividade(atividadesProjeto, id);
  }

  @GetMapping("/all/{projetoId}")
  public List<AtividadesProjeto> getAllAtividade(@PathVariable Long projetoId) {
    return atividadesProjetoService.getAllAtividade(projetoId);
  }

  @GetMapping("{id}")
  public Optional<AtividadesProjeto> getAtividade(@PathVariable Long id) {
    return atividadesProjetoService.getAtividade(id);
  }

  @DeleteMapping("{id}")
  public String deleteAtividade(@PathVariable Long id) {
    return atividadesProjetoService.deleteAtividade(id);
  }
}
