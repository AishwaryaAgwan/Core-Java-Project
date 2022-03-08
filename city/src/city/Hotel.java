package city;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Hotel {
	String name;
    String details;

	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hotel(String name,  String details) {
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
	return "Hotel[name="  +name +",  details=" + details + "]";
}

void hotellist() {
	ArrayList<String> list = new ArrayList<>();
	System.out.println("--------------------List Of Hotels in Nagar--------------------");
	list.add(" 1) Hotel Radinace");
	list.add(" 2) Iris Premiere");
	list.add(" 3) V Star ");
	list.add(" 4) Aurus");
	list.add(" 5) OYO");
	
	
	Iterator<String> itr = list.iterator();
	while (itr.hasNext()) {

		System.out.println(itr.next());
	}
}

void addHotel() {
	ArrayList<Attraction> list = new ArrayList<>();
	@SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);
	System.out.println(
			" -----------------------------------------------------------------------");
	System.out.println(
			"Enter the number of Hotel where you wants to visit First:");
	System.out.println(
			"-----------------------------------------------------------------------");
	int option = scanner.nextInt();
	switch (option) {

	case 1:
		System.out.println(
				" --------------Hotel Radinace--------------");
		list.add(new Attraction("Hotel Radinace, main Road Ahmednagar, Maharashtra- 414001",
				"Set in Ahmadnagar, Hotel Radiance features a bar and a terrace. Among the facilities of this property are a restaurant, a 24-hour front desk and room service, along with free WiFi throughout the... The hotel is well maintained as a new property , very well served by the staff . The facilities are up to 4star standards. It was cosy and comfortable stay worth a stay. Next time I will surely visit Ahmednagar just to take the hotel service of radiance"));
		break;
		
	case 2:
		System.out.println(
				" --------------Iris Premiere--------------");
		list.add(new Attraction("Iris Premiere, main Road Ahmednagar, Maharashtra- 414001",
				"Iris Premiere is offering accommodation in Ahmadnagar. Among the facilities of this property are a restaurant, a 24-hour front desk and room service, along with free WiFi. Location was superb . Rooms were clean and staff was supportive . The room service was also very prompt ."));
		break;
	case 3:
		System.out.println(
				" --------------V Star --------------");
		list.add(new Attraction("V Star , main Road Ahmednagar, Maharashtra- 414001",
				"V Star provides rooms in Ahmadnagar. With free WiFi, this 3-star hotel offers a 24-hour front desk. There is a restaurant serving Indian cuisine, and free private parking is available. Its neat and clean. Rooms are spacipus. Nice comfy bed. Good wifi. Food served in the room was good. decetly priced."));
		break;
	case 4:
		System.out.println(
				" --------------Aurus--------------");
		list.add(new Attraction("Aurus, main Road Ahmednagar, Maharashtra- 414001",
				"Hotel Aurus is located in Ahmadnagar and features a garden and a terrace. Food was tasty and hygienic too"));
		break;
	case 5:
		System.out.println(
				" --------------OYO--------------");
		list.add(new Attraction("OYO, main Road Ahmednagar, Maharashtra- 414001",
				"OYO 65819 Hotel Gopi Lodging offers rooms in Ahmadnagar. The units in the hotel are equipped with a TV. Guests at OYO 65819 Hotel Gopi Lodging can enjoy a continental breakfast."));
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




		
		
		