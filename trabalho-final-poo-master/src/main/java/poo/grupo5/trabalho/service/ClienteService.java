package poo.grupo5.trabalho.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import poo.grupo5.trabalho.entity.Cliente;
import poo.grupo5.trabalho.repository.ClienteRepository;

@Service
public class ClienteService {
  
  @Autowired()
  private ClienteRepository clienteRepository;

  @Transactional
  public String createCliente(Cliente novoCliente) {
    clienteRepository.save(novoCliente);
    return "Cadastrado com sucesso!";
  }

  @Transactional
  public String updateCliente(Long id, Cliente novoCliente) {
    Cliente cliente = clienteRepository.getReferenceById(id);
    cliente.setEmail(novoCliente.getEmail());
    cliente.setNome(novoCliente.getNome());
    cliente.setSenha(novoCliente.getSenha());
    cliente.setTelefone(novoCliente.getTelefone());
    clienteRepository.save(cliente);
    return "Cliente atualizado com sucesso!";
  }

  @Transactional
  public Optional<Cliente> getCliente(Long id) {
    return clienteRepository.findById(id);
  }

  @Transactional
  public String deleteCliente( Long id) {
    clienteRepository.deleteById(id);
    return "Deletado com sucesso!";
  }

}
