package pe.com.bootcamp.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.com.bootcamp.entity.Cuotas;
@Repository
public interface CuotasRepository extends JpaRepository<Cuotas, Long> {

}