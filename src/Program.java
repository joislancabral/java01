import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner tc = new Scanner(System.in);
		
		String nome;
		char primeiraLetra;
		int numero;
		double numeroDouble;
		
		System.out.print("Digite um nome: ");
		nome = tc.next();
		System.out.print("Digite uma palavra: ");
		primeiraLetra = tc.next().charAt(0);
		System.out.print("Digite um número: ");
		numero = tc.nextInt();
		System.out.printf("Digite um número decimal: ");
		numeroDouble = tc.nextDouble();
		
		System.out.println("-------------------------------------------");
		System.out.println("Nome: " + nome);
		System.out.println("Primeiro caractere da palavra: " + primeiraLetra);
		System.out.println("Número: " + numero);
		System.out.printf("Número decimal: %.2f", numeroDouble);
		
		tc.close();

	}

}
