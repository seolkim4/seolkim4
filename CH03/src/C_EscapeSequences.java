/*
\b �齺���̽� ����
\t �� ����
\\ �� ������ ����

\' ���� ����ǥ ����
\ " ū ����ǥ ����
\n ���� ����
/r ĳ���� ���� ���ڤ�
*/


public class C_EscapeSequences {

	public static void main(String[] args) {
		System.out.println("AB" + '\b' + 'C'); // AB , ��ĭ����� C = AC
		System.out.println("AB" + '\t' + 'C'); // AB , ���ؼ� = AB    C
		System.out.println("AB" + '\n' + 'C'); // AB , ���� = AB
		
		System.out.println("AB" + '\r' + 'C'); // AB , �����ؼ� = BC 
	}

}


// �Ǽ��� ����� ǥ���
// 3.4e3 ��� ==> 3.4*10�� 3�� = 3400.0 �������� 0�� 3�� 00.0 ��!
// 3.4e-3 ���� ==> 3.4*10�� -3�� = 0.0034 �������� 0 �� 3�� 00.0 ��