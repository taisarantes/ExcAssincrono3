package AtvdAssincrona3;

import java.util.Scanner;

public class Exc1 {
	public static void main(String[] args) {
		int num1, num2;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número do intervalo: ");
		num1 = leia.nextInt();
		System.out.println("Digite o último número do intervalo: ");
		num2 = leia.nextInt();
		
		if(num1 >= num2) {
			System.out.println("Intervalo inválido!");
		} else {
			System.out.printf("\nNo intervalo entre %d e %d: ", num1, num2);
			for(int i = num1; i < num2; i++) {
				if(i % 3 == 0 && i % 5 == 0) {
					System.out.printf("\n%d é múltiplo de 3 e 5", i);
				}
			}
		}
	}
}
