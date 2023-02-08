package casting;

public class ExplicitCasting {
	public static void main(String[] args) {
		int a=9999;
		short b=(short)a;
		System.out.println(b);
		
		byte x=20;
		byte y=20;
		int c=x+y;
		byte d=(byte) c;
		
		System.out.println();
		System.out.println(d);
		
	}

}
