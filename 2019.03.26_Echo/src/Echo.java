import java.util.Scanner;

public class Echo {

		public static void main(String[] args) {
            //�ݺ�
			while (true) {
			Scanner scanner=new Scanner(System.in);//input
			String inputString =scanner.nextLine();//������ ����
			if(inputString.equals("exit")) {//���� ���
				System.out.println("�ȳ�, �߰�");
			break;
			}
					System.out.println(inputString);
			}
		}
}