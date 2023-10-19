package contadores;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {

	public static void main(String[] args) throws InputMismatchException {
		 
		Scanner sc = new Scanner(System.in);
		
		//Recebimento dos Parametros
		System.out.println ("Digite o primeiro parametro: ");
		int parametroUm = sc.nextInt();
		System.out.println("Digite o segundo parametro: ");
		int parametroDois = sc.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (InputMismatchException e) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println("O segundo parametro precisa ser maior que o primeiro");
			
		}
			
		sc.close();

	}
	
	 static void contar(int parametroUm, int parametroDois )  {
		
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		 
		if (parametroUm < parametroDois) {
			int contagem = parametroDois - parametroUm;
			
			for (int indice  = 1; indice <= contagem; indice++) {
				System.out.println("Contandooo " + indice);
			} 
		} else {
			throw new InputMismatchException();
		}
				
		//realizar o for para imprimir os números com base na variável contagem
	}

}
