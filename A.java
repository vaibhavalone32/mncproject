
package Array2;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		int a[] = new int[size];

		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter the no");
			a[i] = sc.nextInt();

		}

		System.out.println("print element");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
