package pe.com.bootcamp.entity;
import javax.persistence.*;

@Entity
public class Tarjeta {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long idtarjeta;

  private long idcliente;
  private String tarjeta;
  private String numtarjeta;
  private Integer estado;

  public long getIdtarjeta() {
    return idtarjeta;
  }

  public void setIdtarjeta(long idtarjeta) {
    this.idtarjeta = idtarjeta;
  }

  public long getIdcliente() {
    return idcliente;
  }

  public void setIdcliente(long idcliente) {
    this.idcliente = idcliente;
  }

  public String getTarjeta() {
    return tarjeta;
  }

  public void setTarjeta(String tarjeta) {
    this.tarjeta = tarjeta;
  }

  public String getNumtarjeta() {
    return numtarjeta;
  }

  public void setNumtarjeta(String numtarjeta) {
    this.numtarjeta = numtarjeta;
  }

  public Integer getEstado() {
    return estado;
  }

  public void setEstado(Integer estado) {
    this.estado = estado;
  }
}
