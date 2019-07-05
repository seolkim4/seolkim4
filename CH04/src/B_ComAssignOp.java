
public class B_ComAssignOp {

	public static void main(String[] args) {
		short num = 10;
		num = (short) (num +77l); // 형 변환 안하면 컴파일 오류 발생
		
		int rate =3;
		rate = (int) (rate * 3.5); // 형 변환 안하면 컴파일 오류 발생
		
		System.out.println(num);
		System.out.println(rate);
		
		num = 10;
		num += 77l; // 형 변환 필요하지 않다. = num +=는 num에다 뒤에 있는걸 더한다.
		
		rate = 3;
		rate *= 3.5; // 형 변환 필요하지 않다. // = num *= num에다 뒤에 있는걸 곱한다.
		
		System.out.println(num);
		System.out.println(rate);
	}

}
