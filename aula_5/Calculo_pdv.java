package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

//Adilson
public class Calculo_pdv {

	public static void main(String[] args) {
		
double v,d,troco;
Scanner teclado = new Scanner(System.in);
DecimalFormat formatador = new DecimalFormat("#0.00");

System.out.println("Ponto de Vendas");
System.out.println("troco = v * d:");
System.out.println("Digite o valor:");
v = teclado.nextDouble();
System.out.print("Digite o desconto:");
d = teclado.nextDouble();
troco = (v * d) / 100; 
System.out.println( v + "% de " + d + " = " + formatador.format( troco));
teclado.close();


	}

}						
