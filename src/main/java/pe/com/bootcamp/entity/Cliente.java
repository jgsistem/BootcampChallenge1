package pe.com.bootcamp.entity;
import javax.persistence.*;

@Entity
public class Cliente {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id_cliente;
  private Integer dni;
  private String nombre;
  private String apellidos;
  private Integer estado;

  public long getId_cliente() {
    return id_cliente;
  }

  public void setId_cliente(long id_cliente) {
    this.id_cliente = id_cliente;
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
