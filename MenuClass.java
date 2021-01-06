package StockBookPack;

import java.util.Scanner;


public class MenuClass {
	WorkClass wc = new WorkClass();
	void mainMenu() {
		System.out.println("Select type want to access:");
		System.out.println("Type 1 - Pesticide");
		System.out.println("Type 2 - Fertilizer");
		System.out.println("Type 3 - Exit");
		System.out.print("choice: ");
	}
	
	void subMenu() {
		System.out.println("Type 1 - View Stock");
		System.out.println("Type 2 - Sell Stock");
		System.out.println("Type 3 - Enter Stock");
		System.out.println("Type 4 - Exit");
		System.out.print("choice: ");
	}
	
	Scanner scan = new Scanner(System.in);
	String s;
	Integer i;
	int choiceOne = 0;
	int choiceTwo = 0;
	void menu1() {
		
		System.out.println("Welcome to My Stock Book :) ");
		mainMenu();
		choiceOne = scan.nextInt();
		System.out.println();
		switch(choiceOne) {
		case 1:
			menu21();
			break;
		case 2:
			menu22();
			break;
		case 3:
			System.out.println("Thanks for using My Stock Book :) ");
			System.out.println();
			menu1();
			
			break;
		default:
			System.out.println("Invalid input. Try Again....");
			menu1();
		}
		
	}
	void menu21() {
		System.out.println("Pesticide Stocks: ");
		subMenu();
		choiceTwo = scan.nextInt();
		
		System.out.println();
		switch(choiceTwo) {
		case 1:
			try {
				System.out.print("Enter Pesticide: ");
				scan.nextLine();
				s = scan.nextLine();
				
				System.out.println(s + " --> " + wc.viewPestStock(s));
				System.out.println();
				menu21();
			} catch (NullPointerException e) {
				System.out.println("Not Registered. Register from below...");
				System.out.println();
				menu21();
			}
			break;
		case 2:
			try {
				System.out.print("Enter Pesticide: ");
				scan.nextLine();
				s = scan.nextLine();
				System.out.print("No. of " + s + " items sold: ");
				i = scan.nextInt();
				System.out.println(s + " --> " + wc.sellPestStock(s,i));
				System.out.println();
				menu21();
			} catch (Exception e) {
				System.out.println("Out of stock");
			}
			break;
		case 3:
			System.out.print("Enter Pesticide: ");
			scan.nextLine();
			s = scan.nextLine();
			System.out.print("No. of " + s + " items to add: ");
			i = scan.nextInt();
			System.out.println(s + " --> " + wc.enterPestStock(s,i));
			System.out.println();
			menu21();
			break;
		case 4:
			System.out.println("Thanks for using My Stock Book :) ");
			System.out.println();
			menu1();
		default:
			System.out.println("invalid input");
			System.out.println();
			menu21();
		}
	}
	void menu22() {
		System.out.println("Fertilizer Stocks: ");
		subMenu();
		choiceTwo = scan.nextInt();
		
		System.out.println();
		switch(choiceTwo) {
		case 1:
			try {
				System.out.print("Enter Fertilizer: ");
				scan.nextLine();
				s = scan.nextLine();
				
				System.out.println(s + " --> " + wc.viewFertStock(s));
				System.out.println();
				menu22();
			} catch (NullPointerException e) {
				System.out.println("Not Registered. Register from below...");
				System.out.println();
				menu22();
			}
			break;
		case 2:
			try {
				System.out.print("Enter Fertilizer: ");
				scan.nextLine();
				s = scan.nextLine();
				System.out.print("No. of " + s + " items sold: ");
				i = scan.nextInt();
				System.out.println(s + " --> " + wc.sellFertStock(s,i));
				System.out.println();
				menu22();
			} catch (Exception e) {
				System.out.println("Out of stock");
			}
			break;
		case 3:
			System.out.print("Enter Fertilizer: ");
			scan.nextLine();
			s = scan.nextLine();
			System.out.print("No. of " + s + " items to add: ");
			i = scan.nextInt();
			System.out.println(s + " --> " + wc.enterFertStock(s,i));
			System.out.println();
			menu22();
			break;
		case 4:
			System.out.println("Thanks for using My Stock Book :) ");
			System.out.println();
			menu1();
		default:
			System.out.println("invalid input");
			System.out.println();
			menu22();
		}
	}
	
}
