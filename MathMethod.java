import java.util.Scanner;
class MathMethod
{  
    public static void getF(int x,int fx)
       { 
         Scanner sc = new Scanner(System.in);
         Scanner sb = new Scanner(System.in);
         System.out.print("Enter x = ");
         x = sc.nextInt();
         fx = x+5;
         System.out.print("f(x) = "+fx);
         System.out.println();
       }
     public static void getG(int x,int fx,int y,int gxy)
       {
         Scanner sd = new Scanner(System.in);
         fx = x+5;
         System.out.print("Enter y = ");
         y = sd.nextInt();
         gxy = x+y;
         System.out.print("g(x) = "+gxy);
         System.out.println();
       }
      public static void getH(int x,int fx,int hx)
       {
         Scanner st = new Scanner(System.in);
         fx = x+5;
         hx=x+fx;
         System.out.println();
         System.out.println("h(x) = "+hx);
         System.out.println();
       }
    public static void main (String[]args)
       {
         int x = 0; 
         int fx = 0; 
         int y = 0;
         int gxy = 0;
         int hx = 0;
         getF(x,fx);
         getG( x,fx,y,gxy);
         getH( x,fx,hx);
       }
}
