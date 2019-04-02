import java.util.Scanner;

public class NumberToWeekday {

	public static void main(String[] args) {
		String[] weekdays = {"월","화","수","목","금","토","일"};

     Scanner sc=new Scanner(System.in);
     int inputNumber = sc.nextInt();
     System.out.println(weekdays[inputNumber-1]+ "요일");
     //요일 출력하자
/* int i=sc.nextInt();
     
     if(i==1) {
    	 System.out.println("월요일");
     }
     else if(i==2) {
    	 System.out.println("화요일");
     }
     else if(i==3) {
    	 System.out.println("수요일");
     }
     else if(i==4) {
    	 System.out.println("목요일");
     }
     else if(i==5) {
    	 System.out.println("금요일");
     }
     else if(i==6) {
    	 System.out.println("토요일");
     }
     else if(i==7) {
    	 System.out.println("일요일");
     }


	}

}*/
	}
}