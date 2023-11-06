package poo.grupo5.trabalho.controller;

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

import poo.grupo5.trabalho.entity.Cliente;
import poo.grupo5.trabalho.service.ClienteService;

@RestController()
@RequestMapping(value = "/cliente")
public class ClienteController {

  @Autowired()
  private ClienteService clienteService;

  @PostMapping()
  public String createCliente(@RequestBody Cliente novoCliente) {
    clienteService.createCliente(novoCliente);
    return "Cadastrado com sucesso!";
  }

  @PutMapping("{id}")
  public String updateCliente(@RequestBody Cliente updateCliente, @PathVariable Long id) {
    clienteService.updateCliente(id, updateCliente);
    return "Cliente atualizado com sucesso!";
  }

  @GetMapping("/{id}")
  public Optional<Cliente> getCliente(@PathVariable Long id) {
    return clienteService.getCliente(id);
  }

  @DeleteMapping("/{id}")
  public String deleteCliente(@PathVariable Long id) {
    clienteService.deleteCliente(id);
    return "Cliente deletado com sucesso!";
  }
}