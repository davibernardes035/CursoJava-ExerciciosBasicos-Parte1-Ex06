import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double a,b,c;
        double tri, circ, pi, trap, quad, retan;
        pi = 3.14159;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        tri = a * c / 2;
        circ = pi * Math.pow(c, 2.0);
        trap = (a + b) * c / 2;
        quad = Math.pow(b, 2.00);
        retan = a * b;

        System.out.printf("TRIANGULO = %.3f%n", tri);
        System.out.printf("CIRCULO = %.3f%n", circ);
        System.out.printf("TRAPEZIO = %.3f%n", trap);
        System.out.printf("QUADRADO = %.3f%n", quad);
        System.out.printf("RETANGULO = %.3f%n", retan);

        sc.close();
    }
}