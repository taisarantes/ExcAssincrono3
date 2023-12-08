package AtvdAssincrona3;

import java.util.Scanner;

public class Exc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, pares = 0, impares = 0;
		Scanner leia = new Scanner(System.in);
		
		for(int i = 1; i < 10; i++) {
			System.out.printf("\nDigite o %d º número: ", i);
			num = leia.nextInt();
			if(num % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
		}
		System.out.printf("Total de números pares: %d", pares);
		System.out.printf("\nTotal de números impares: %d", impares);

	}

}
