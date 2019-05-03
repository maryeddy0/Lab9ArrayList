import java.util.Arrays;
import java.util.Scanner;

//Mary Eddy
public class Lab9ArrayList {
	public static void main(String[] args) {
		System.out.println("Welcome to Geunters Market");
		Scanner scan = new Scanner(System.in);
		System.out.println();

		// Parallel array of items and prices
		String columns = "Items" + "Prices";
		String[] items = { "apple", "banana", "cauliflower", "dragonfruit", "Elderberry", "figs", "grapefruit",
				"honeydew" };
		double[] prices = { .99, .59, 1.59, 2.19, 1.79, 2.09, 1.99, 3.45 };

		// print in a grid
		System.out.println("Items\t" + "\t\tPrices");
		for (int i = 0; i < items.length; i++) {
			System.out.printf(" %-20s $%.2f%n", items[i], prices[i]);
		}

		// order an item
		Validator.getString(scan, "What item would you like to order?\n");
		String itemSelect = scan.nextLine();


		int index = findItem(itemSelect, items);
		getStringMatchingArray(itemSelect,"You added", items);
		System.out.println(index);
		

		if (index >= 0 && index <= 7) {
			System.out.println("adding " + itemSelect + " to your cart at");
		} else {
			System.out.println("Sorry, we dont have those. Please try again.");
		}
	}

	public static int findItem(String itemSelect, String[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(itemSelect)) {
				count = i;
				return count;
			}
		}
		return count;
	}

	public static int sumArray(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = i;
			if (sum == sum + (arr[i])) {

			}
		}
		return sum;
	}

	public static String getStringMatchingArray(String itemSelect, String prompt, String[] arr) {
		boolean isValid = false;
		String input;
		do {
			for (int i = 0; i < arr.length; i++) {
			if (itemSelect.matches(arr[i])) {
				isValid = true;
			}
		} 
	}while (!isValid);
		return itemSelect;
		}

}