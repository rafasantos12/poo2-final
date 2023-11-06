package poo.grupo5.trabalho.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import jakarta.transaction.Transactional;
import poo.grupo5.trabalho.entity.AtividadesProjeto;
import poo.grupo5.trabalho.entity.Projeto;
import poo.grupo5.trabalho.repository.AtividadesProjetoRepository;
import poo.grupo5.trabalho.repository.ProjetoRepository;
import java.util.List;
import java.util.Optional;

@Service
public class AtividadesProjetoService {

  @Autowired()
  AtividadesProjetoRepository atividadesProjetoRepository;

  @Autowired()
  ProjetoRepository projetoRepository;

  public String createAtividade(
    AtividadesProjeto atividadesProjeto, 
    Long id
  ) {
    Projeto projeto = projetoRepository.getReferenceById(id);
    atividadesProjeto.setProjeto(projeto);
    atividadesProjetoRepository.save(atividadesProjeto);
    return "Atividade criada com sucesso!";
  }

  public List<AtividadesProjeto> getAllAtividade(Long id) {
    return atividadesProjetoRepository.findByProjetoId(id);
  }

  public Optional<AtividadesProjeto> getAtividade(Long id) {
    return atividadesProjetoRepository.findById(id);
  }

  public String deleteAtividade(Long id) {
    atividadesProjetoRepository.deleteById(id);
    return "Atividade do projeto excluida com sucesso!";
  }

  @Transactional
  public String updateAtividade(
    AtividadesProjeto novaAtividade, 
    Long id
  ) {
    AtividadesProjeto atividade = atividadesProjetoRepository.getReferenceById(id);
    atividade.setDescricao(novaAtividade.getDescricao());
    atividade.setTitulo(novaAtividade.getTitulo());
    atividadesProjetoRepository.save(atividade);
    return "Atividade atualizada com sucesso!";
  }
}
