package exercicios;
//adilson
import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculadoraIMC_atividade {

	public static void main(String[] args) {
		
		String nome;
		//tipo de variáveis
		double peso,altura,imc;
		//dispositvos de entrada
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		System.out.print("Digite seu nome :");
		nome = teclado.nextLine();
		System.out.print("Digite seu peso :");
		peso = teclado.nextDouble();
		System.out.print("Digite sua altura :");
		altura = teclado.nextDouble();
		//Processamento
		imc = peso / (altura * altura);
		System.out.println("====================");
		System.out.println("Nome:" + nome);
		System.out.println("Seu imc é de:" + formatador.format(imc));
		
		if (imc < 17) {
			System.out.println("Resultado: Muito abaixo do peso");
		} else if (imc >= 17 && imc < 18.5) {
			System.out.println("Resultado: Abaixo do peso");
		} else if (imc >= 18.5 && imc < 24.99) {
			System.out.println("Resultado: Peso normal");
		} else if (imc >= 25 && imc < 29.99) {
			System.out.println("Resultado: Acima do peso");
		} else if (imc >= 30 && imc < 34.99) {
			System.out.println("Resultado: Obesidade I");
		} else if (imc >= 35 && imc < 40) {
			System.out.println("Resultado: Obesidade II (Severa)");
		} else {
			System.out.println("Resultado: Obesidade III (Mórbida)");
		}
		
     teclado.close();		
		}	

	}


