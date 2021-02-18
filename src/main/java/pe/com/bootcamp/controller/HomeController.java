package pe.com.bootcamp.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.bootcamp.entity.Tarjeta;
import pe.com.bootcamp.service.TarjetaService;

@RestController
@RequestMapping("api")
public class HomeController {

  @Autowired
  private TarjetaService tarjetaService;

  @RequestMapping("/")
  public String home(){
    return "Hello Worlds!";
  }

  @GetMapping("/obtenerTarjeta/")
  public Map obtenerSimulacion(){
    Map resultMap = tarjetaService.getTarjetaMap();
    return resultMap;
  }

}
