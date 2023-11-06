package poo.grupo5.trabalho.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity(name = "colaborador")
@Table(name = "colaborador")
public class Colaborador {

  @Id
  @GeneratedValue(strategy =GenerationType.AUTO)
  private Long id;

  @Column(name = "nome")
  private String nome;

  @Column(name = "email")
  private String email;

  @Column(name = "senha")
  private String senha;

  @Column(name = "telefone")
  private String telefone;

  @Column(name = "cpf")
  private String cpf;

  @ManyToOne()
  @JoinColumn(name = "funcao_id")
  private Funcao funcao;

  @OneToMany(mappedBy = "colaborador")
  private List<Tarefas> tarefas;

  // Getters e setters
  public String getCpf() {
    return cpf;
  }

  public String getEmail() {
    return email;
  }

  public Funcao getFuncao() {
    return funcao;
  }

  public Long getId() {
    return id;
  }

  public String getNome() {
    return nome;
  }

  public String getSenha() {
    return senha;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setFuncao(Funcao funcao) {
    this.funcao = funcao;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }
}
