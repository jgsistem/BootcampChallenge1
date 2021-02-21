package pe.com.bootcamp.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.bootcamp.common.ApiResponseHandler;
import pe.com.bootcamp.entity.Formulario;
import pe.com.bootcamp.service.FormularioService;

@RestController
@RequestMapping("api")
public class FormularioController {

  @Autowired
  private FormularioService formularioService;

  @Autowired
  private ApiResponseHandler apiResponseHandler;

  @PostMapping(path = "/simulacion", consumes = "application/json", produces = "application/json")
  public ResponseEntity<Object> simulacion(@RequestBody Formulario formulario) throws Exception{
    boolean status = false;
    try {
         Formulario newformulario = formularioService.simulacion(formulario);
      return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(newformulario);
    } catch (IllegalArgumentException ex) {
      return new ResponseEntity<Object>(apiResponseHandler.getApplicationError(ex.getMessage()),
          HttpStatus.BAD_REQUEST);
    } catch (Exception ex) {
      return new ResponseEntity<Object>(apiResponseHandler.getApplicationException(),
          HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }
}
