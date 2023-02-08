package casting;

public class upChild extends UpParent {
	public  void m3() {
		System.out.println("m3 method in child class");
	}
	
	public static void main(String[]args) {
		UpParent childobj = new upChild();		// compiler allows this
		childobj.m1();
		childobj.m2();
		System.out.println();
		
		UpParent parentobj = (UpParent)childobj;		// programmer allows this
		parentobj.m1();
		parentobj.m2();
		System.out.println("");
		
	//	UpcastingC ch = new UpcastingP();	// this is not possible
		//compiler not allows this , rule of inheritance
		
	
		
		
	}
}
