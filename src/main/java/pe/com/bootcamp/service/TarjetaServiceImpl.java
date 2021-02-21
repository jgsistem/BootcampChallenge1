package pe.com.bootcamp.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import pe.com.bootcamp.entity.Tarjeta;
import pe.com.bootcamp.repository.TarjetaRepository;

@Service
public class TarjetaServiceImpl implements TarjetaService {

  @Autowired
  TarjetaRepository tarjetaRepository;

  @Override
  public List<Tarjeta> findAll()  {
        return tarjetaRepository.findAll();
  }
}
