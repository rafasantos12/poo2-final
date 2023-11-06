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

@Entity(name = "atividadesprojeto")
@Table(name = "atividadesprojeto")
public class AtividadesProjeto {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(name = "titulo")
  private String titulo;

  @Column(name = "descricao")
  private String descricao;

  @ManyToOne()
  @JoinColumn(name = "projeto_id")
  private Projeto projeto;

  @OneToMany(mappedBy = "atividadesProjeto")
  private List<Tarefas> tarefas;

  // Getters e setters
  public String getDescricao() {
    return descricao;
  }

  public Long getId() {
    return id;
  }

  public Projeto getProjeto() {
    return projeto;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setProjeto(Projeto projeto) {
    this.projeto = projeto;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }
}
