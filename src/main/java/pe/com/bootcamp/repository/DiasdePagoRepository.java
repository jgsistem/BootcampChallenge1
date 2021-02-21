package pe.com.bootcamp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.com.bootcamp.entity.Dias;

public interface DiasdePagoRepository extends JpaRepository<Dias,Long> {

}
