package pe.com.bootcamp.entity;
import javax.persistence.*;

@Entity
public class Dias {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id_dias;
  private Integer dia;
  private Integer estado;

  public long getId_dias() {
    return id_dias;
  }

  public void setId_dias(long id_dias) {
    this.id_dias = id_dias;
  }

  public Integer getDia() {
    return dia;
  }

  public void setDia(Integer dia) {
    this.dia = dia;
  }

  public Integer getEstado() {
    return estado;
  }

  public void setEstado(Integer estado) {
    this.estado = estado;
  }
}
