package pe.com.bootcamp.entity;
import java.util.Date;

public class Formulario {
  private Integer dni;
  private String tarjeta;
  private String moneda;
  private Integer monto;
  private double cuota;
  private String tea;
  private Integer diapago;
  private String fechacompra;
  private String primeracuota;
  private String estado;

  public Integer getDni() {
    return dni;
  }
  public String getFechacompra() {
    return fechacompra;
  }
  public void setFechacompra(String fechacompra) {
    this.fechacompra = fechacompra;
  }

  public void setDni(Integer dni) {
    this.dni = dni;
  }

  public String getTarjeta() {
    return tarjeta;
  }

  public void setTarjeta(String tarjeta) {
    this.tarjeta = tarjeta;
  }

  public String getMoneda() {
    return moneda;
  }

  public void setMoneda(String moneda) {
    this.moneda = moneda;
  }

  public Integer getMonto() {
    return monto;
  }

  public void setMonto(Integer monto) {
    this.monto = monto;
  }

  public double getCuota() {
    return cuota;
  }

  public void setCuota(double cuota) {
    this.cuota = cuota;
  }

  public String getTea() {
    return tea;
  }

  public void setTea(String tea) {
    this.tea = tea;
  }

  public Integer getDiapago() {
    return diapago;
  }

  public void setDiapago(Integer diapago) {
    this.diapago = diapago;
  }

  public String getPrimeracuota() {
    return primeracuota;
  }

  public void setPrimeracuota(String primeracuota) {
    this.primeracuota = primeracuota;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }
}
