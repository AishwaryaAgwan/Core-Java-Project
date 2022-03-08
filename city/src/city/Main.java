package city;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
       System.out.println("============================================================================================");
       System.out.println("                                            WELCOME                                         ");
       System.out.println("============================================================================================");
     MainManage();
    }

	private static void MainManage() {
		 System.out.println("                     List of Nagar city                                                    ");
		 System.out.println(" ==========================================================================================");
		 
		 ListOfClass loc = new ListOfClass();
		 loc.show();
		 loc.display();
		 
		 
		 char choice;
		 @SuppressWarnings("resource")
		 Scanner scanner = new Scanner(System.in);
		 int option = scanner.nextInt();
		 switch (option) {
		 
		 case 1:
			 Attraction attr= new Attraction();
			 attr.attractlist();
			 attr.addAttraction();
			 break;
			 
		 case 2: 
			 College clg = new College();
			 clg.collegelist();
			 clg.addCollegeDetails();
			 break;
			 
		 case 3: 
			 Food fd = new Food();
			 fd.foodList();
			 fd.addFood();
			 break;
			
		 case 4: 
			 Hospital hosp = new Hospital();
			 hosp.hospitalList();
			hosp.addHospital();
			break;
			 
		 case 5: 
			 Hotel htl = new Hotel();
			 htl.hotellist();
			 htl.addHotel();
			 break;
			 
		 case 6: 
			Sport sp = new Sport();
			sp.sportlist();
			sp.addSport();
			break;
			
			
			default:
			System.out.println("No Option");
		 }
		 System.out.println("============================================================================================");	 
		 System.out.println("                                                                  Want to Visit else (y/n)  ");	 
		 System.out.println("============================================================================================");	 
		 System.out.println("============================================================================================");	 
		 
		 choice = scanner.next().charAt(0);
		 if(choice == 'y' || choice == 'Y'){
		 MainManage();
		 }else
		 {
		System.out.println("============================================================================================ ");	 
		 System.out.println("                                                                               Thank You!!  ");	 
		 System.out.println("============================================================================================");	
				 
		
	}
}
}