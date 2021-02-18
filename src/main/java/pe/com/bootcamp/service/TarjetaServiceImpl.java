package pe.com.bootcamp.service;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import pe.com.bootcamp.entity.Tarjeta;
import pe.com.bootcamp.repository.TarjetaRepository;

@Service
public class TarjetaServiceImpl implements TarjetaService {

  @Autowired
  TarjetaRepository tarjetaRepository;

  public List<Tarjeta> findAll() {
    return tarjetaRepository.findAll();
  }
  public Map<String, Object> getTarjetaMap() {
    Map<String, Object> tasaDeInteresMap = new HashMap<String, Object>();
    for (Tarjeta tarjeta : findAll()) {
      tasaDeInteresMap.put(tarjeta.getTarjeta(),tarjeta.getEstado());
    }
    return tasaDeInteresMap;
  }
}
