//369게임
import java.util.Scanner;
public class Game369 {
	
	public static void main(String[] ar) {
		int res,num,numberof369 = 0;
		Scanner sc =new Scanner(System.in);
		System.out.println("1~99 사이의 정수를 입략하세요 : ");
		num = sc.nextInt();
		if(num >= 1 && num <=99) {
			res = num%10;
			if(res == 3 || res == 6 || res ==9) numberof369++;
			res = num /10;
			if(res == 3 || res == 6 || res ==9) numberof369++;
			if(numberof369 == 1)
				System.out.println("박수짝");
			else if (numberof369 == 2)
				System.out.println("박수 짝짝");
			else
				System.out.println("3이 없음");
		}
		else
			System.out.println("숫자의 범위를 벗어났습니다.");
	}
}
		/*
//1~99까지
//숫자에 3, 6, 9가 있으면 "짝"을
//아니면 숫자를 출력한다.
public class Game369 {
	public static void main(String[] args) {
		for(int i=1; i<=99; i++) {
		//숫자 -> 문자열
			String numberString = String.valueOf(i);
			 //하나씩 뗴서 '3'또는 '6'또는 '9'의 개수를 샌다.
			int count = count369(numberString);
			if (count ==0) {
				//개수가 0이면, 그냥 숫자출력
				System.out.println(i);
			}
			else {    
				//아니면,
		       //개수대로 "짝"출력
				for(int j=0; j<count; j++) {
					System.out.print("짝");
				}
				System.out.println();
			}
	}

}
	//0~length-1까지
	// 문자를 하나씩 구하고
	//그 문자가 '3' 또는 '6'또는 '9' 이면 짝
	private static int count369(String numberString) {
		int sum=0;
		for(int i=0; i<numberString.length(); i++) {
			char ch = numberString.charAt(i);
			if(ch == '3' || ch == '6' || ch == '9') {
				sum++;
		        }
	   }
		return sum;
	}
}
*/