
public class B_ComAssignOp {

	public static void main(String[] args) {
		short num = 10;
		num = (short) (num +77l); // �� ��ȯ ���ϸ� ������ ���� �߻�
		
		int rate =3;
		rate = (int) (rate * 3.5); // �� ��ȯ ���ϸ� ������ ���� �߻�
		
		System.out.println(num);
		System.out.println(rate);
		
		num = 10;
		num += 77l; // �� ��ȯ �ʿ����� �ʴ�. = num +=�� num���� �ڿ� �ִ°� ���Ѵ�.
		
		rate = 3;
		rate *= 3.5; // �� ��ȯ �ʿ����� �ʴ�. // = num *= num���� �ڿ� �ִ°� ���Ѵ�.
		
		System.out.println(num);
		System.out.println(rate);
	}

}
