package poo.grupo5.trabalho.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poo.grupo5.trabalho.entity.Colaborador;
import poo.grupo5.trabalho.entity.Funcao;
import poo.grupo5.trabalho.repository.ColaboradorRepository;
import poo.grupo5.trabalho.repository.FuncaoRepository;

@Service
public class ColaboradorService {

  @Autowired()
  ColaboradorRepository colaboradorRepository;

  @Autowired()
  FuncaoRepository funcaoRepository;

  public String createColaborador(
    Colaborador colaborador,
    Long idFuncao
  ) {
    Funcao funcao = funcaoRepository.getReferenceById(idFuncao);
    colaborador.setFuncao(funcao);
    colaboradorRepository.save(colaborador);
    return "Colaborador criado com sucesso!";
  }

}
