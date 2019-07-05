import java.util.Scanner;

// 제곱 만들어라 
public class chapter0202 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int num1 = sc.nextInt();				
		int a = num1 * num1;
		
		System.out.println("제곱을 출력합니다. 0은 제외합니다.\n");
		System.out.printf("%d * %d = %d \t",num1 ,num1 ,a );
	
		
	}

}
