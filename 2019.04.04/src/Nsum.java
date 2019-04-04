import java.util.Scanner;

public class Nsum {

	public static void main(String[] ar) {
		
	        int num = 0; // 입력된 숫자가 저장될 변수를 초기화 한다.
	        int sum = 0; // 입력된 숫자의 각 자리의 합을 저장할 변수를 초기화 한다.
	        
	        Scanner scanner=new Scanner(System.in);//숫자 입력받자
	        	System.out.println("생일을 입력하시오.");
	        		num = scanner.nextInt();
	        
	        while(num!=0){
	            //num을 10으로 나눈 나머지를 sum에 더한다.
	            	sum += num%10;//각 자릿수의 수를 더하자
	            //num을 10으로 나눈 값을 다시 num에 저장한다.
	            	num /= 10;
	        }
	        System.out.println("생일의 합은 "+sum+"입니다.");//더한 값을 출력하자
	        	scanner.close();
	}
}