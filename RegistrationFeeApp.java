/* Application to output total registration fee owing at a conference based on attendee type and numbers of sessions attending.
Author @ Karen O Donoghue 20144148 NCIRL HDSDEV-SEP 05.12.2020
*/

//import scanner to take input from user
import java.util.Scanner;

public class RegistrationFeeApp{
	//declare main method
	public static void main(String[] args){
		//declare local variables
		//variable of data type int to store the attendee type
		String attendee;
		//variable of data type int to store the number of sessions they will attend
		int numSessions;

		//declare and create object of type Scanner to take input from user
		Scanner input = new Scanner(System.in);

		//declare and create object of type Registration Fee to use Registration Fee class
		RegistrationFee Registration = new RegistrationFee();

		//input from user
		//prompt user to select attendee type.
		System.out.println("Please enter attendee type: Student or non-student: ");
		//store input in attendee variable
		attendee = input.nextLine();
		//send attendee type to IC RegistrationFee for processing
		Registration.setAttendeeType(attendee);

		//validate user input
		if(attendee.equalsIgnoreCase("student") || attendee.equalsIgnoreCase("non-student")){

			System.out.println("Please enter the number of sessions: ");
			//store input in numSessions variable
			numSessions = input.nextInt();
			//send numSessions to IC RegistrationFee for processing
			Registration.setNumberSessions(numSessions);

			//processing
			//invoke compute method from IC
			Registration.compute();

			//output
			//get total price
			//retrieve total fee from IC
			int totalPrice = Registration.getTotalFee();
			//validate number of sessions input from user - if its 0 or negative number print Error msg otherwise show total fee
			if (totalPrice <=0){
				System.out.println("ERROR: Number of sessions is not valid");
			}else{
				System.out.println("Total Registration Fee is: " + totalPrice);
			}
		}else {
			//if attendee type is not valid print this line
			System.out.println("ERROR: Please enter a valid attendee type");
		}
	}
}