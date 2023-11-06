package poo.grupo5.trabalho.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;

@Entity(name = "funcao")
@Table(name = "funcao")
public class Funcao {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(name = "tipo")
  private String tipo;

  @Column(name = "salario_hora")
  private String salarioHora;

  @OneToMany(mappedBy = "funcao")
  private List<Colaborador> colaborador;

}
