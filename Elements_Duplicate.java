
public class Elements_Duplicate {

	public static void main(String[] args) {

		int[] num = new int[] { 1, 4, 2, 7, 8, 8, 3, 7, 3, 6, 2 };

		System.out.println("Elements : 1 4 2 7 8 8 3 7 3 6 2 ");

		System.out.println();

		System.out.println("Duplicate Elements in Given Array are : ");

		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j])

					System.out.println(num[j]);
			}
		}

	}

}
