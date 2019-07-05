
public class I_A3_CondOp {

	public static void main(String[] args) {
		int num1 = 50;
		int num2 = 100;
		
		int big;
		int diff;
		
		big = (num1 > num2) ? num1 : num2;
		// 넘1 > 넘2 작으니까 거짓 ->(?) // (참 : 거짓) 거짓이 출력
		System.out.println("큰 수 : " + big);
		
		diff = (num1 > num2) ? (num1 - num2) : (num2 - num1);
		// 넘1 > 넘2 작으니까 ?  넘1 - 넘2 -50 : 50 ;
		System.out.println("절대값 : " + diff);
		// 절대값 50 출력
		

		
	}

}
