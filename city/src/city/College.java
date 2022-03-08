package city;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class College {
	String name;
	String address;
    String details;

	public College() {
		super();
		// TODO Auto-generated constructor stub
	}

	public College(String name, String address, String details) {
		super();
		this.name = name;
		this.address = address;
		this.details = details;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}


@Override
public String toString() {
	return "College [name="  +name +", address=" + address + ", details=" + details + "]";
}

void collegelist() {
	ArrayList<String> list = new ArrayList<>();
	System.out.println("--------------------List Of colleges in Nagar--------------------");
	list.add(" 1) Nagar College");
	list.add(" 2) New Arts College");
	list.add(" 3) Modern College");
	list.add(" 4) Vikhe Collge");
	list.add(" 5) Mahila College");
	
	
	Iterator<String> itr = list.iterator();
	while (itr.hasNext()) {

		System.out.println(itr.next());
	}
}

void addCollegeDetails() {
	ArrayList<Attraction> list = new ArrayList<>();
	@SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);
	System.out.println(
			" -----------------------------------------------------------------------");
	System.out.println(
			"Enter the number of college  where you wants to visit First:");
	System.out.println(
			"-----------------------------------------------------------------------");
	int option = scanner.nextInt();
	switch (option) {

	case 1:
		System.out.println(
				" --------------Welcome To Nagar College-------------");
		list.add(new Attraction("Nagar College, Ahmednagar, Maharashtra- 414001",
				"It was established in 1947 as the first centre of higher education in Ahmednagar district. The College is committed to the liberal humanist ideals and has been renowned for its active role in social justice initiatives, innovative educational programs, research and community oriented activities."));
		break;
		
	case 2:
		System.out.println(
				" --------------Welcome To New Arts College-------------");
		list.add(new Attraction("New Arts College, Ahmednagar, Maharashtra- 414001",
				"New Arts, Commerce and Science College is an educational institution in Ahmednagar city of state of Maharashtra in India New Arts, Commerce and Science College, Ahmednagar."));
		break;
		
	case 3:
		System.out.println(
				" --------------Welcome To Modern College-------------");
		list.add(new Attraction("Modern College, Ahmednagar, Maharashtra- 414001",
				"t was established in 1947 as the first centre of higher education in Ahmednagar district. The College is committed to the liberal humanist ideals "));
		break;
		
	case 4:
		System.out.println(
				" --------------Welcome To Vikhe College-------------");
		list.add(new Attraction("Vikhe College, Ahmednagar, Maharashtra- 414001",
				"Vikhe Patil Medical College Ahmednagar offers an undergraduate course in Medicine (MBBS) with 150 students per year."));
		break;
		
	case 5:
		System.out.println(
				" --------------Welcome To Mahila College-------------");
		list.add(new Attraction("Mahila College, Ahmednagar, Maharashtra- 414001",
				"Rayat Shikshan Sanstha's Radhabai Kale Mahila Mahavidyalaya, Ahmednagar is a private urban-based, aided educational institution and was established.The duty of administrative unit is to provide the highest quality leadership, essential services and useful products in tune with excellence in teaching"));
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


















