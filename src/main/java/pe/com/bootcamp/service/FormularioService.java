package pe.com.bootcamp.service;

import java.util.List;
import org.springframework.http.ResponseEntity;
import pe.com.bootcamp.entity.Formulario;

public interface FormularioService {
  Formulario simulacion(Formulario formulario) throws Exception;

}
