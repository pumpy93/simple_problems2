package Tasks2;

import java.util.Scanner;

public class ZAD6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n = ");
		int n = sc.nextInt();
		int num = 1;
		int sum = 1;
		
		do {
			num++;
			sum += num;
			
		} 
		while (num < n);
		System.out.printf("rezultata e = %d%n", sum);
	}

}
