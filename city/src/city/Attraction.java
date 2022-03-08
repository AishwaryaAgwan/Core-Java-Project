package city;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Attraction {
	String address;
	String description;

	public Attraction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Attraction(String address, String description) {
		super();
		this.address = address;
		this.description = description;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Attraction [address=" + address + ", description=" + description + "]";
	}

	void attractlist() {
		ArrayList<String> list = new ArrayList<>();
		System.out.println("--------------------List Of Attractive places--------------------");
		list.add(" 1) Mula Dam");
		list.add(" 2) Tulsi Bag");
		list.add(" 3) Aanand garden");
		list.add(" 4) Army Training Center");
		list.add(" 5) Datta Mandir");
		list.add(" 6) Choupati");
		
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {

			System.out.println(itr.next());
		}
	}

	void addAttraction() {
		ArrayList<Attraction> list = new ArrayList<>();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				" -----------------------------------------------------------------------");
		System.out.println(
				"Enter the number of Attractive Spot where you wants to visit First:");
		System.out.println(
				"-----------------------------------------------------------------------");
		int option = scanner.nextInt();
		switch (option) {

		case 1:
			System.out.println(
					" --------------Welcome To Mula Dam--------------");
			list.add(new Attraction("Mula Dam, Ahmednagar, Maharashtra- 414001",
					"Also called as Dnyaneshwar Sagar Dam, Mula Dam is situated near the Mahatma Phule Krishi Vidyapeeth.  Popular for its beautiful surroundings and boating facilities, the dam is one of the popular picnic spots around Ahmednagar. It’s surrounding lush greenery and clean water attracts hordes of tourists."));
			break;

		case 2:
			System.out.println(
					"---------------Welcome To Tulsi Bag---------------");
			list.add(new Attraction("Tulsi Bag, Ahmednagar, Maharashtra- 414001",
					"Tulsi Baug is famous for budget shopping of crockery, clothing, cosmetics, bags, stationery, shoes etc"));
			break;
         
		case 3:
			System.out.println(
					" --------------Welcome To Aanand garden--------------");
			list.add(new Attraction("Aanand garden, Ahmednagar, Maharashtra- 414002",
					"Anand Garden Mangal Karyalay in Supa, Ahmednagar. is one of the most sought after one banqueting facilities in the city. It was setup with a view to provide an ..."));
					 break;
			
		case 4:
			System.out.println(
					" --------------Welcome To Army Training Center--------------");
			list.add(new Attraction("army Training center, Ahmednagar, Maharashtra- 414001",
					"Ahmednagar. Army Training Centres. Arya Career Academy. Abhishek Apartment, Tilak Road, Wadiya Park, Ahmednagar - 414001, Near Raj Palace Opposite Jaltarantalav. Ahmednagar."));
			break;
			
		case 5:
			System.out.println(
					" --------------Welcome To Datta Mandir--------------");
			list.add(new Attraction("datta Mandir, Ahmednagar, Maharashtra- 414001",
					"Shree Datta Kshetra. The temple was constructed with a view to provide peace of mind to future generations. · Festivals and Events. Every year, four main ..."));
			break;	
		
		case 6:
			System.out.println(
					" --------------Choupati--------------");
			list.add(new Attraction("Choupati, Ahmednagar, Maharashtra- 414001",
					"Choupati Chat Corner in Kedgaon, Ahmednagar. Fast Food. Get Restaurant Menu, Address, Contact Number, Photos, Services Offered, Maps of Choupati Chat Corner ..."));
			break;

		default:
			System.out.println(
					" No Attractive Spots are Available..");
		}

		Iterator<Attraction> itr = list.iterator();
		while (itr.hasNext()) {

			System.out.println(itr.next());
		}
	}

}
