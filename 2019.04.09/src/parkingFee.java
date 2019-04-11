import java.util.Scanner;

//분을 입력받아
//최초 30분은 1500원, 10분당 1000원
//주차요금 출력하자
//5->1500 , 30->1500 , 40->2500->3500
public class parkingFee {
	public static void main(String[] ar) {
		//분을 입력하자
		Scanner sc=new Scanner(System.in);
	     int inputNumber = sc.nextInt();
	    int minutes = 52;
		int fee=0;
		if(minutes<=30) {
			//분<=30분이면,1500
			fee=1500;
		}else {
		//아니고,
		//분-30, 요금+=1500
		minutes = minutes-30;
		fee+=1500;
		//요금+=분(분/10)*1000	
		fee+=(minutes/10)*1000;
		//분%10!-0면, 요금 +=1000
		if(minutes%10 !=0) {
			fee+=1000;
			}
		}
		System.out.println("주차요금은"+fee+"원입니다.");
	}
}