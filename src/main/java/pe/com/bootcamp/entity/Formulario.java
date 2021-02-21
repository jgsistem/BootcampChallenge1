package pe.com.bootcamp.entity;

import pe.com.bootcamp.common.RequestBaseDto;

public class Formulario extends RequestBaseDto {
  private Integer dni;
  private String tarjeta;
  private String moneda;
  private Integer monto;
  private Integer cuota;
  private double tea;
  private Integer diapago;

  private String primeracuota;
  private String estado;

  public Integer getDni() {
    return dni;
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

  public Integer getCuota() {
    return cuota;
  }

  public void setCuota(Integer cuota) {
    this.cuota = cuota;
  }

  public double getTea() {
    return tea;
  }

  public void setTea(double tea) {
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
