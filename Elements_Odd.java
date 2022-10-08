
public class Elements_Odd {

	public static void main(String[] args) {

		int[] num = new int[] { 11, 32, 41, 58, 47, 63, 20, 33, 74 };

		System.out.println("Elements : 11 32 41 58 47 63 20 33 74 ");
		
		System.out.println();

		System.out.println("Array Elements on Even Positions are : ");

		for (int i = 0; i < num.length; i = i + 2) {
			System.out.println(num[i]);
		}

	}

}
