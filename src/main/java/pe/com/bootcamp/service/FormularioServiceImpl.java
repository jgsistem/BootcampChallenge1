package pe.com.bootcamp.service;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import pe.com.bootcamp.common.Notification;
import pe.com.bootcamp.common.RequestBodyType;
import pe.com.bootcamp.entity.Cliente;
import pe.com.bootcamp.entity.Formulario;
import pe.com.bootcamp.entity.Tarjeta;
import pe.com.bootcamp.repository.ClienteServiceRepository;
import pe.com.bootcamp.repository.TarjetaRepository;

@Service
public class FormularioServiceImpl implements FormularioService {

  @Autowired
  ClienteServiceRepository clienteServiceRepository;

  @Autowired
  TarjetaRepository tarjetaRepository;

  @Transactional
  public Formulario simulacion(Formulario formulario) throws Exception
 {
   Formulario newormulario = new Formulario();
    Cliente cliente = clienteServiceRepository.findByDni(formulario.getDni());
   Notification notification = this.validation(cliente);
   if (notification.hasErrors()) {
     throw new IllegalArgumentException(notification.errorMessage());
   }
   else
   {
     Tarjeta tarjeta = tarjetaRepository.findByIdcliente(cliente.getIdcliente());
       if (tarjeta.getTarjeta().equals(formulario.getTarjeta())){
         newormulario.setDni(formulario.getDni());
         newormulario.setTarjeta(formulario.getTarjeta());
         newormulario.setCuota((int) (formulario.getMonto() * formulario.getTea()));
         newormulario.setMoneda(formulario.getMoneda());
         newormulario.setTea(formulario.getTea());
         newormulario.setPrimeracuota("12/12/2020");
         newormulario.setEstado("exitoso");
       }
       else
       {
         newormulario.setEstado("Nombre de la Tarjeta, no correspónde al cliente");
       }
   }
     return newormulario;
 }

  private Notification validation(Cliente cliente) {
    Notification notification = new Notification();
    if (cliente == null || cliente.getRequestBodyType() == RequestBodyType.INVALID) {
      notification.addError("DNI no cuenta con Tarjeta");
    }
    return notification;
  }
}
