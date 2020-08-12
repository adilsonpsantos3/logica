package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Valorhora {

	public static void main(String[] args) {
		//Adilson
		
		double remuneracao,custo,hora;
		int cargaHoraria;
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		//entrada
		System.out.println("Calculo do valor da hoar de serviço");
		System.out.print("Remuneracao mensal pretendida");
		remuneracao = teclado.nextDouble();
		System.out.print("Custo operacional");
		custo = teclado.nextDouble();
		System.out.print("Carga horaria mensal de trabalho");
		cargaHoraria = teclado.nextInt();
		//processamento
		hora = (remuneracao + (0.3 * remuneracao) + custo + ( 0.2 * remuneracao)) / cargaHoraria;
		
		//saida
		System.out.println("Valor da hora:" + formatador.format(hora));
		
		
		
		
		
		
		
		teclado.close();

	}

}
