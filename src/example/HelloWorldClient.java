package example;

import mypackage.WebServiceService;

public class HelloWorldClient {
  public static void main(String[] argv) {
      mypackage.WebService service = new WebServiceService().getWebServicePort();
      //invoke business method

      int num=service.getavailableSeats("70","2017-11-11");
      String res=service.getSeatPrice("lahore","peshawar");
      System.out.println("Total Seats: "+num);
      System.out.println("Price: "+res);
  }
}
