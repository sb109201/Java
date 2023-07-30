import java.io.*;
public class centtofer{
public static void main(String args[]){
 Console c =System.console();
 System.out.println("Enter temparature in Ferhenheit");
 double f=Double.parseDouble(c.readLine());
 double tc=(5*(f-32))/9;
System.out.println("Temparature in centrigrade"+ tc);
}
}

