package pe.com.bootcamp.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.bootcamp.entity.Tea;
import pe.com.bootcamp.repository.TeaRepository;

@Service
public class TeaServiceImpl implements TeaService {

  @Autowired
  TeaRepository teaRepository;

  @Override
  public List<Tea> findAll() {
    return teaRepository.findAll();
  }
}
