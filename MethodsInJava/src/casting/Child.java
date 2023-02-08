package casting;

public class Child extends Parent {
	public void m3() {
		System.out.println("m3 method in child class");
	}

	public static void main(String[] args) {
//	Child ch = new Parent();		//this is not possible in java complier not allow this
		// rule of inheritance .

	/*	Parent pobj = new Parent();
		Child cobj=(Child)pobj;
		cobj.m1();
		cobj.m2();
		cobj.m3();*/
		
		// by Ref 
		Parent pref = new Child();
		Child cref = (Child)pref;
		cref.m1();
		cref.m2();
		cref.m3();
		
		
	}

}
