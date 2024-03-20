package principal;
import java.util.Calendar;
import java.util.Scanner;


public class Questões {
		public static void q1() {
			Scanner teclado = new Scanner(System.in);

	        System.out.println("Informe o dia de nascimento: ");
	        int diaNascimento = teclado.nextInt();

	        System.out.println("Informe o mês de nascimento: ");
	        int mesNascimento = teclado.nextInt();

	        System.out.println("Informe o ano de nascimento: ");
	        int anoNascimento = teclado.nextInt();

	        Calendar dataAtual = Calendar.getInstance();
	        int anoAtual = dataAtual.get(Calendar.YEAR);
	        int mesAtual = dataAtual.get(Calendar.MONTH);
	        int diaAtual = dataAtual.get(Calendar.DAY_OF_MONTH);

	        int idade = anoAtual - anoNascimento;

	        if (mesAtual < mesNascimento || (mesAtual == mesNascimento && diaAtual < diaNascimento)) {
	            idade--;
	        }

	        System.out.println("Sua idade é: " + idade + " anos");

	        teclado.close();
	} 
		public static void q2() {
			Scanner teclado = new Scanner(System.in);
			System.out.println("Digite o primeiro numero: ");
			int Num1 = teclado.nextInt();
			
			System.out.println("Digite o segundo numero: ");
			int Num2 = teclado.nextInt();
			int soma = Num1 + Num2;
			
			System.out.println("A soma dos 2 numeros é: " + soma);
			teclado.close();
			}
		
		public static void q3() {
			Scanner teclado = new Scanner(System.in);
			float soma = 0;
			for(int i = 1; i < 5;i++) {
				System.out.println("Digite a " + i + " nota");
				soma = soma + teclado.nextInt();			
				}
			float media = (soma / 4);
			System.out.println("A media é: "+ media);
			teclado.close();
		}
		public static void q4() {
			Scanner teclado = new Scanner(System.in);
			System.out.println("Digite o valor em METROS: ");
			float valor= teclado.nextFloat();
			float conversao = valor * 100;
			System.out.println("O valor convertido é: " + conversao + " Cm");
			teclado.close();
		}
		public static void q5() {
			Scanner teclado = new Scanner(System.in);
			System.out.println("Digite tamanho do Raio: ");
			float tamanho = teclado.nextFloat();
			double area = (Math.PI * Math.pow(tamanho, 2));
			System.out.printf("O valor da área é: %.2f ", area);
			teclado.close();
		}
		public static void q6() {
			Scanner teclado = new Scanner(System.in);
			System.out.println("Digite o valor do lado do quadrado: ");
			float valor = teclado.nextFloat();
			double valorFinal = Math.pow(valor, 2);
			System.out.printf("O dobro do valor é: %.2f",(Math.pow(valorFinal, 2)));
			teclado.close();
		}
		public static void q7() {
			Scanner teclado = new Scanner(System.in);
			System.out.println("Digite quando você ganha por hora: ");
			float valor = teclado.nextFloat();
			
			System.out.println("Digite quantidade de horas trabalhada no mês: ");
			float hTrabalhadas = teclado.nextFloat();
			
			float ValorFinal = valor * hTrabalhadas;
			
			System.out.printf("Seu salario do mês ficou : %.2fR$", ValorFinal);
			teclado.close();
		}
		public static void q8() {
			Scanner teclado = new Scanner(System.in);
			System.out.println("Digite a temperatura em Fahrenheit: ");
			float fahrenheit = teclado.nextFloat();
			float res = (5 * ((fahrenheit - 32) / 9));
			System.out.printf("O valor convertido para Celsius ficou %.2f", (res));
			teclado.close();
		}
		public static void q9() {
			Scanner teclado = new Scanner(System.in);
			System.out.println("Digite a temperatura em Celsius: ");
			float Celsius = teclado.nextFloat();
			double res = ((Celsius * 1.8) + 32);
			System.out.printf("O valor convertido para Fahrenheit ficou %.2f", (res));
			teclado.close();
		}
		
		public static void q10(){
			Scanner teclado = new Scanner(System.in);
			System.out.println("Digite o primeiro numero inteiro: ");
			int num1 = teclado.nextInt();
			
			System.out.println("Digite o segundo numero inteiro: ");
			int num2 = teclado.nextInt();
			
			System.out.println("Digite um numero real ");
			float numR = teclado.nextFloat();
			
			double q1 = (Math.pow(num1, 2)) * (num2 / 2);
			double q2 = (Math.pow(num1, 3)) + (numR);
			double q3 = Math.pow(numR, 3);
			
			System.out.printf("1- %.2f\n2- %.2f\n3- %.2f",(q1),(q2),(q3) );
			teclado.close();			
		}
		public static void q11(){
			Scanner teclado = new Scanner(System.in);
			System.out.println("Digite sua Altura: ");
			float altura = teclado.nextFloat();
			float res = (float) ((72.7 * altura) - 58);
			System.out.printf("Seu peso ideal é: %.2f", (res));
			teclado.close();
		}
		public static void q12() {
			Scanner teclado = new Scanner(System.in);
			System.out.println("Digite sua Altura: ");
			float altura = teclado.nextFloat();
			System.out.println("Escolha seu Sexo \n Digite 1 para masculino / 2 para Feminio ");
			int escolha = teclado.nextInt();
			if(escolha == 1) {
				double res = (72.7 * altura) - 58;
				System.out.printf("Seu peso ideal é: %.2f", res);
			}
			else {
				double res = (62.1* altura) - 44.7;
				System.out.printf("Seu peso ideal é: %.2f", res);
			}
			teclado.close();
			}
		public static void q13() {
			int constante = 50;
			
			Scanner teclado = new Scanner(System.in);
			System.out.println("Digite o peso de peixes pescado hoje: ");
			double peso = teclado.nextDouble();
			
			double excesso = peso - constante;
			if(excesso > 0 ) {
				double multa = excesso * 4;
				System.out.printf("O Valor da multa que você vai pagar é: %.2fR$", multa);
			}
			else {
				System.out.println("Não pagará multa, peso menor que 50 quilos");
			}
			teclado.close();
		}
		public static void q14() {
			Scanner teclado = new Scanner(System.in);
			
			System.out.println("Digite o tamanho da área a ser pintada: ");
			double areaPintada = teclado.nextDouble();
			
			double qtdTinta = areaPintada / 3;
			
			int latasDeTinta = (int) Math.ceil(qtdTinta / 18);
			
			double total = latasDeTinta * 80;
			
			System.out.println("\nQuantidade de latas de tinta necessárias: " + latasDeTinta);
		    System.out.println("Preço total: R$ " + total);
			
		    teclado.close();
		}
		public static void q15() {
			   Scanner teclado = new Scanner(System.in);

		        System.out.print("Digite o tamanho do arquivo para download (em MB): ");
		        double tamanhoArquivo = teclado.nextDouble();

		        
		        System.out.print("Digite a velocidade do link de Internet (em Mbps): ");
		        double velocidade = teclado.nextDouble();

		      
		
		        double tempoDownloadMinutos = (tamanhoArquivo / velocidade) / 60;

		   
		        System.out.println("O tempo aproximado de download do arquivo é de " + tempoDownloadMinutos + " minutos.");

		        teclado.close();
		}
}
