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

import poo.grupo5.trabalho.service.ProjetoService;
import poo.grupo5.trabalho.entity.Projeto;

@RestController()
@RequestMapping(value = "/projeto")
public class ProjetoController {

  @Autowired()
  ProjetoService projetoService;

  @PostMapping("/{clienteId}")
  public String createProjeto(@RequestBody Projeto projeto, @PathVariable Long clienteId) {
    projetoService.createProjeto(projeto, clienteId);
    return "projeto";
  }

  @PutMapping("{id}")
  public String updateProjeto(@RequestBody Projeto projeto, @PathVariable Long id) {
    return projetoService.updateProjeto(projeto, id);
  }

  @GetMapping("/all/{clienteId}")
  public List<Projeto> getAllProjetos(@PathVariable Long clienteId) {
    return projetoService.getAllProjetos(clienteId);
  }

  @GetMapping("{id}")
  public Optional<Projeto> getProjeto(@PathVariable Long id) {
    return projetoService.getProjeto(id);
  }

  @DeleteMapping("{id}")
  public String deleteProjeto(@PathVariable Long id) {
    return projetoService.deleteProjeto(id);
  }

}
