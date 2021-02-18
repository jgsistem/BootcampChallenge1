package pe.com.bootcamp.entity;
import javax.persistence.*;

@Entity
public class Tea {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id_tea;
  private String tea;
  private Integer estado;

  public long getId_tea() {
    return id_tea;
  }

  public void setId_tea(long id_tea) {
    this.id_tea = id_tea;
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
