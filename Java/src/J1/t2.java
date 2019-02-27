package J1;

public class t2 extends t1{
	
	public static void main(String[] args) {
		
		 
		
		t2 x=new t2();
		x.m3(2, 4);
		x.m4(3, 5);
		x.m1(4, 4);
		x.m2(5, 5);
		
	}
	
	
	public void m1(int a, int b) {
		System.out.println(a+b);
	}
	
	public void m2(int a, int b) {
		System.out.println(a*b);
	}

}
