package test;

public class Demo {
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5-i;j++) {
				System.out.print("\t");
			}
			for(int j = 1; j <= 2*i-1; j++) {
				System.out.print("\t*");
			}
			System.out.println();
		}
		for(int i = 4; i >= 1; i--) {
			for(int j = 4-i+1; j >= 1;j--) {
				System.out.print("\t");
			}
			for(int j = 2*i-1; j >=1 ; j--) {
				System.out.print("\t*");
			}
			System.out.println();
		}
	}    
}
