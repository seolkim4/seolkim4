import java.util.Scanner;
// 나누기랑 몫을 구해라
public class chapter0203 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int a = num1 / num2 ;
		int b = num1 % num2 ;
		
		System.out.println("두번째 자리엔 0 을 넣을 수 없습니다.");
		System.out.printf("%d / %d = %d \n",num1 ,num2, a);
		System.out.printf("%d %% %d = %d \n", num1, num2, b);
		
		
	}

}
