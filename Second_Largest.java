import java.util.Arrays;

public class Second_Largest {

	public static void main(String[] args) {

		int array[] = { 10, 20, 25, 63, 96, 57 };
		int size = array.length;
		Arrays.sort(array);

		System.out.println("Sorted Array : " + Arrays.toString(array));
		System.out.println();

		int res = array[size - 2];

		System.out.println("2nd largest Element is : " + res);
	}

}
