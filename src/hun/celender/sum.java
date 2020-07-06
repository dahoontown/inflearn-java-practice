package hun.celender;

import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		System.out.println("두 수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		String num1 = sc.next();
		String num2 = sc.next();
		int innum1 = Integer.parseInt(num1);
		int innum2 = Integer.parseInt(num2);
		
		System.out.println("두 수의 합은 : " + (innum1+innum2));
		sc.close();
	}

}
