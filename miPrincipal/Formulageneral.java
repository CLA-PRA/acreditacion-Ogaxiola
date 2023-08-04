package miPrincipal;

public class Formulageneral {

    public double raiz1(double a, double b, double c) {
        return ((-b+(Math.sqrt((b*b)-4*a*c)))/(2*a));
    }

    public double raiz2(double a, double b, double c) {
        return ((-b-(Math.sqrt((b*b)-4*a*c)))/(2*a));
    }
    
  
}