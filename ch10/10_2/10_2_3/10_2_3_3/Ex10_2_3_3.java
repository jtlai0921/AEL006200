import java.net.*;
import java.io.*;

public class Ex10_2_3_3 {
  ServerSocket  SS; 

  public Ex10_2_3_3() {
     try{
         SS = new ServerSocket(1234);
         System.out.println("Server created.");
      }
     finally {
         System.out.println("In finally");
      }
  }

  public static void main(String args[]){
         Ex10_2_3_3 ServerStart=new Ex10_2_3_3();
  }
}
