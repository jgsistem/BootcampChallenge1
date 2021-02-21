package pe.com.bootcamp.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import pe.com.bootcamp.entity.Cuotas;
import pe.com.bootcamp.entity.Tarjeta;
import pe.com.bootcamp.repository.CuotasRepository;
import pe.com.bootcamp.repository.TarjetaRepository;

@Service
public class CuotasServiceImpl implements CuotasService {
  @Autowired
  CuotasRepository cuotasRepository;

  @Override
  public List<Cuotas> findAll() {
    return cuotasRepository.findAll();
  }
}
