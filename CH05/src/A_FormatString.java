
public class A_FormatString {

	public static void main(String[] args) {
		int age = 20;
		double height = 178.2;
		// �Ǽ��� doble ���
	
		String name = "Hong Gil Dong";
		System.out.printf(" name: %s \n", name);
		System.out.printf(" age: %d \n height: %e \n\n", age, height);
		
		System.out.printf(" %d - %o - %x \n\n", 77, 77, 77);
        System.out.printf(" %g \n", 0.00014);
		System.out.printf(" %g \n", 0.00014);
		
		// ���ڿ� �̸� = ȫ�浿
		// "�̸� : %s ���ڿ� \n ���� , �̸����) = �̸� : ȫ�浿
		// "���� : %d 10���� \n ���� , ���� : %e �Ǽ�, \n\n����2��", ����, ����
		
		// --
		
		// "%10����, - %8���� - 
	}

}