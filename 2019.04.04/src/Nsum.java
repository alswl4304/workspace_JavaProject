import java.util.Scanner;

public class Nsum {

	public static void main(String[] ar) {
		
	        int num = 0; // �Էµ� ���ڰ� ����� ������ �ʱ�ȭ �Ѵ�.
	        int sum = 0; // �Էµ� ������ �� �ڸ��� ���� ������ ������ �ʱ�ȭ �Ѵ�.
	        
	        Scanner scanner=new Scanner(System.in);//���� �Է¹���
	        	System.out.println("������ �Է��Ͻÿ�.");
	        		num = scanner.nextInt();
	        
	        while(num!=0){
	            //num�� 10���� ���� �������� sum�� ���Ѵ�.
	            	sum += num%10;//�� �ڸ����� ���� ������
	            //num�� 10���� ���� ���� �ٽ� num�� �����Ѵ�.
	            	num /= 10;
	        }
	        System.out.println("������ ���� "+sum+"�Դϴ�.");//���� ���� �������
	        	scanner.close();
	}
}