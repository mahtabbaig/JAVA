import java.util.Scanner;

public class sum_av {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of elements: ");
		int count = scanner.nextInt();
		int sum = 0;

		System.out.println("Enter the array elements:");
		for (int index = 0; index < count; index++) {
			sum += scanner.nextInt();
		}

		double average = (double) sum / count;
		System.out.println("Sum = " + sum);
		System.out.println("Average = " + average);

		scanner.close();
	}
}
