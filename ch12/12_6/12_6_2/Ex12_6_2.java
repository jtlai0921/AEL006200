import java.io.*;

class Ex12_6_2 {
   public static void main(String args[])throws Exception {
      if (args.length < 1) {
         System.out.println("Usage: java Ex12_6_2 [fileName]");
         System.exit(1);
      }
	  
      String fileName = args[0];
      FileOutputStream fos=new FileOutputStream(fileName);
      DataOutputStream dos = new DataOutputStream(fos);

      String line= "Test for DataOutputStream  �������";
      dos.write(line.getBytes());
      dos.close();
   }
}