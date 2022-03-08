package city;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Food {
	String foodName;
	String address;

	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Food(String address, String foodName) {
		super();
		this.address = address;
		this.foodName = foodName;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Food[address=" + address + ", foodName="   +foodName+"]";
	}

	void foodList() {
		ArrayList<String> list = new ArrayList<>();
		System.out.println("--------------------List Of food--------------------");
		list.add(" 1) Kadhi-wada");
		list.add(" 2) full-thali ");
		list.add(" 3) pizza");
		list.add(" 4) chinese");
		list.add(" 5) Chapati, Bhakri and Bhaji along with rice & dal/amti");
		
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {

			System.out.println(itr.next());
		}
	}
	void addFood() {
		ArrayList<Attraction> list = new ArrayList<>();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				" -----------------------------------------------------------------------");
		System.out.println(
				"Enter the number of food where you wants to visit First:");
		System.out.println(
				"-----------------------------------------------------------------------");
		int option = scanner.nextInt();
		switch (option) {

		case 1:
			System.out.println(
					" --------------Kadhi-wada--------------");
			list.add(new Attraction("Kadhi-wada, choupati Ahmednagar, Maharashtra- 414001",
					"Order Food Online from Chaupati Kadhi Wada Centre Savedi Savedi and see it's menu for Home Delivery in Ahmednagar. Fastest delivery"));
			break;
	
		case 2:
			System.out.println(
					" --------------full-thali--------------");
			list.add(new Attraction("full-thali, Raj Restaurant, choupati Ahmednagar, Maharashtra- 414001",
					"Ahmednagar is famous for its cuisine from street food to everything this city ... If you want full non vegetarian dishes including chicken handi to tikka or ..."));
			break;
		case 3:
			System.out.println(
					" --------------pizza--------------");
			list.add(new Attraction("pizza, black corner choupati Ahmednagar, Maharashtra- 414001",
					"Pizza Restaurants in Ahmednagar · Anand Kacchi Dabeli & Pizza Corner · Evening Points Punjabi Hut · Cafe Katta · Gold Rush Cafe · Delicious Sandwich · Hotel Shraddha."));
			break;
		case 4:
			System.out.println(
					" --------------chinese--------------");
			list.add(new Attraction("chinese, king cafe  Ahmednagar, Maharashtra- 414001",
					" Chinese Restaurants in Ahmednagar. Book a Table. Order Food Online. Find Best Restaurants serving Chinese Food, Chinese Cuisine, Veg & Non Veg Chinese ..."));
			break;
		case 5:
			System.out.println(
					" ----------------Chapati, Bhakri and Bhaji along with rice & dal/amti------------");
			list.add(new Attraction("Chapati, Bhakri and Bhaji along with rice & dal/amti, garwa hotel, Ahmednagar, Maharashtra- 414001",
					"Chapati, Bhakri and Bhaji along with rice & dal/amti are pretty much the basic staple of most Ahmednagar people. Bhakri, which is losing popularity in neighboring cities like Mumbai and Pune, is still very much popular in this part of the world."));
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

	
	
	

	