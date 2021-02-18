package pe.com.bootcamp.entity;
import javax.persistence.*;

@Entity
public class Cuotas {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id_cuotas;
  private Integer estado;

  public long getId_cuotas() {
    return id_cuotas;
  }

  public void setId_cuotas(long id_cuotas) {
    this.id_cuotas = id_cuotas;
  }

  public Integer getEstado() {
    return estado;
  }

  public void setEstado(Integer estado) {
    this.estado = estado;
  }
}
