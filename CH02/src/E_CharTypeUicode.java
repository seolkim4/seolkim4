
public class E_CharTypeUicode {

	public static void main(String[] args) {
		char ch1 = '��'; //(ĳ����)
		char ch2 = 'Ȯ';
		
		char ch3 = 54736; // ���� '��'�� �����ڵ� �� : 10����
		char ch4 = 54869; // ���� 'Ȯ'�� �����ڵ� �� 
		
		char ch5 = 0xd5d0; // ���� '��'�� �����ڵ� �� : 16����
		char ch6 = 0xd655;
		
		System.out.println(ch1 + " " + ch2);
		System.out.println(ch3 + " " + ch4);
		System.out.println(ch5 + " " + ch6);
		
		// ���߿� ��ﲨ�� ���󵵵� 
		 
	}

}
