
public class D_LogicalOp {

	public static void main(String[] args) {
		int num1 = 11; //인트 넘1 에 11을 대입
		int num2 = 22; //인트 넘2 에 22를 대입
		boolean result ; // result는 참 또는 거짓이다.
		
		result = (1 < num1) && (num1  < 100);
		//결과는 = (1이 넘1보다 작다) 앤드 (넘1이 100보다 작다)
		
		System.out.println("1 초과 100 미만인가?" + result);
		// 출력값 = (1 초과 100 미만? + 참)
		
		result = ((num2 % 2) ==0) || ((num2 % 3) == 0);
		System.out.println("2 또는 3의 배수인가?" + result);
		
		result = !(num1 != 0);
		System.out.println("(결과적으로)참이 아니다." + result);
		
		// &&는 둘다 참이면 참 , ||는 둘중 하나 참이면 참 , !=  반대
	}

}
