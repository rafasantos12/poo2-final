package poo.grupo5.trabalho.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;

@Entity(name = "cliente")
@Table(name = "cliente")
public class Cliente {

  // Define o ID e diz para o spring que o ID é gerenciado de forma automatica
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(name = "nome", length = 250, unique = false, nullable = false)
  private String nome;

  @Column(name = "email", length = 250, unique = true, nullable = false)
  private String email;

  @Column(name = "senha", length = 300, unique = false, nullable = false)
  private String senha;

  @Column(name = "telefone", length = 15, unique = false, nullable = false)
  private String telefone;

  // Foreign key
  @OneToMany(mappedBy = "cliente")
  private List<Projeto> projeto;

  // Getters e setters
  public String getEmail() {
    return email;
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
  
  public void setEmail(String email) {
    this.email = email;
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
