
public class H_PostfixOp {

	public static void main(String[] args) {
		int num = 5;
		
		System.out.println((num++) + " "); // 출력 후에 값이 증가
		// num++ (1을 더했으니 6, + <" "> 출력)
		System.out.println((num++) + " "); // 출력 후에 값이 증가
		// num++ (1을 더했으니 7, + <" "> 출력
		System.out.println(num + "\n");
		// 위에 꺼가 7 이니까 num은 7 , 그리고 엔터\n
		
		System.out.println((num--) + " "); // 출력 후에 값이 감소
		// num-- 위에가 7이니까 (7-0 이니까, + " " 출력)
		System.out.println((num--) + " "); // 출력 후에 값이 감소
		// num-- 위에가 7이니까 (1을 빼서 6, + " " 출력)
		System.out.println(num);
		// num-- 은 결과적으로 6-1 = 5
		
	}

}
