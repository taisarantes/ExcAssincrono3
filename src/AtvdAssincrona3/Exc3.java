package AtvdAssincrona3;

import java.util.Scanner;

public class Exc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade = 1, jovens = 0, idosos = 0;
		Scanner leia = new Scanner(System.in);
		
		while(idade > 0) {
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();
			
			if(idade <= 21 && idade > 0) {
				jovens++;
			} 
			if(idade >= 50 && idade > 0){
				idosos++;
			}
		}
		
		System.out.printf("Total de pessoas menores de 21 anos: %d", jovens);
		System.out.printf("\nTotal de pessoas maiores de 50 anos: %d", idosos);

	}

}
