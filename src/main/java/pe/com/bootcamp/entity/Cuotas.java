package pe.com.bootcamp.entity;
import javax.persistence.*;

@Entity
public class Cuotas {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long idcuotas;
  private Integer estado;

  public long getIdcuotas() {
    return idcuotas;
  }

  public void setIdcuotas(long idcuotas) {
    this.idcuotas = idcuotas;
  }

  public Integer getEstado() {
    return estado;
  }

  public void setEstado(Integer estado) {
    this.estado = estado;
  }
}
