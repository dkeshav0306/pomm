package test;

public class String_Reverse_Middle_String {
	public static void main(String[] args) {

		String str = "abc xyz lmn abc1";
		String ar[] = str.split(" ");
		for (int i = 0; i <= ar.length - 1; i++) {
			if ((i % 2) != 0) {
				String s1 = ar[i];
				ar[i] = RevString(s1);
			}
		}

		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + " ");
		}

	}

	// It will reverse given String
	public static String RevString(String inp) {
		String rev = "";
		for (int j = inp.length() - 1; j >= 0; j--) {
			rev = rev + inp.charAt(j);
		}
		return rev;
	}
}