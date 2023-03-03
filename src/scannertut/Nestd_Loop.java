package scannertut;

public class Nestd_Loop {


public static void main(String[] args) {
	int a=0;
	for (int i = 3; i >=a; i--) {
		for (int j = 3; j >=i; j--) {
			System.out.print(i);
		}
		System.out.println();
		}
		System.out.println("End of nested loop");
	}
}