import java.util.Scanner;
// ������� ���� ���ض�
public class chapter0203 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int a = num1 / num2 ;
		int b = num1 % num2 ;
		
		System.out.println("�ι�° �ڸ��� 0 �� ���� �� �����ϴ�.");
		System.out.printf("%d / %d = %d \n",num1 ,num2, a);
		System.out.printf("%d %% %d = %d \n", num1, num2, b);
		
		
	}

}
