import java.util.Scanner;

//���� �Է¹޾�
//���� 30���� 1500��, 10�д� 1000��
//������� �������
//5->1500 , 30->1500 , 40->2500->3500
public class parkingFee {
	public static void main(String[] ar) {
		//���� �Է�����
		Scanner sc=new Scanner(System.in);
	     int inputNumber = sc.nextInt();
	    int minutes = 52;
		int fee=0;
		if(minutes<=30) {
			//��<=30���̸�,1500
			fee=1500;
		}else {
		//�ƴϰ�,
		//��-30, ���+=1500
		minutes = minutes-30;
		fee+=1500;
		//���+=��(��/10)*1000	
		fee+=(minutes/10)*1000;
		//��%10!-0��, ��� +=1000
		if(minutes%10 !=0) {
			fee+=1000;
			}
		}
		System.out.println("���������"+fee+"���Դϴ�.");
	}
}