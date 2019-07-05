import java.util.Scanner;

public class chapter0204 {
// 큰 값을 출력해라
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int big;
		
		big = (num1 > num2) ? num1 : num2;

		System.out.println("큰값" + big);
	}
	

}
