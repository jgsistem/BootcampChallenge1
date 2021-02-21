package pe.com.bootcamp.entity;
import javax.persistence.*;

@Entity
public class Tea {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long idtea;
  private String tea;
  private Integer estado;

  public long getIdtea() {
    return idtea;
  }

  public void setIdtea(long idtea) {
    this.idtea = idtea;
  }

  public String getTea() {
    return tea;
  }

  public void setTea(String tea) {
    this.tea = tea;
  }

  public Integer getEstado() {
    return estado;
  }

  public void setEstado(Integer estado) {
    this.estado = estado;
  }
}
