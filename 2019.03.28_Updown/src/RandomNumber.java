import java.util.*;

public class RandomNumber {
	
	public static void main(String[] args) {
		int start = 0;
		int end =99;
		Random random = new Random();
				int randomNumber = random.nextInt(end+1-start)+start;//stat ~end �������� �̱�
				System.out.println(randomNumber);
	}
}