package pe.com.bootcamp.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.com.bootcamp.entity.Cliente;
import pe.com.bootcamp.entity.Tarjeta;
@Repository
public interface TarjetaRepository extends JpaRepository<Tarjeta, Long> {
  Tarjeta findByIdtarjeta(long idtarjeta);
  Tarjeta findByIdcliente(long idcliente);
}

