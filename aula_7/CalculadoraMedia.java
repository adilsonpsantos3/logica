package exercicios;

import java.util.Scanner;
/**
 * @author Adilson Santos
 *
 */
public class CalculadoraMedia {

	public static void main(String[] args) {
		// vari�veis
        String nome;
        double nota1,nota2,media;
        //objetos
        Scanner teclado = new Scanner(System.in);
        //Entrada
        System.out.print("Digite o seu nome:");
        nome = teclado.nextLine();
        System.out.print("Digite a nota1:");
        nota1 = teclado.nextDouble();
        System.out.print("Digite a nota2:");
        nota2 = teclado.nextDouble();
        //Processamento
        media = (nota1 + nota2) /2;
        //saida
        System.out.println("======================");
        System.out.println("== C�lculo da M�dia ==");
        System.out.println("======================");
        System.out.println("");
        System.out.println("Nome:" + nome);
        System.out.println("M�dia: " + media);
        //estrutura de controle
        if(media < 5) {
        	System.out.println("REPORVADO");
        } else {
        	System.out.println("APROVADO");
        }
        teclado.close();
        
        
	}

}
