import java.util.Scanner;

public class chapter0205 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int a = num1*num2;
		int b = (a>0) ? a:-a; 
		System.out.printf("%d�� %d ���� ���밪�� %d�Դϴ�",num1,num2,b);
				
		sc.close();
	}
	

}

