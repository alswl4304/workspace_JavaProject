import java.util.Scanner;

public class StudentNumber2major {

	public static void main(String[] ar) { 
		Scanner scanner=new Scanner(System.in);
		System.out.println("�а��� ���� �й��� �Է��ϼ���.");//�й� �Է¹ޱ�
		String studentNumder = scanner.nextLine();
		//System.out.pirntln(studentNumder);
		String grade = studentNumder.substring(0,1);
		//char grade =studentNumder.charAt(0);
		String classroom = studentNumder.substring(1,2);
		char gradeCh = 0;
		//�а� ����ϱ�
		if(grade.equals("1") || grade.equals("2")) {
			//�г��� 1,2�̸�
			if (classroom.equals("1") ||classroom.equals("2")){
				//���� 1,2�̸� "���̵�����Ʈ�����"
				System.out.println("���̵�����Ʈ�����");
			}
			else if (classroom.equals("3") ||classroom.equals("4")){
				//���� 3,4�̸� "���̵�����ַ�ǰ�"
				System.out.println("���̵�����ַ�ǰ�");
			}
			else if (classroom.equals("5") ||classroom.equals("6")){
				//����5.6�̸� "���̵������ΰ�"
				System.out.println("���̵������ΰ�");
			}
		}
		else if (gradeCh == '3') {
			int classroomCh = 0;
			//�г��� 3�̸�
	    	switch(classroomCh) {//���� 1,2�̸� "���ͷ�Ƽ��̵���"
	    	case '1':
	    	case '2':
	    			System.out.println("���ͷ�Ƽ��̵���");
	    			break;
	    	case '3':
	    	case '4':
	    			System.out.println("���̵������ΰ�");//���� 3,4�̸� "���̵������ΰ�"
	    			break;
	    	case '5':
	    	case '6':
	    			System.out.println("���̵��ַ�ǰ�");//����5.6�̸� "���̵��ַ�ǰ�"
	    			break;
	    	}
	    }
	}
}