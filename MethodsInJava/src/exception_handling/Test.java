package exception_handling;

public class Test {
public static void main(String[]args) {
	System.out.println("1");
	System.out.println("2");
	System.out.println("3");
	try {
	System.out.println(100/0);
	}
	catch(ArithmeticException refvar) {
		System.out.println("number is not devide by 0");
	}
	System.out.println("4");
	System.out.println("5");
	System.out.println("6");
}
}
