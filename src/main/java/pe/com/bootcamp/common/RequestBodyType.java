package pe.com.bootcamp.common;

public enum  RequestBodyType {
  VALID {
    public String toString() {
      return "VALID";
    }
  },
  INVALID {
    public String toString() {
      return "INVALID";
    }
  },
}