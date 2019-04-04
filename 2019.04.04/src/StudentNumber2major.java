import java.util.Scanner;

public class StudentNumber2major {

	public static void main(String[] ar) { 
		Scanner scanner=new Scanner(System.in);
		System.out.println("학과를 구할 학번을 입력하세요.");//학번 입력받기
		String studentNumder = scanner.nextLine();
		//System.out.pirntln(studentNumder);
		String grade = studentNumder.substring(0,1);
		//char grade =studentNumder.charAt(0);
		String classroom = studentNumder.substring(1,2);
		char gradeCh = 0;
		//학과 출력하기
		if(grade.equals("1") || grade.equals("2")) {
			//학년이 1,2이면
			if (classroom.equals("1") ||classroom.equals("2")){
				//반이 1,2이면 "뉴미디어소프트웨어과"
				System.out.println("뉴미디어소프트웨어과");
			}
			else if (classroom.equals("3") ||classroom.equals("4")){
				//반이 3,4이면 "뉴미디어웹솔루션과"
				System.out.println("뉴미디어웹솔루션과");
			}
			else if (classroom.equals("5") ||classroom.equals("6")){
				//반이5.6이면 "뉴미디어디자인과"
				System.out.println("뉴미디어디자인과");
			}
		}
		else if (gradeCh == '3') {
			int classroomCh = 0;
			//학년이 3이면
	    	switch(classroomCh) {//반이 1,2이면 "인터랙티브미디어과"
	    	case '1':
	    	case '2':
	    			System.out.println("인터랙티브미디어과");
	    			break;
	    	case '3':
	    	case '4':
	    			System.out.println("뉴미디어디자인과");//반이 3,4이면 "뉴미디어디자인과"
	    			break;
	    	case '5':
	    	case '6':
	    			System.out.println("뉴미디어솔루션과");//반이5.6이면 "뉴미디어솔루션과"
	    			break;
	    	}
	    }
	}
}