package co.edu.unisabana.example.infraestructure.orm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "usuario")
@Data
public class UsuarioORM {

  @Id
  @Column
  private Integer id;

  @Column
  private String nombre;
}
