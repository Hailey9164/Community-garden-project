/* 
Course project - interface
contains the Info interface. 
*/

package project;

public interface Info {
	String getName();	// returns user name
	void setName(String n);	// stores user name

	String getDOB();	// returns user date of birth
	void setDOB(String b);	// stores user date of  birth

	public int[] getPhone();// returns user phone number
	void setPhone(String p);// stores user phone number

	String getEmail();	// returns user email
	void setEmail(String e);// stores user email
}