package main;

import some.Filter;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService()
public class Main {
  public static void main(String[] argv) {
    String address = "http://localhost:8090/filter";
    Endpoint.publish(address, new Filter());
  }
}
