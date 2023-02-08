package test;

public class RevStrArray {
public static void main(String[] args) {
	String a ="avvc snc hud sdt";
		//String [] rev = a.split(" ");
		
	char[] rev = a.toCharArray();	
	for(int i=rev.length-1; i>=0;i--) {
			System.out.print(rev[i]+" ");
		}
	
}
}
