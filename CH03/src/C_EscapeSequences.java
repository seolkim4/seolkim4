/*
\b 백스페이스 문자
\t 탭 문자
\\ 백 슬래시 문자

\' 작은 따옴표 문자
\ " 큰 따옴표 문자
\n 개행 문자
/r 캐리지 리턴 문자ㅏ
*/


public class C_EscapeSequences {

	public static void main(String[] args) {
		System.out.println("AB" + '\b' + 'C'); // AB , 한칸지우고 C = AC
		System.out.println("AB" + '\t' + 'C'); // AB , 탭해서 = AB    C
		System.out.println("AB" + '\n' + 'C'); // AB , 엔터 = AB
		
		System.out.println("AB" + '\r' + 'C'); // AB , 개행해서 = BC 
	}

}


// 실수형 상수의 표기법
// 3.4e3 양수 ==> 3.4*10의 3승 = 3400.0 우측으로 0이 3개 00.0 쩜!
// 3.4e-3 음수 ==> 3.4*10의 -3승 = 0.0034 왼쪽으로 0 이 3개 00.0 쩜