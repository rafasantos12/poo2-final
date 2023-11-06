package poo.grupo5.trabalho.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import poo.grupo5.trabalho.entity.Colaborador;
import poo.grupo5.trabalho.service.ColaboradorService;

@RestController
@RequestMapping("/colaborador")
public class ColaboradorController {

  @Autowired()
  ColaboradorService colaboradorService;

  @PostMapping("{idFuncao}")
  public String createColaborador(
    @RequestBody Colaborador colaborador,
    @PathVariable Long idFuncao
  ) {
    return colaboradorService.createColaborador(colaborador, idFuncao);
  }

  @GetMapping()
  public String getColaborador() {
    return "Colaborador";
  }
}