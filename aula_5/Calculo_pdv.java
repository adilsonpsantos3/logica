package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

//Adilson
public class Calculo_pdv {

	public static void main(String[] args) {
		
double vt,d,vp;
Scanner teclado = new Scanner(System.in);
DecimalFormat formatador = new DecimalFormat("#0.00");

System.out.println("Ponto de Vendas");
System.out.println("vp = vt * d:");
System.out.println("Digite o valor total:");
vt = teclado.nextDouble();
System.out.print("Digite o desconto:");
d = teclado.nextDouble();
vp = (vt * d) / 100; 
System.out.println( vt + "% de " + d + " = " + formatador.format(vp));
teclado.close();


	}

}
