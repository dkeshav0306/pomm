package casting;

public class ImplicitCasting {
	public static void main(String[] args) {
		byte a=10;
		short b=a;
		int c=b;
		long d=c;
		double e=d;
		System.out.println(e);
		
		byte x=10;
		short y=(short)x;
		int z=(int)y;
		System.out.println(z);
	}
}
