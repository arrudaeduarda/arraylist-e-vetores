package vetores;

import java.util.Scanner;

public class Atividade2205 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in); 

		int soma = 0; 
		int a[] = new int [5];	
		for (int i =0; i<5; i++) {
			System.out.println("Informe um valor:");
			a [i]= ler.nextInt ();
			soma += a[i];

		}

		for (int i =0; i<5; i++) {
			System.out.println(a[i]);

		}

		if (soma>=30) {
			System.out.println("O valor da soma é: "+soma);

		}

		else {
			System.out.println("O valor não é maior do que 30.");

		}

		ler.close();
	}

}