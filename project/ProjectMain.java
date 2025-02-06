/*
Course Project - main code 
*/

package project;
import java.util.Scanner;
import project.Information;
import project.Appointment;

public class ProjectMain{
	public static void main(String args[]) throws java.io.IOException {
		Scanner scanner = new Scanner(System.in);
		Appointment apt = new Appointment(scanner);
		
		// Title
		System.out.println("Public Community Garden at Moreno Valley College Appointment System");
		
		// Get information from user
		String input; 	// hold second input
		
		System.out.println("\nEnter your name: ");	// read user name
		input = scanner.nextLine();
		apt.setName(input);

		System.out.println("\nEnter your date of birth: ");	//read date of birth
		input = scanner.nextLine();
		apt.setDOB(input);

		System.out.println("\nEnter your phone number: ");	// read phone number
		input = scanner.nextLine();
		apt.setPhone(input);

		System.out.println("\nEnter your email address: ");	// read email
		input = scanner.nextLine();
		apt.setEmail(input);

		// make apointment
		System.out.println("\nMake an Appointment");
	
		apt.chooseDay();
		apt.chooseTime();
		apt.chooseDonation();

		// Show summary
		apt.outInfo();

		// Write summary to Appointment.txt
		apt.fileWrite();

		scanner.close();
	}
}
