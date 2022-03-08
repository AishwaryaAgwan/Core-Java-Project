package city;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Hospital {
	String name;
	String details;

	public Hospital() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hospital(String name, String details) {
		super();
		this.name = name;
		this.details= details;
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
		return "Hospital[name=" + name + ", details=" + details + "]";
	}

	void hospitalList() {
		ArrayList<String> list = new ArrayList<>();
		System.out.println("--------------------List Of Hospitals-------------");
		list.add(" 1) Civil Hospial");
		list.add(" 2) Asian Nobel Hospital");
		list.add(" 3) Patil Hospital");
		list.add(" 4) Shraddha Hospital");
		list.add(" 5) Sai Hospital");
		list.add(" 6) Zaware Hospital");
		
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {

			System.out.println(itr.next());
		}
	}	
	
	void addHospital() {
		ArrayList<Attraction> list = new ArrayList<>();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				" -----------------------------------------------------------------------");
		System.out.println(
				"Enter the number of Hospital where you wants to visit First:");
		System.out.println(
				"-----------------------------------------------------------------------");
		int option = scanner.nextInt();
		switch (option) {

		case 1:
			System.out.println(
					" ------------Civil Hospital----------------");
			list.add(new Attraction("Civil Hospital, Ahmednagar, Maharashtra- 414001",
					"Government General Hospitals in Ahmednagar"));
			break;
			
		case 2:
			System.out.println(
					" ------------Asian Nobel Hospital----------------");
			list.add(new Attraction("Asian Nobel Hospital, Ahmednagar, Maharashtra- 414001",
					"Among the finest Hospitals in the city, Asian Noble Hospital Pvt Ltd in Savedi Road, Ahmednagar is known for offering excellent patient care"));
			break;
		case 3:
			System.out.println(
					" -----------Patil Hospital-----------------");
			list.add(new Attraction("Patil Hospital, Ahmednagar, Maharashtra- 414001",
					"Established in the year 1993, Patil Hospital and Dental Clinic in Station Road, Ahmednagar is a top player in the category Private Hospitals in the Ahmednagar."));
			break;
		case 4:
			System.out.println(
					" -------------Shraddha Hospital---------------");
			list.add(new Attraction("Shraddha Hospital, Ahmednagar, Maharashtra- 414001",
					"Established in the year 2009, SHRADDHA HOSPITAL Dr Deshmukh Mother and Child Care Hospital in Chitale Road, Ahmednagar is a top player in the category Hospitals "));
			break;
		case 5:
			System.out.println(
					" ------------Sai Hospital----------------");
			list.add(new Attraction("Sai Hospital, Ahmednagar, Maharashtra- 414001",
					"Sai Asian Hospital is a leading, integrated healthcare delivery provider in the Ahmednagar. We providing healthcare facility in OPD, Primary care, Secondary"));
			break;
		case 6:
			System.out.println(
					" -----------Zaware Hospital-----------------");
			list.add(new Attraction(", Ahmednagar, Maharashtra- 414001",
					"Zaware Patil Hospital & Nursing Home, Hospitals in Nalegaon, Ahmednagar. Book Appointment Online. View Fees, Visiting Time, Contact Number"));
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
		
			
			
			
			