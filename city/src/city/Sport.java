package city;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Sport {
	String name;
    String details;

	public Sport() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Sport(String name,  String details) {
		super();
		this.name = name;
		
		this.details = details;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}


@Override
public String toString() {
	return "Sport[name="  +name +",  details=" + details + "]";
}

void sportlist() {
	ArrayList<String> list = new ArrayList<>();
	System.out.println("--------------------List Of Sport in Nagar--------------------");
	list.add(" 1) Gaurav Sports");
	list.add(" 2) Prerana Enterprises & Sports");
	list.add(" 3) Kundan Fitness Companion");
	list.add(" 4) Classic Sport");
	list.add(" 5) Tara Sports – Savedi.");
	
	
	Iterator<String> itr = list.iterator();
	while (itr.hasNext()) {

		System.out.println(itr.next());
	}
}

void addSport() {
	ArrayList<Attraction> list = new ArrayList<>();
	@SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);
	System.out.println(
			" -----------------------------------------------------------------------");
	System.out.println(
			"Enter the number of Sport where you wants to visit First:");
	System.out.println(
			"-----------------------------------------------------------------------");
	int option = scanner.nextInt();
	switch (option) {

	case 1:
		System.out.println(
				" --------------Gaurav Sports--------------");
		list.add(new Attraction("Gaurav Sports",
				" Balikashram Road.\r\n"
				+ "Bagade Mala, Balikashram Road, Ahmednagar Ho,\r\n"
				+ "Ahmednagar – 414001\r\n"
				+ "Phone no: (0241) 2325513."));
		break;
		
	case 2:
		System.out.println(
				" --------------Prerana Enterprises & Sports--------------");
		list.add(new Attraction("Prerana Enterprises & Sports,Gaurav Sports",
				"2030, Daware Lane, Near Hanuman Mandir,\r\n"
				+ "Ahmednagar HO, Ahmednagar – 414001\r\n"
				+ "Phone no: (0241) 2341859. "));
		break;
	case 3:
		System.out.println(
				" --------------Kundan Fitness Companion--------------");
		list.add(new Attraction("Kundan Fitness Companion",
				" Chitale Road.\r\n"
				+ "374, Chowpati Karanja, Chitale Road,\r\n"
				+ "Ahmednagar – 414001\r\n"
				+ "Phone no: (0241) 2345972. "));
		break;
	case 4:
		System.out.println(
				" --------------Classic Sport--------------");
		list.add(new Attraction("Classic Sport",
				"Shila Vihar Road, Ahmednagar Ho,\r\n"
				+ "Ahmednagar - 414001\r\n"
				+ "Phone no: 9028922028. "));
		break;
	case 5:
		System.out.println(
				" --------------Tara Sports – Savedi--------------");
		list.add(new Attraction("Tara Sports – Savedi",
				"Savedi.\r\n"
				+ "Savitribai Phule Complex, Akashwani Kendra, Akashwani road,\r\n"
				+ "Savedi, Ahmednagar – 414003\r\n"
				+ "Phone no: 9823234039."));
		break;
		
	default:
		System.out.println(
				" No Attractive foods are Available..");
	}

	Iterator<Attraction> itr = list.iterator();
	while (itr.hasNext()) {

		System.out.println(itr.next());
	}
}

}

