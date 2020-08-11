package exercicios;


import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculo_porcentagem {
//Adilson Santos
	public static void main(String[] args) {
		
		double x,y,valor ;
		
		Scanner teclado = new Scanner(System.in);
		
		DecimalFormat formatador = new DecimalFormat("#0.00");
		
		System.out.println("Regra de tres");
		System.out.println("x% de y = valor");
		System.out.print("Digite o valor x :");
		x = teclado.nextDouble();
		System.out.println("Digite o valo de y :");
		y = teclado.nextDouble();
		
		valor = (x * y ) / 100;
		
		System.out.println(x +"% de " + y + " = " + formatador.format(valor));
		teclado.close();
		

	}

}
