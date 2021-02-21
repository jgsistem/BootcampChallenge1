package pe.com.bootcamp.controller;

import java.util.List;
import net.bytebuddy.asm.Advice.Unused;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.bootcamp.entity.Cliente;
import pe.com.bootcamp.service.ClienteService;

@RestController
@RequestMapping("api")
public class ClienteController {

@Autowired
ClienteService clienteService;

  @GetMapping("/obenerCliente")
  public ResponseEntity obtenerCliente(){
    List<Cliente> resultCliente = clienteService.findAll();
    return  ResponseEntity.ok(resultCliente);
  }

  @GetMapping("/obenerClienteDni/{dni}")
  public ResponseEntity obtenerCliente(@PathVariable Integer dni)throws Exception{
    Cliente resultCliente = clienteService.getClienteDni(dni);
    return  ResponseEntity.ok(resultCliente);
  }
}
