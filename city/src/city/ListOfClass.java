package city;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ListOfClass {
	ArrayList<String> list = new ArrayList<>();

	public void show() {

		list.add(
				"1) Attraction");
		list.add(
				"2) College");
		list.add(
				"3) Food");
		list.add(
				"4) Hospital");
		list.add(
				"5) Hotel");
		
		list.add(
				"6) Sport");
		

		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {

			System.out.println(itr.next());
		}

	}

	void display() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"===========================================================");
		System.out.println(
				"Enter the Number of Spot Where you want to visit First:");
		System.out.println(
				" ===========================================================");
		int option = scanner.nextInt();
		switch (option) {

		case 1:
			System.out.println(
					" Attraction");
			System.out.println(
					"**************");
			System.out.println(
					"Press 1 for more details");
			System.out.println(
					"*****************************");
			break;

		
		case 2:
			System.out.println(
					" College");
			System.out.println(
					"**************");
			System.out.println(
					"Press 2 for more details");
			System.out.println(
					"*****************************");
			break;
		case 3:
			System.out.println(
					" Food");
			System.out.println(
					"**************");
			System.out.println(
					"Press 3 for more details");
			System.out.println(
					"*****************************");
			break;
		case 4:
			System.out.println(
					" Hospital");
			System.out.println(
					"**************");
			System.out.println(
					"Press 4 for more details");
			System.out.println(
					"*****************************");
			break;
		case 5:
			System.out.println(
					" Hotel");
			System.out.println(
					"**************");
			System.out.println(
					"Press 5 for more details");
			System.out.println(
					"*****************************");
			break;
		case 6:
			System.out.println(
					" Sport");
			System.out.println(
					"**************");
			System.out.println(
					"Press 5 for more details");
			System.out.println(
					"*****************************");
			break;

		default:
			System.out.println(
					" ----------------------------Please Enter the Valid Number -----------------------------");

		}

	}

}
