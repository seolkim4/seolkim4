
public class A_FormatString {

	public static void main(String[] args) {
		int age = 20;
		double height = 178.2;
		// 실수라서 doble 사용
	
		String name = "Hong Gil Dong";
		System.out.printf(" name: %s \n", name);
		System.out.printf(" age: %d \n height: %e \n\n", age, height);
		
		System.out.printf(" %d - %o - %x \n\n", 77, 77, 77);
        System.out.printf(" %g \n", 0.00014);
		System.out.printf(" %g \n", 0.00014);
		
		// 문자열 이름 = 홍길동
		// "이름 : %s 문자열 \n 엔터 , 이름출력) = 이름 : 홍길동
		// "나이 : %d 10진수 \n 엔터 , 나이 : %e 실수, \n\n엔터2번", 나이, 무게
		
		// --
		
		// "%10진수, - %8진수 - 
	}

}
