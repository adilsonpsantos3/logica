/**
 * 
 */
package exercicios;

import java.util.Scanner;

/**
 * @author Adilson Santos
 *
 */
public class Calculadora_IMC {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String nome;
		double peso,altura,imc;
		Scanner teclado = new Scanner(System.in);
		//entrada
		System.out.print("Digite seu nome:");
		nome = teclado.nextLine();
		System.out.print("Digite seu peso:");
		 peso = teclado.nextDouble();
		 System.out.print("Digite sua altura:");
		 altura = teclado.nextDouble();
		 //processamento
		 imc = peso / (altura * altura);
		 //saida
		 System.out.println("===========================");
		 System.out.println("Nome:" + nome);
		 System.out.println("Seu imc é de:" + imc);
		 teclado.close();
		
	}

}
