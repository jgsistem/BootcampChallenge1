package pe.com.bootcamp.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.com.bootcamp.entity.Tea;

@Repository
public interface TeaRepository extends JpaRepository<Tea,Long> {

}
