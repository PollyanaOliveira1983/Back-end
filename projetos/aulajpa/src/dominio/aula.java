package dominio;

import java.util.ArrayList;
import java.util.Scanner;

public class aula {

	public static void main(String[] args) {
		

		       ArrayList<Integer> numbers = new ArrayList<>();

		       Scanner sc = new Scanner(System.in);

		       int total = 0;

		       while (true) {

		           System.out.println("Digite um número inteiro (digite 0 para sair) :");

		           int num = sc.nextInt();

		           if (num == 0) {

		               break;

		           }

		           numbers.add(num);

		           total += num;

		       }

		       System.out.println("Números armazenados: " + numbers);

		       System.out.println("Soma total dos números: " + total);
		       
		       sc.close();

	}

}
