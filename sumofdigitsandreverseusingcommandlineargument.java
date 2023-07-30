// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class sumofdigitsandreverseusingcommandlineargument {
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        int s=0,r=0,t=n,d;
        while(t!=0){
            d=t%10;s=s+d;r=r*10+d;t=t/10;
        }
        System.out.println("Sum of digits:"+s);
        System.out.println("Reverse:"+r);

    }
}