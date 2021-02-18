package pe.com.bootcamp.entity;
import javax.persistence.*;

@Entity
public class Tarjeta {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id_tarjeta;

  private long id_cliente;
  private String tarjeta;
  private Integer num_tarjeta;
  private Integer estado;

  public long getId_tarjeta() {
    return id_tarjeta;
  }

  public void setId_tarjeta(long id_tarjeta) {
    this.id_tarjeta = id_tarjeta;
  }

  public long getId_cliente() {
    return id_cliente;
  }

  public void setId_cliente(long id_cliente) {
    this.id_cliente = id_cliente;
  }

  public String getTarjeta() {
    return tarjeta;
  }

  public void setTarjeta(String tarjeta) {
    this.tarjeta = tarjeta;
  }

  public Integer getNum_tarjeta() {
    return num_tarjeta;
  }

  public void setNum_tarjeta(Integer num_tarjeta) {
    this.num_tarjeta = num_tarjeta;
  }

  public Integer getEstado() {
    return estado;
  }

  public void setEstado(Integer estado) {
    this.estado = estado;
  }
}
