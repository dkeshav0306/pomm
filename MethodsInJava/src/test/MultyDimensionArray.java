package test;

public class MultyDimensionArray {
	public static void main(String[]args) {
		int a [][]= {{1,2},{5,6}};
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
