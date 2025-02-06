/*
Course Project - class information and class appointment
*/

package project;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class Information implements Info{

	String name;			// hold user name
	String dob;			// hold user date of birth
	int[] phone;			// hold user phone number
	String email;			// hold user email

	Information(){	// constructor
		name = "blank";
		dob = "blank";
		phone = new int[0];
		email = "blank";
	}
	public String getName()	{	// returns user name
		return name;
	}
	public void setName(String n){	// stores user name
		name = n;
	}
	public String getDOB(){ 	// returns user date of birth
		return dob;
	}
	public void setDOB(String b){	// stores user date of  birth
		dob = b;
	}
	public int[] getPhone(){	// returns user phone number
		return phone;
	}
	public void setPhone(String p){ // stores user phone number
		p = p.replaceAll("\\D", ""); // Remove non-digit characters
        	phone = new int[p.length()];
        	for (int i = 0; i < p.length(); i++) {
            		phone[i] = Character.getNumericValue(p.charAt(i));
		}
	}
	public String getEmail(){	// returns user email
		return email;
	}
	public void setEmail(String e){ // stores user email
		email = e;
	}
}

class Appointment extends Information {
	public String day; 	// holds the user selected day
	public int time;	// holds the user selected time
	public String ampm;	// holds if time is am or pm
	public String donation;	// holds the user donation choice
	private Scanner scanner; // Declare a Scanner instance as a class member

	public Appointment(Scanner scanner) {
        	this.scanner = scanner;
	}

	public void chooseDay() {	// user selects a day 
		int input;	// hold user input

		System.out.println ("When would you like to visit the garden? Enter the number associated with the day.");
		System.out.println("1: Monday \n2: Tuesday \n3: Wednesday \n4: Thursday \n5: Friday \n6: Saturday");
		input = scanner.nextInt();
	
		switch(input) {		// stores day based on user input
			case 1:
				day = "Monday";
				break;
			case 2:
				day = "Tuesday";
				break;
			case 3:
				day = "Wednesday";
				break;
			case 4:
				day = "Thursday";
				break;
			case 5:
				day = "Friday";
				break;
			case 6:
				day = "Saturday";
				break;
			default:	// if the input is not 1-6 the program ends
				System.out.println("Invalid input");
				System.exit(1);
		}
	}

	public void chooseTime() {	// stores time based on user input
		int input;	// hold user input
		String input2; 	// hold second input

		System.out.println ("\nWhen would you like to visit the garden?");
		System.out.println ("Hours: Monday to Friday 8:00 AM to 8:00 PM,  and Saturday 8:00 AM to 5:00 PM");
		System.out.print("Hour (example 3): "); 	// user enters time of visit
		input = scanner.nextInt();
		scanner.nextLine();

		System.out.print("AM or PM: ");			// user enters am or pm
		input2 = scanner.nextLine();

		// checks if the time is valid
		if (("AM".equals(input2)) && (input >= 8) && (input <= 11)) {
			ampm = input2;
			time = input;
		}
		else if ("PM".equals(input2)){
			if ((day == "Saturday") && (((input >= 1) && (input <= 5)) ||(input == 12))){
				ampm = input2;
				time = input;
			}
			else if(((input >= 1) && (input <=8)) || input == 12)){
				ampm = input2;
				time = input;
			}
			else {
				System.out.println("Invalid input");
				System.exit(1);
			}
		}
		else {
			System.out.println("Invalid input");
			System.exit(1);
		}
	}

	public void chooseDonation() {	// user chooses donation 
		int input;	// hold user input

		System.out.println ("\nWhat would you like to donate?");
		System.out.println("1: Money \n2: Seeds \n3: Soil \n4: Voluntary labor \n5: Gardening tools \n6: Other Gardening materials \n7: No Donation "); 
		input = scanner.nextInt();
	
		switch(input) {		// stores day based on user input
			case 1:
				donation = "Money";
				break;
			case 2:
				donation = "Seeds";
				break;
			case 3:
				donation = "Soil";
				break;
			case 4:
				donation = "Voluntary labor";
				break;
			case 5:
				donation = "Gardening tools";
				break;
			case 6:
				donation = "Other Gardening materials";
				break;
			case 7: 
				donation = "None";
				break;
			default:	// if the input is not 1-7, the program ends
				System. out.println("Invalid input");
				System.exit(1);
		}
		System.out.println("");
	}

	public void outInfo() {		//outputs a summary
		System.out.println("Information:");
		System.out.println("Name: " + getName());
		System.out.println("Date of Birth: " + getDOB());
		System.out.print("Phone Number: ");
		for (int digit : getPhone()) {
            		System.out.print(digit);
        	}
		System.out.println();
		System.out.println("Email: " + getEmail());
		System.out.println();
		
		System.out.println("Appointment:");
		System.out.println(day + " at " + time + " " + ampm);
		System.out.println("Donation: " + donation);
	}
	
	public void fileWrite() {	// Write summary to Appointment.txt
		try { 
			File file1 = new File("Appointment.txt");
			FileWriter fw = new FileWriter(file1);
			PrintWriter pw = new PrintWriter(fw);

			pw.println("Information:");
			pw.println("Name: " + getName());
			pw.println("Date of Birth: " + getDOB());
			pw.println("Phone Number: ");
			for (int digit : getPhone()) {
                		pw.print(digit);
            		}
            		pw.println();
			pw.println("Email: " + getEmail());
			pw.println();
		
			pw.println("Appointment:");
			pw.println(day + " at " + time + " " + ampm);
			pw.println("Donation: " + donation);
			pw.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
        	}
	}	
}
		

		
		