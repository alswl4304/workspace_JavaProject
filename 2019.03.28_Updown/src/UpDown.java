import java.util.Scanner; 

public class UpDown { 
     public static void main(String[] args) { 
     int rn = (int)(Math.random()*100) +1; 
     System.out.println("1~100 ������ ���ڸ� ������� ���ڸ� ���� ���ÿ�."); 
     Scanner scanner = new Scanner(System.in); 
     int count = 1; 

          while(true){ 
               System.out.print("���� �Է� >");
               int sn = scanner.nextInt(); 
               if(rn != sn && rn > sn){ 
                    System.out.println("Ʋ�Ƚ��ϴ�, ���� �� ���ڴ� �� ū �� �Դϴ�.");
                    count++; 
               }else if(rn != sn && rn < sn){ 
                    System.out.println("Ʋ�Ƚ��ϴ�, ���� �� ���ڴ� �� ���� �� �Դϴ�."); 
                    count++; 
               }else if(rn == sn){ 
                    System.out.println("�����Դϴ�!!," + count + "�� ���� ���߼̽��ϴ�."); 
                    System.exit(0); // ������ ���߸� ���α׷�����
               } 
          } 
     }
}