/* Instantiable class to compute total registration fee owing at a conference based on attendee type and numbers of sessions attending.
Author @ Karen O Donoghue 20144148 NCIRL HDSDEV-SEP -CA Question 1I - 05.12.2020
*/

public class RegistrationFee{
	//declare instance variables / data members
	//to store the type of attendee
	private String attendeeType;
	//to store the number of sessions the attendee will go to
	private int numberSessions;
	//to store the total fee owing based on the attendee type and number of sessions
	private int totalFee;

	//declare constructor with no parameters
	public RegistrationFee(){
		attendeeType = null;
		numberSessions = 0;
		totalFee = 0;
	}

	//setter method to set input from user to attendeeType variable
	public void setAttendeeType(String attendeeType){
		this.attendeeType = attendeeType;
	}
	//setter method to set input from user to numberSessions variable
	public void setNumberSessions(int numberSessions){
		this.numberSessions = numberSessions;
	}

	//getter to return total regisration fee to the app class when invoked
	public int getTotalFee(){
		return totalFee;
	}

	//computation - process
	//declare method to implement the processing
	public void compute(){
		//check if the attendee is a student or non student
		//check how many sessions they want to attend
		//depending on attendee type and number of sessions total fee variable will be updated with correct value
		if (attendeeType.equalsIgnoreCase("student")){
			if (numberSessions < 5){
				totalFee = 35 * numberSessions;
			}else if (numberSessions == 5 || numberSessions < 10){
				totalFee = 20 * numberSessions;
			}else if (numberSessions >= 10){
				totalFee = 25 * numberSessions;
			}
		}else if (attendeeType.equalsIgnoreCase("non-student")){
			if (numberSessions < 5){
				totalFee = 70 * numberSessions;
			}else if (numberSessions == 5 || numberSessions < 10){
				totalFee = 52 * numberSessions;
			}else if (numberSessions >= 10){
				totalFee = 45 * numberSessions;
			}
		}else {
			totalFee = 0; // for input validation
		}
	}
}
