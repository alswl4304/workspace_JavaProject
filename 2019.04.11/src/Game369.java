//369����
import java.util.Scanner;
public class Game369 {
	
	public static void main(String[] ar) {
		int res,num,numberof369 = 0;
		Scanner sc =new Scanner(System.in);
		System.out.println("1~99 ������ ������ �Է��ϼ��� : ");
		num = sc.nextInt();
		if(num >= 1 && num <=99) {
			res = num%10;
			if(res == 3 || res == 6 || res ==9) numberof369++;
			res = num /10;
			if(res == 3 || res == 6 || res ==9) numberof369++;
			if(numberof369 == 1)
				System.out.println("�ڼ�¦");
			else if (numberof369 == 2)
				System.out.println("�ڼ� ¦¦");
			else
				System.out.println("3�� ����");
		}
		else
			System.out.println("������ ������ ������ϴ�.");
	}
}
		/*
//1~99����
//���ڿ� 3, 6, 9�� ������ "¦"��
//�ƴϸ� ���ڸ� ����Ѵ�.
public class Game369 {
	public static void main(String[] args) {
		for(int i=1; i<=99; i++) {
		//���� -> ���ڿ�
			String numberString = String.valueOf(i);
			 //�ϳ��� �� '3'�Ǵ� '6'�Ǵ� '9'�� ������ ����.
			int count = count369(numberString);
			if (count ==0) {
				//������ 0�̸�, �׳� �������
				System.out.println(i);
			}
			else {    
				//�ƴϸ�,
		       //������� "¦"���
				for(int j=0; j<count; j++) {
					System.out.print("¦");
				}
				System.out.println();
			}
	}

}
	//0~length-1����
	// ���ڸ� �ϳ��� ���ϰ�
	//�� ���ڰ� '3' �Ǵ� '6'�Ǵ� '9' �̸� ¦
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