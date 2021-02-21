package pe.com.bootcamp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.bootcamp.entity.Dias;
import pe.com.bootcamp.repository.DiasdePagoRepository;
import pe.com.bootcamp.repository.TeaRepository;

@Service
public class DiasdePagoServiceImpl implements DiasdePagoService {

  @Autowired
  DiasdePagoRepository diasdePagoRepository;

  @Override
  public List<Dias> findAll() {
    return diasdePagoRepository.findAll();
  }
}
