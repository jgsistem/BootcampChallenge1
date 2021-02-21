package pe.com.bootcamp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.com.bootcamp.entity.Cliente;

public interface ClienteServiceRepository extends JpaRepository<Cliente,Long> {
  Cliente findByDni(Integer dni);
}
