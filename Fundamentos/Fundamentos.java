package exercicios;

public class Fundamentos {

	public static void main(String[] args) {
		// Adilson 
		String nome;
		int  idade = 45;
		char sexo = 'M';
		double temperatura = 27.4;
		boolean arCondicionado = false ;		
		nome = "Adilson" ;
		System.out.println("Uso de váraiveis na linguagem Java");
		System.out.println("Exemplos");
		System.out.println("Nome:" + nome );
		System.out.println("Idade:" + idade );
		System.out.println("Sexo:" + sexo );
		System.out.println("Temperatura:" + temperatura );
		System.out.println("Ar Condicionado:" + arCondicionado );
		System.out.println("__________________________________");
		System.out.println("");
		double i = 10 ;
		System.out.println("Operadores Aritiméticos e Atribuições");
		System.out.println("Exemplos");
		System.out.println(" i = " + i);
		System.out.println(" i = " + i + " + 5 | i = " + (i + 5));
		System.out.println(" i = " + i + " - 5 | i = " + (i - 5));
		System.out.println(" i = " + i + " * 5 | i = " + (i * 5));
		System.out.println(" i = " + i + " / 5 | i = " + (i / 5));
		System.out.println(" i = " + i + " % 5 | i = " + (i % 5));
		System.out.println("i + = 5 +      |i = " + (i += 5));
	        System.out.println("i - = 5 +      |i = " + (i -= 5)); 
	        System.out.println("i * = 5 +      |i = " + (i *= 5)); 
	        System.out.println("i / = 5 +      |i = " + (i /= 5)); 
	        i++ ;
	        System.out.println("i++            |i = " + i); 
	        i--;
	        System.out.println("i--            |i = " + i); 
	        System.out.println("__________________________________");
		System.out.println("ESTRURAS DE CONTROLE");
		System.out.println("__________________________________");
		System.out.println("Estruturas de controle condicional");
		System.out.println("__________________________________");
		System.out.println("Exemplo 1 - Uso do 'if'");
		if (sexo == 'M') 
		System.out.println("");
		System.out.println("Exemplo 2 - Uso do 'if - else'");
		if (idade <18) {
			System.out.println("Menor de idade");
		}else {
			System.out.println("Maior de idade");
		}
		System.out.println("");
		System.out.println("Exemplo 3 - Uso do 'else - if'");
				if (idade < 16) {
	        System.out.println("PRFOIBIDO VOTAR");
	        } else if (idade >= 18 && idade <= 70) {
	    	System.out.println("VOTO OBRIGATÓRIO");
	        } else if (idade == 16 || idade == 17 || idade > 70) {
	    	System.out.println("VOTO FACULTATIVO");
	    	}
		System.out.println("");
		System.out.println("Exemplo 3 - Uso do 'Switch case'");
	        System.out.println("1. Cadastro de clientes");
	        System.out.println("2. Cadastro de usuários");
	        System.out.println("3. Relatórios");
	        int opcao = 1;
	        switch (opcao) {
	        case 1:
	        System.out.println("CLIENTE");
	        break;
	        case 2:
	        System.out.println("USUÁRIOS");
	        break;
	        case 3:
	        System.out.println("RELATÓRIOS");
	        break;
	        default:
	        System.out.println("Opção inválida");
		break;
	        }
	        System.out.println("__________________________________");
	   	System.out.println("Estruturas de repetições");
	   	System.out.println("__________________________________");
	   	System.out.println("Exemplo 5 - Uso do 'for'");
	   	for (int j = 10; j > 0; j--) {
	   	System.out.println("hello");
	   	}
	   	System.out.println("__________________________________");
	        System.out.println("Exemplo 6 - Tabuada");
	        for (int tabuada = 0; tabuada <= 10; tabuada ++) {
	        System.out.println();
	        for (int valor = 0; valor <= 10; valor ++) {
	        System.out.println(tabuada + "x" + valor +  " = " + (tabuada * valor));
	        }
	        System.out.println("");
		System.out.println("Exemplo 7 - Uso da estrutura while");
		int contador = 1;
		while (contador <= 10) {
		System.out.println(contador);	
		contador ++;
		}
		System.out.println("");
		System.out.println("Exemplo 8 - Uso da estrutura do while");
		char novoJogo;
		do {
		System.out.println("Deseja jogar de novamente s/n ?");
		novoJogo = 'n';
		} while (novoJogo == 's');
		System.out.println("GAME OVER");
		}
	        } 
		}  



