package pe.com.bootcamp.common;

public class RequestBaseDto {
  protected RequestBodyType requestBodyType;

  public RequestBodyType getRequestBodyType() {
    return requestBodyType;
  }

  public void setRequestBodyType(RequestBodyType requestBodyType) {
    this.requestBodyType = requestBodyType;
  }
}
