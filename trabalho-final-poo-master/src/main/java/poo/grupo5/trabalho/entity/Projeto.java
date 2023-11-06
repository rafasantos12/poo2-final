package poo.grupo5.trabalho.entity;

import org.hibernate.annotations.ManyToAny;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;
import java.util.List;

@Entity(name = "projeto")
@Table(name = "projeto")
public class Projeto {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(name = "nome")
  private String nome;

  @Column(name = "descricao")
  private String descricao;

  @Column(name = "tempo_estimado")
  private String tempoEstimado;

  @Column(name = "valor")
  private String valor;

  @ManyToOne
  @JoinColumn(name = "cliente_id")
  private Cliente cliente;

  @OneToMany(mappedBy = "projeto")
  private List<AtividadesProjeto> atividadesProjeto;

  // Getters e setters
  public Cliente getCliente() {
    return cliente;
  }
  public String getDescricao() {
    return descricao;
  }
  public Long getId() {
    return id;
  }
  public String getNome() {
    return nome;
  }
  public String getTempoEstimado() {
    return tempoEstimado;
  }
  public String getValor() {
    return valor;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setTempoEstimado(String tempoEstimado) {
    this.tempoEstimado = tempoEstimado;
  }

  public void setValor(String valor) {
    this.valor = valor;
  }

}
