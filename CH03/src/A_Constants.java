
public class A_Constants {

	public static void main(String[] args) {
		final int MAX_SIZE = 100;
		final char CONST_CHAR = '상';
		final int CONST_ASSIGNED;
		
		// final 써있는건 상수고, 변경불가
		// 단 값이 비어있을 때 다른거 넣을 수 있음.
		// 타입이 char로 되어 있으면 문자 가능
		CONST_ASSIGNED = 12;
		
		System.out.println("상수1 : " + MAX_SIZE);
		System.out.println("상수1 : " + CONST_CHAR);
		System.out.println("상수3 : " + CONST_ASSIGNED);

	}

}
