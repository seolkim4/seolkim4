import java.util.Scanner;

// ��Ģ���� ������
public class chapter0201 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int a = num1 + num2 ;
		int b = num1 - num2 ;
		int c = num1 / num2 ;
		int d = num1 * num2 ;
		System.out.println("������ ����մϴ�.");
		System.out.println("2��°���� 0�� �����մϴ�.");
		
		System.out.printf("%d + %d = %d \n", num1 , num2 , a);
		System.out.printf("%d - %d = %d \n", num1 , num2 , b);
		System.out.printf("%d / %d = %d \n", num1 , num2 , c);
		System.out.printf("%d * %d = %d \n", num1 , num2 , d);
		
	}

}
