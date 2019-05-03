import java.util.ArrayList;
import java.util.Scanner;

public class Lab9ArrayLists {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

//	ArrayList<String> columns = new ArrayList<>();
//	columns.add("Products");
//	columns.add("Prices");
		String format = "%-20s %-20s\n";
		String flag = null;
		
		ArrayList<String> products = new ArrayList<>();
		products.add("apple");
		products.add("banana");
		products.add("cauliflower");
		products.add("dragonfruit");
		products.add("Elderberry");
		products.add("figs");
		products.add("grapefruit");
		products.add("honeydew");
		// System.out.println(products);

		ArrayList<Double> prices = new ArrayList<>();
		prices.add(.99);
		prices.add(.59);
		prices.add(1.59);
		prices.add(2.19);
		prices.add(1.79);
		prices.add(2.09);
		prices.add(1.99);
		prices.add(3.45);
		// System.out.println(prices);

		//Shopping cart
		ArrayList<String>cartProd = new ArrayList<>();
		ArrayList<String>cartPrice = new ArrayList<>();
		
		
		// proram begins Here
		System.out.println("WELCOME TO GEUNTERS MARKET!\n");

	
		do {
			
			// Marketplace products and prices
		System.out.printf(format, "Item", "Price");
		System.out.println("--------------------------");
		for (int i = 0; i < products.size() - 1; i++) {
			System.out.printf(format, products.get(i), prices.get(i));
			System.out.println("--------------------------");
		}
		// order promt
		System.out.println();
		System.out.println("What item would you like to order?");
		String item = scan.nextLine();
		
		
		//Check if item is in array, followed by message
		System.out.println(checkArray1(products, item, prices));
		System.out.println();
	
		//if valid add to cart
		if(checkArray(products,item)) {
		cartProd.add(item);
		cartPrice.add(item);
		}
		
		//Shop again
		System.out.println("Would you like to order anything else? y/n");
		flag = scan.nextLine();
		
		}while(flag.equalsIgnoreCase("y"));
		
		//Display cart
		System.out.println("Here are your items: ");
		System.out.printf(format, "Item", "Price");
		System.out.println("--------------------------");
		for (int i = 0; i < cartProd.size(); i++) {
		System.out.printf(format, cartProd.get(i),cartPrice.get(i));
		System.out.println("--------------------------");
		}
		
		scan.close();
	}

	public static boolean checkArray(ArrayList<String> products, String item) {
		boolean checkContents = products.contains(item);
		if (checkContents) {
			// System.out.println(checkContents);
			System.out.println();
		}
		return false;
	}

	public static String checkArray1(ArrayList<String> products, String item, ArrayList<Double> price) {
		int index = products.indexOf(item);
		if (index >= 0 && index <= 7) {
			return "Adding " + item + " to your cart for " + price.get(index) + ".";
		}
		return "Sorry, we dont have those.";
	}
//	private static int sumAvg(ArrayList<Double> price) {
//	int sum =0;
//		for (int i = 0; i < price.size(); i++) {
//			sum = (i + price(i)) / i;
//		}
//		return sum;
//	}
}
