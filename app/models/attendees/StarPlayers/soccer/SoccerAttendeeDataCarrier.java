package models.attendees.StarPlayers.soccer;

public class SoccerAttendeeDataCarrier {
	
	public String           firstName;
	public String           lastName;
	
	public SoccerAttendeeDataCarrier(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	
	public String toString() {
		return (this.lastName + "," + this.firstName);
	}
}
