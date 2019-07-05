
public class A_UseVariable {

	public static void main(String[] args) {
		int num1; //변수 선언
		num1 = 10; // 변수에 값 대입
		
		int num2 = 20; // 변수 선언과 동시에 값을 대입 (위처럼 해도 되고, 아래 처럼 해도 된다)
		int num3 = num1 + num2; // 넘3은 넘1(10) + 넘2(20) 결국은 3
		
		System.out.println(num1 + " + " + num2 + " = " + num3);
		// 넘1(10) +(표시) + 넘2(20) =(표시) 넘3(30)

	}

}
