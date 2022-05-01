package WebElementMethodes;

import java.lang.reflect.Array;
import java.util.Scanner;

public class task {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = sc.nextInt();
		System.out.println("Enter Values");
		int[] a = new int[size];
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			temp = 0;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]==5) {
				System.out.println("no. 5 is present");
				
			}
			System.out.print(a[i] + " ");
		}
	}

}
