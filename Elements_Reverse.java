
public class Elements_Reverse {

	public static void main(String[] args) {
		int[] num = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		System.out.println("Original Array : ");

		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}

		System.out.println();

		System.out.println();
		System.out.println("Array in Reverse Order : ");

		for (int i = num.length - 1; i >= 0; i--) {
			System.out.print(num[i] + " ");
		}

	}

}
