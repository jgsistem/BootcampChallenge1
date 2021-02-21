package pe.com.bootcamp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.bootcamp.entity.Cliente;
import pe.com.bootcamp.repository.ClienteServiceRepository;

@Service
public class ClienteServiceImpl implements ClienteService {

  @Autowired
  ClienteServiceRepository clienteServiceRepository;

  @Override
  public List<Cliente> findAll() {
    return clienteServiceRepository.findAll();
  }
}
