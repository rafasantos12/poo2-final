package poo.grupo5.trabalho.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity(name = "tarefas")
@Table(name = "tarefas")
public class Tarefas {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(name = "tempo_estimado")
  private String tempo_estimado;

  @Column(name = "descricao")
  private String descricao;

  @ManyToOne()
  @JoinColumn(name = "atividades_id")
  private AtividadesProjeto atividadesProjeto;

  @ManyToOne()
  @JoinColumn(name = "colaborador_id")
  private Colaborador colaborador;

  // Getters e setters
  public AtividadesProjeto getAtividadesProjeto() {
    return atividadesProjeto;
  }

  public Colaborador getColaborador() {
    return colaborador;
  }

  public String getDescricao() {
    return descricao;
  }

  public Long getId() {
    return id;
  }

  public String getTempo_estimado() {
    return tempo_estimado;
  }

  public void setAtividadesProjeto(AtividadesProjeto atividadesProjeto) {
    this.atividadesProjeto = atividadesProjeto;
  }

  public void setColaborador(Colaborador colaborador) {
    this.colaborador = colaborador;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setTempo_estimado(String tempo_estimado) {
    this.tempo_estimado = tempo_estimado;
  }
}
