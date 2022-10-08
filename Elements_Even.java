
public class Elements_Even {

	public static void main(String[] args) {
		
		int[] num = new int[] { 12, 18, 25, 33, 46, 38, 63, 74, 85, 64, 92 };

		System.out.println("Elements : 12 18 25 33 46 38 63 74 85 64 92 ");

		System.out.println("Array Elements on Even Positions are : ");

		for (int i = 1; i < num.length; i = i + 2) {
			System.out.println(num[i]);
		}

	}

}
