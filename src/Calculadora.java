import java.util.Scanner;

public class Calculadora {

	public static double resultado; //variável global
	
	public static void somar(double valor1, double valor2){
		double soma;
		System.out.println("\n\nRealizando a soma entre " + valor1 + " e " + valor2);
		soma = valor1 + valor2;
		exibirResultado(soma);
	}
	
	public static void subtrair(double valor1, double valor2){
		double subtrair;
		System.out.println("\n\nRealizando a subtração entre " + valor1 + " e " + valor2);
		subtrair = valor1 + valor2;
		exibirResultado(subtrair);
	}
	
	public static void multiplicar(double valor1, double valor2) {
		double multiplicar;
		System.out.println("\n\nRealizando a divisão entre " + valor1 + " e " + valor2);
		multiplicar = valor1 * valor2;
		exibirResultado(multiplicar);		
	}
	
	public static void dividir(double valor1, double valor2) {
		double dividir;
		System.out.println("\n\nRealizando a multiplicação entre " + valor1 + " e " + valor2);
		dividir = valor1 / valor2;
		exibirResultado(dividir);		
	}
	
	public static void exibirResultado(double resultado){
		System.out.println("Resultado: " + resultado + "!");
	}
	
	public static void exibirMenu()
	{
		System.out.println("PROGRAMA CALCULADORA");
		System.out.println("Escolha sua opção!");
		System.out.println("1 - Digitar valores");
		System.out.println("2 - Realizar soma");
		System.out.println("3 - Realizar subtração");
		System.out.println("4 - Realizar divisão");
		System.out.println("5 - Realizar multiplicação");
		System.out.println("6 - Sair");
	}
	

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double valor1 = 0, valor2=0;
		
		int opcao = 0;
		
		while (opcao!=6) {
			exibirMenu();
			opcao = leitor.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.println("\n\nDigite o 1� valor:");
				valor1 = leitor.nextDouble();
				System.out.println("\n\nDigite o 2� valor:");
				valor2 = leitor.nextDouble();
				
				System.out.println("Os valores " + valor1 + " e " + valor2 + " foram armazenados\n\n");
				
				break;
			case 2:				
				somar(valor1, valor2);
							
				break;
			case 3:				
				subtrair(valor1, valor2);
				
				break;
			case 4:				
				multiplicar(valor1, valor2);
				
				break;
			case 5:				
				dividir(valor1, valor2);
				
				break;
			case 6:
				System.out.println("Saindo do sistema");
				break;
			}			
		}
		leitor.close();
		

	}

}
