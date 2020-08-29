package exercicios;


import java.util.Scanner;

public class NumerosAleatorios {

	public static void main(String[] args) {
		// @Adilson Santos
		
		//entrada
		Scanner input = new Scanner(System.in);
		//variáveis
		boolean acertou = false;
		int tentativas = 10;
		int numeroSecreto = (int) (Math.random() * 50 + 1);
		long chute = 0;
		
		//processamento
		while(tentativas>0 && acertou == false){
		   System.out.println("Qual é o seu chute?");
		chute = input.nextLong();
			
		//saida
		if(numeroSecreto == chute) {
		   System.out.println("Você acertou!!");
		acertou = true;
	        }else if(chute<numeroSecreto) {
		--tentativas;
		   System.out.println("Numero muito pequeno " + tentativas +" tentativas restantes");
		--tentativas;  
	        }else {
		--tentativas; 
	           System.out.println("Numero muito grande " + tentativas + " tentativas restantes");
			
		}
		}
		input.close();
		}
                }
