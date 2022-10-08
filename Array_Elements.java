import java.util.Scanner;

public class Array_Elements {

	public static void main(String[] args) {
		int length;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Array Length : ");
		length = sc.nextInt();
		int arr[] = new int[length];

		System.out.println();
		System.out.print("Enter the Array Elements : ");
		for (int i = 0; i < length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println();
		System.out.println("The Array Elements are : ");
		for (int i = 0; i < length; i++) {
			System.out.println(arr[i]);
		}

	}

}
