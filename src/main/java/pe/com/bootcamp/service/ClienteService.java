package pe.com.bootcamp.service;
import java.util.List;
import pe.com.bootcamp.entity.Cliente;

public interface ClienteService {
  List<Cliente> findAll();
  Cliente getClienteDni(Integer dni);
}
