package miPrincipal;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        Formulageneral d = new Formulageneral();
        double a,b,c;

        Scanner consola = new Scanner(System.in);

        System.out.println("Encontrar raices de un polinomio ax^2 + bx + c = 0 con la fórmula general");
        System.out.println("======================");

        System.out.print("Introduce el valor de a:");
        a = consola.nextDouble();
        
        System.out.print("Introduce el valor de b:");
        b = consola.nextDouble();

        System.out.print("Introduce el valor de c:");
        c = consola.nextDouble();


        consola.close();
    }
}