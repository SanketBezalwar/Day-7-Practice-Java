import java.util.Scanner;

public class Array_Ascending {

	public static void main(String[] args) {
		int n;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Elements :");
		n = sc.nextInt();

		System.out.println();

		Integer num[] = new Integer[n];
		System.out.println("Enter the Elements of Array :");
		for (int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
		}

		int temp = 0;

		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}

		System.out.println();

		System.out.println("Elements of Array Sorted in Ascending Order : ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
	}

}
