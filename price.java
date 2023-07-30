import java.io.*;
class price{
 public static void main(String x[]){
  Console c =System.console();
  System.out.println("Enter prices");
  double r=Double.parseDouble(c.readLine());
  double p=r*100;
  System.out.println("Read paise"+p);
 }
}
