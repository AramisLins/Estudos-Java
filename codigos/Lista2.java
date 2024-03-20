package principal;

import java.util.Scanner;


public class Lista2 {
	public static int calcularFibonacci(int n) {
    	if (n <= 1) {
    		return n;
    	} else {
           return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
    	}
	}
	 public static long calcularFatorial(int numero) {
	        if (numero == 0 || numero == 1) {
	            return 1;
	        } else {
	            long resultado = 1;
	            for (int i = 2; i <= numero; i++) {
	                resultado *= i;
	            }
	            return resultado;
	        }
	    }
	 
	 
	public static void q1(){
		Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de n para gerar a série de Fibonacci: ");
        int n = scanner.nextInt();

        System.out.println("Série de Fibonacci até o " + n + "º termo:");
        for (int i = 1; i <= n; i++) {
            System.out.print(calcularFibonacci(i) + " ");
        }
    }
	public static void q2() {
		int primeiroTermo = 0;
        int segundoTermo = 1;
        int proximoTermo = primeiroTermo + segundoTermo;

       System.out.println("Série de Fibonacci até que o valor seja maior que 500:");

        while (proximoTermo <= 500) {
            System.out.println(primeiroTermo + " ");
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
            proximoTermo = primeiroTermo + segundoTermo;
        }
    }
	public static void q3() {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro para calcular o fatorial: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Não é possível calcular o fatorial de um número negativo.");
        } else {
            long fatorial = calcularFatorial(numero);
            System.out.println(numero + "! = " + fatorial);
        }
	}
	public static void q4(){
	Scanner scanner = new Scanner(System.in);

        System.out.print("Quantidade de números: ");
        int cont = scanner.nextInt();

        int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
        int soma = 0;

        System.out.println("Insira os números:");
        for (int i = 0; i < cont; i++) {
            int num = scanner.nextInt();
            if (num < menor) {
                menor = num;
            }
            if (num > maior) {
                maior = num;
            }
            soma += num;
        }
        System.out.println("Menor valor: " + menor);
        System.out.println("Maior valor: " + maior);
        System.out.println("Soma dos valores: " + soma);

        scanner.close();
	}
}

    
 
	

