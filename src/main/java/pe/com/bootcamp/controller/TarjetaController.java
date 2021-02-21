package pe.com.bootcamp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.bootcamp.entity.Tarjeta;
import pe.com.bootcamp.service.TarjetaService;

@RestController
@RequestMapping("api")
public class TarjetaController {

  @Autowired
  TarjetaService tarjetaService;

  @GetMapping("/obtenerTarjeta/")
  public ResponseEntity obtenerTarjetas(){
    List<Tarjeta> resultTarjeta = tarjetaService.findAll();
    return ResponseEntity.ok(resultTarjeta);
  }

  @GetMapping("/obenerTarjetaporIdCliente/{idcliente}")
  public ResponseEntity obtenerTarjetaporId(@PathVariable Long idcliente) throws Exception
  {
    Tarjeta resultTarjeta = tarjetaService.getTarjetaIdcliente(idcliente);
    return  ResponseEntity.ok(resultTarjeta);
  }

  @GetMapping("/obenerTarjetaporIdTarjeta/{idtarjeta}")
  public ResponseEntity obtenerTarjetaId(@PathVariable Long idtarjeta) throws Exception
  {
    Tarjeta resultTarjetaId = tarjetaService.getTarjetaIdtarjeta(idtarjeta);
    return  ResponseEntity.ok(resultTarjetaId);
  }
}
