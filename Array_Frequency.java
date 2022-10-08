
public class Array_Frequency {

	public static void main(String[] args) {
		int[] num = new int[] { 10, 30, 10, 20, 10, 20, 30, 40 };
		int[] freq = new int[num.length];

		int counted = -1;

		for (int i = 0; i < num.length; i++) {
			int count = 1;
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					count++;
					freq[j] = counted;
				}
			}
			if (freq[i] != counted)
				freq[i] = count;
		}

		for (int i = 0; i < freq.length; i++) {
			if (freq[i] != counted)
				System.out.println("Element : " + num[i] + "    Frequency : " + freq[i]);
		}
	}
}
