package pl.travel.office;

import pl.travel.office.classes.TravelOffice;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        TravelOffice travelOffice = new TravelOffice();
        MainHandler mh = new MainHandler(travelOffice);

        Scanner scan = new Scanner(System.in);
        top: while(true){
            System.out.println("SELECTION OPTION: ");
            System.out.println("1 - Add Customer");
            System.out.println("2 - Add trip");
            System.out.println("3 - Assign trip to customer");
            System.out.println("4 - Remove Customer");
            System.out.println("5 - Remove Trip");
            System.out.println("6 - Show Customers");
            System.out.println("7 - Show Trips");
            System.out.println("0 - Exit");
            int choice;
            if (scan.hasNextInt()) {
                choice = scan.nextInt();
            } else {
                scan.next(); // przeczytanie blednej danej z bufora
                continue;
            }
            switch (choice) {
                case 1:
                    mh.addCustomer();
                    break;
                case 2:
                    mh.addTrip();
                    break;
                case 3:
                    mh.assignTripToCustomer();
                    break;
                case 4:
                    mh.removeCustomer();
                    break;
                case 5:
                    mh.removeTrip();
                    break;
                case 6:
                    mh.showCustomers();
                    break;
                case 7:
                    mh.showTrips();
                    break;
                case 0:
                    break top;
                default:
                    break;
        }
    }
		scan.close();
    }
}

