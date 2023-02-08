package strings;

//charAt(int index)
public class StringMethods {
	public static void main(String[] args) {
		String a = "keshavendra";
		char z = a.charAt(10);// Provides value of char at particular index
		char x = a.charAt(2);
		System.out.println(a);
		System.out.println("Provides value of char at particular index ");
		System.out.println(z + "\n" + x);
		System.out.println("");

		// Concat(String s)
		a = "keshavendra";
		String b = "Anand";
		String c = "Dhuriya";
		System.out.println(a + " " + " " + b + " " + c);
		System.out.println("Concat add 2 or more strings");
		String k = a.concat(b).concat(c);// #2
		String l = k.concat(c); // #1
		System.out.println(k);
		System.out.println("\n" + l);

		/*
		 * Equals(object 0) This method is used to check content of other string while
		 * it is exactly matching with reference string or not
		 */
		String d = "keshavendra";
		System.out.println(a.equals(b));
		System.out.println(a.equals(d));
		System.out.println("");

		// Equals ignore case
		// EqualIgnoreCase(String AnotherVar)
		// Compare the string content ignoring the case of characters

		String D = "KESHAVENDRA";
		System.out.println(d.equalsIgnoreCase(D));
		System.out.println(D.equalsIgnoreCase(d));
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println("");

		// substring(int beginIndex)
		// method is to create another string from the given string

		String e = "keshavendra";
		String var = e.substring(2);
		System.out.println(var);
		System.out.println("");

		// substring(int beginIndex, int endIndex)
		/*
		 * this method is to create another string from given string with begin index
		 * and end index.
		 */

		a = "KeshavendraAnandDhuriyakeshavendraananddhuriya";
		String obj = a.substring(11, 23);
		System.out.println(obj);
		System.out.println("");

		// length()
		// Method returns length of particular string

		int abc = a.length();
		System.out.println(abc);
		System.out.println("");

		// replace(char old, char new)
		// this method is used to replace characters with another char from string

		String name = "keshavendra";
		System.out.println(name);
		String newname = name.replace("kes", "mad");
		System.out.println(newname);
		System.out.println("");
		
		

		// to upperCase()
		// Convert the given lower case string into uppercase
		String up = name.toUpperCase();
		System.out.println(name);
		System.out.println(up);
		System.out.println();
		System.out.println(newname);
		String upp = newname.toUpperCase();
		System.out.println(upp);
		System.out.println("");

		// toLowerCase()
		// Convert the given upper case string into lower case

		System.out.println(up);
		String lo = up.toLowerCase();
		System.out.println(lo);
		System.out.println();
		System.out.println(upp);
		String low = upp.toLowerCase();
		System.out.println(low);
		System.out.println();

		// Trim()
		// This method is used to remove prefix and suffix spaces of string

		String NAME = "    keshavendra       ";
		String NEWNAME = NAME.trim();
		System.out.println(NAME);
		System.out.println(NEWNAME);
		System.out.println("");

		// indexOf(char ch)
		// this method returns index of particular char in string

		int ind = NEWNAME.indexOf('h');
		System.out.println(NEWNAME);
		System.out.println(ind);
		System.out.println();

		// lastIndexOf(int ch)
		// this method will return the last appeared char index value available
		// in string

		int xo = NEWNAME.lastIndexOf("a");
		System.out.println(NEWNAME);
		System.out.println(xo);
		System.out.println();

		// contains(String charSequence)
		// Particular char sequence is present in string or not

		String ke = "KeshavendraDhuriyaFromMumbai";
		boolean Con = ke.contains("mumbai");
		System.out.println(ke);
		System.out.println(Con);
		System.out.println();
		boolean dhu = a.contentEquals(c);
		System.out.println(dhu);
		System.out.println();

		// toCharArray():
		// this method converts the string into character array

		String kes = "keshavendradhuriya";
		char[] number = kes.toCharArray();
		for (int i = 1; i < number.length; i++) {
			System.out.print(number[i]+" ");
			System.out.println(" ");
		}

		// isDigit(char ch)
		// This method is used to check whether the given char is digit or not
		
			String dig = "0to1";
			char ch = dig.charAt(0);
			boolean variable = Character.isDigit(ch);
			System.out.println(variable);
			System.out.println();
		
		
		//	spilit(String regex)
		//	this method is used to spilit the string
	
	
			String name1="kehavendra anand dhuriya from mumbai";
			String [] output = name1.split("\\s");
			for(String dhuriya : output) {
			System.out.println(dhuriya);
			System.out.println();
			}
	
		//	isBlank()    and isEmpty() 
		//	isBlank() method is used to return value in Boolean which 
		//	represent sting is blank or not 
	
			String is =" ";
			System.out.println("this string is blank: "+"'    '");
			boolean v12 = is.isBlank();
			System.out.println(v12);
			System.out.println("this string is empty: "+"'    '");
			boolean v11 = is.isEmpty();
			System.out.println(v11);
			System.out.println("\n");
			
			String isnot ="";
			System.out.println("this string is blank: "+"''");
			boolean v112 = isnot.isBlank();
			System.out.println(v112);
			System.out.println("this string is empty: "+"''");
			boolean v111 = isnot.isEmpty();
			System.out.println(v111);
			System.out.println("\n");
			
			
			String it ="ab c a  a";
			System.out.println("this string is blank: "+"ab c a  a");
			boolean v1122 = it.isBlank();
			System.out.println(v1122);
			System.out.println("this string is empty: "+"ab c a  a");
			boolean v1121 = it.isEmpty();
			System.out.println(v1121);
			System.out.println("\n");
			
	}		
}
