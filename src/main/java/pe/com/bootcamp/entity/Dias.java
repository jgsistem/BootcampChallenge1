package pe.com.bootcamp.entity;
import javax.persistence.*;

@Entity
public class Dias {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long iddias;
  private Integer dia;
  private Integer estado;

  public long getIddias() {
    return iddias;
  }

  public void setIddias(long iddias) {
    this.iddias = iddias;
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
