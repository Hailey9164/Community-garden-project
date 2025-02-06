# Community Garden Project
## Description
This is a program that will allow people who use the public community garden at Moreno Valley College to create an organized schedule for them to use and know who is accessing the garden. It will also help keep track of who donates what to the garden. The program will first prompt the user to register by inputting general and contact information. The program will collect the user’s name, date of birth, phone number, and email. This information will be stored and connected to the rest of the information the user inputs. The program will ask the user to select a day of the week that they would like to visit the garden and then will display the hours that the garden is open on that particular day and ask the user to enter the time that they will visit. The program will then display a menu asking the user if they would like to make a donation in the form of money, soil, fertilizer, voluntary labor, gardening tools, or other gardening materials, or no donation. The program will then display a recap to the user showing their name, date of birth, phone number, email, appointment date and time, and donation selection. The program will also output this information in a text file. The targeted user for this program is people who visit the public community garden at Moreno Valley College. This program will be user-friendly and will allow for easy selection of options. One weakness is that this program will allow for limited input and will not have options for the user to enter information that is not asked for. In future versions I would like to use GUI and have more open-ended options. 

## Psudocode
In a package: 
Info.java - contains Interface Information
Information.java - contains Information Class and appointment class (extends information)
MainProject.java - contains the main program

Interface Info- 
Contains the public interface info
	Method - getName
	Method setName
	Method getDOB (date of birth)
	Method setDOB
	Method getPhone
	Method setPhone
	Method getEmail
	Method setEmail

Class Information   
	String variable name
	String variable dob (date of birth)
	Int array phone
	String variable email


	constructor
		Set all variables to “blank”

	Method - getName
		Returns name
	Method setName
		Sets name to new input
	Method getDOB (date of birth)
		Returns dob
	Method setDOB
		Sets dob to new input
	Method getPhone
		Returns phone
	Method setPhone
		Sets phone to new input 
		Input comes in as a string and this converts it to a int array
	Method getEmail
		Returns phone
	Method setEmail
		Sets email to new input

Class Appointment (extends information)
	String variable day
	Int variable time
	String variable ampm
	String variable donation 
	Scanner

	constructor
		Uses scanner as an argument for the class

	Method chooseDay
		Int variable input
		Ask user when they want to visit the garden
		User enters the day they want to visit the garden
		User enters the number corresponding to the day they want to visit
		Switch statement puts the name of the day in the day variable
		If there is an invalid input the user gets an error message and the program exits

	Method chooseTime
		Int variable input
		String variable input2
		Ask user the time they want to visit the garden
		User enters the hour they want to visit the garden 
		User enters am or pm 
		If (the user entered am and the hour is between 8 and 11)
			Store information in ampm and time
		Else if (user entered pm)
			If (the day is Sunday and time is between 1 and 5 or is 12)
				Store information in ampm and time
			Else if (the time is between 1 and 8 or is 12)
				Store information in ampm and time
			Else 
				Output an error message and exit program
		Else 
			Output an error message and exit program

	Method chooseDonation 
		Ask user what they would like to donate and show a menu
		User enters the number associated with their choice
		Switch statement stores user’s choice in donation variable
		If there is an invalid input the user gets an error message and the program exits

	Method outInfo
		Output to user name, date of birth, phone number, email, appointment day and time, and donation 



	Method fileWrite 
		Output to file name, date of birth, phone number, email, appointment day and time, and donation 
Class ProjectMain
Main
	Set up scanner
	Create a new Appointment object called apt
	Output to user a title
	String variable input

	Ask user to enter name
	Store name using setName
	Ask user to enter date of birth
	Store date of birth using setDOB
	Ask user to enter phone number 
	Store using setPhone
	Ask user to enter email
	Store using setEmail

	Tell user to make an appointment and run the methods chooseDay, chooseTime, and chooseDonation 
	Run methods outInfo and fileWrite 
End of program
