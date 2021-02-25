package pe.com.bootcamp.common;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import pe.com.bootcamp.entity.Cliente;

public class Constants {

  public String devolverFecha()  {
    Date Date = new Date();
    SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
    return sf.format(Date);
  }

  public String quitarValor(String tea)  {
     int intIndex = tea.indexOf("%");
     String cortar = "";
     if(intIndex >= 0){
       cortar = tea.substring(0,intIndex);
      }else{
       cortar = "1";
    }
    return cortar;
  }

  public String convertFecha(String fechasimu) throws ParseException {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
    LocalDate localDate = LocalDate.parse(fechasimu, formatter);
    return localDate.plusMonths(1).format(formatter);
  }
}
