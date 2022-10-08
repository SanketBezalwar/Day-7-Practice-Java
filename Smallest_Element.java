import java.util.Scanner;

public class Smallest_Element {

	public static void main(String[] args) {
		int num;
		int max;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Elements in the Array : ");
		num = sc.nextInt();

		int a[] = new int[num];
		System.out.println();
		System.out.println("Enter Elements of Array : ");
		for (int i = 0; i < num; i++) {
			a[i] = sc.nextInt();
		}

		max = a[0];
		for (int i = 0; i < num; i++) {
			if (max > a[i]) {
				max = a[i];
			}
		}

		System.out.println();
		System.out.println("Smallest Value : " + max);

	}

}
