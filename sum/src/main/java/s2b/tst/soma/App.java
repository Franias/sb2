package s2b.tst.soma;
import java.util.Scanner;

public class App {
	public static void main( String[] args){
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf ("Escreva 2 numeros\n");
		double a = entrada.nextDouble();
		double b = entrada.nextDouble();
		
		entrada.close();
		double r = Sum.sum(a,b);
		
		System.out.printf ("SUM= %.2f\n", r);
	}

}
