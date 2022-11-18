package prj.tst.sandbox2;

public class Equation {
  private double a;
  private double b;
  private double c;

  private int n;

  public Equation(double a, double b, double c){



    this.a = a;
    this.b = b;
    this.c = c;

    if (a==0) {
      System.out.println("это вырожденное уравнение");
    }
    
    double d=b*b-4*a*c;
    if (d>0) {
     n=2;
   }
    if (d == 0) {
        n = 1;
    }
    if (d<0) {
        n = 0;
    }



   }

   public int rootNumber() {
    return n;
   }
}
