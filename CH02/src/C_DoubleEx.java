
public class C_DoubleEx {

	public static void main(String[] args) {
		
		double dnum = 1;
		
		for(int i=0; i<10000; i++) { // ++ 출력할때마다 1 더함
			
			dnum = dnum +0.1; // 1 = 1 +0.1; for때문에 반복
		}

		System.out.println(dnum);
	}

} // 나중에 배울꺼니까 지금 안해도됨
