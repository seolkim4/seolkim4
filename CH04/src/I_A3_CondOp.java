
public class I_A3_CondOp {

	public static void main(String[] args) {
		int num1 = 50;
		int num2 = 100;
		
		int big;
		int diff;
		
		big = (num1 > num2) ? num1 : num2;
		// ��1 > ��2 �����ϱ� ���� ->(?) // (�� : ����) ������ ���
		System.out.println("ū �� : " + big);
		
		diff = (num1 > num2) ? (num1 - num2) : (num2 - num1);
		// ��1 > ��2 �����ϱ� ?  ��1 - ��2 -50 : 50 ;
		System.out.println("���밪 : " + diff);
		// ���밪 50 ���
		

		
	}

}
