
public class H_PostfixOp {

	public static void main(String[] args) {
		int num = 5;
		
		System.out.println((num++) + " "); // ��� �Ŀ� ���� ����
		// num++ (1�� �������� 6, + <" "> ���)
		System.out.println((num++) + " "); // ��� �Ŀ� ���� ����
		// num++ (1�� �������� 7, + <" "> ���
		System.out.println(num + "\n");
		// ���� ���� 7 �̴ϱ� num�� 7 , �׸��� ����\n
		
		System.out.println((num--) + " "); // ��� �Ŀ� ���� ����
		// num-- ������ 7�̴ϱ� (7-0 �̴ϱ�, + " " ���)
		System.out.println((num--) + " "); // ��� �Ŀ� ���� ����
		// num-- ������ 7�̴ϱ� (1�� ���� 6, + " " ���)
		System.out.println(num);
		// num-- �� ��������� 6-1 = 5
		
	}

}
