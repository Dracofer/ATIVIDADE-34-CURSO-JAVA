package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");

		int n = sc.nextInt();
		double media = 0;
		Double[] vect = new Double[n];
	
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			media = media + vect[i];
		}
		media = media / n;
		
		System.out.println("");
		System.out.printf("MEDIA DO VETOR = %.3f%n", media);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");

		for (int i = 0; i < n; i++) {
			if (vect[i] < media ) {
				System.out.println(vect[i]);
			}
		}

		sc.close();
	}

}
