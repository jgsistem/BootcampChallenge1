package pe.com.bootcamp.entity;
import javax.persistence.*;
import pe.com.bootcamp.common.RequestBaseDto;

@Entity
public class Cliente extends RequestBaseDto {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long idcliente;
  private Integer dni;
  private String nombre;
  private String apellidos;
  private Integer estado;

  public long getIdcliente() {
    return idcliente;
  }

  public void setIdcliente(long idcliente) {
    this.idcliente = idcliente;
  }

  public Integer getDni() {
    return dni;
  }

  public void setDni(Integer dni) {
    this.dni = dni;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellidos() {
    return apellidos;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  public Integer getEstado() {
    return estado;
  }

  public void setEstado(Integer estado) {
    this.estado = estado;
  }



}
