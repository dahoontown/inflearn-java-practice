package hun.celender;

import java.util.*;

public class max_date {

	public static void main(String[] args) {
		
		System.out.println("달을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		int[] maxdate = {31, 28, 31, 30, 31, 30, 31, 31, 30 ,31 ,30, 31};
		
		System.out.printf("%d월의 마지막 날은 %d일까지 있습니다.", month, maxdate[month+1]);
	}

}
