import java.io.*;
class sumofseriesr{
 public static void main(String a[]){
   Console c=System.console();
   //double s=0.0;
   System.out.println("Enter n");
   int n=Integer.parseInt(c.readLine());
    double s=0.0,l=0;
   for(int i=1;i<=n;i++){
     s=s+(double)1/i;
   }
   System.out.println("Sum of series"+s);
 }
}
  
