package poo.grupo5.trabalho.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

import poo.grupo5.trabalho.entity.Projeto;
import poo.grupo5.trabalho.repository.ClienteRepository;
import poo.grupo5.trabalho.repository.ProjetoRepository;
import poo.grupo5.trabalho.entity.Cliente;
import java.util.List;

@Service
public class ProjetoService {
  
  @Autowired()
  private ProjetoRepository projetoRepository;

  @Autowired()
  private ClienteRepository clienteRepository;

  public String createProjeto(Projeto projeto, Long clienteId) {
    Cliente cliente = clienteRepository.getReferenceById(clienteId);
    projeto.setCliente(cliente);
    projetoRepository.save(projeto);
    return "Projeto criado com sucesso!";
  }

  public List<Projeto> getAllProjetos(Long clienteId) {
    List<Projeto> allProjetos = projetoRepository.findByClienteId(clienteId);
    return allProjetos;
  }

  public Optional<Projeto> getProjeto(Long id) {
    return projetoRepository.findById(id);
  }

  public String deleteProjeto(Long id) {
    projetoRepository.deleteById(id);
    return "Projeto deletado com sucesso!";
  }

  public String updateProjeto(Projeto novoProjeto, Long id) {
    Projeto projeto = projetoRepository.getReferenceById(id);
    projeto.setDescricao(novoProjeto.getDescricao());
    projeto.setNome(novoProjeto.getNome());
    projeto.setTempoEstimado(novoProjeto.getTempoEstimado());
    projeto.setValor(novoProjeto.getValor());
    projetoRepository.save(projeto);
    return "Projeto atualizado com sucesso!";
  }

}
