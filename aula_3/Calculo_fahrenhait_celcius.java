/**
 * 
 */
package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author cloud
 *
 */
public class Calculo_fahrenhait_celcius {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double f,c;
		Scanner teclado = new Scanner (System.in);
		DecimalFormat formatador = new DecimalFormat ("#0.0");
		System.out.println("Conversão de temperatura");
		System.out.print("Digite a temperatura em fahrenhait: ");
		f = teclado.nextDouble();
		
		c = (5 * (f - 32 )) / 9;
		System.out.println("Temperatura em Celcius " + formatador.format(c) + "°C");
		teclado.close();
		
		
		

	}

}
