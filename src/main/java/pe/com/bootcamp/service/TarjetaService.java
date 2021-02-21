package pe.com.bootcamp.service;
import java.util.List;
import pe.com.bootcamp.entity.Cliente;
import pe.com.bootcamp.entity.Tarjeta;

public interface TarjetaService {
      List<Tarjeta> findAll();
      Tarjeta getTarjetaIdcliente(long idcliente);
      Tarjeta getTarjetaIdtarjeta(long idtarjeta);
}
