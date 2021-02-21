package pe.com.bootcamp.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.bootcamp.entity.Cliente;
import pe.com.bootcamp.entity.Cuotas;
import pe.com.bootcamp.entity.Dias;
import pe.com.bootcamp.entity.Tarjeta;
import pe.com.bootcamp.entity.Tea;
import pe.com.bootcamp.service.ClienteService;
import pe.com.bootcamp.service.CuotasService;
import pe.com.bootcamp.service.DiasdePagoService;
import pe.com.bootcamp.service.TarjetaService;
import pe.com.bootcamp.service.TeaService;

@RestController
@RequestMapping("api")
public class HomeController {

  @Autowired
  private TarjetaService tarjetaService;

  @Autowired
  private CuotasService cuotasService;

  @Autowired
  private TeaService teaService;

  @Autowired
  private DiasdePagoService diasdePagoService;

  @Autowired
  private ClienteService clienteService;

  @RequestMapping("/")
  public String home(){
    return "Hello Worlds!";
  }

  @GetMapping("/obtenerTarjeta/")
  public ResponseEntity obtenerTarjetas(){
    List<Tarjeta> resultTarjeta = tarjetaService.findAll();
    return ResponseEntity.ok(resultTarjeta);
  }
  @GetMapping("/obtenerCuotas/")
  public ResponseEntity obtenerCuotas(){
    List<Cuotas> resultCuotas = cuotasService.findAll();
    return ResponseEntity.ok(resultCuotas);
  }

  @GetMapping("/obtenerTea")
  public ResponseEntity obtenerTea(){
    List<Tea> resultTea = teaService.findAll();
    return  ResponseEntity.ok(resultTea);
  }

  @GetMapping("/obenerDiasdePago")
  public ResponseEntity obtenerDias(){
    List<Dias> resultDias = diasdePagoService.findAll();
    return ResponseEntity.ok(resultDias);
  }

  @GetMapping("/obenerCliente")
  public ResponseEntity obtenerCliente(){
    List<Cliente> resultCliente = clienteService.findAll();
    return  ResponseEntity.ok(resultCliente);
  }
}
