
public class Guest {
	int guestID;
	String firstName;
	String lastName;
	int sizeOfFamily;
	public Guest(int ID,String first,String last,int size) {
		this.setGuestID(ID);
		this.setFirstName(first);
		this.setLastName(last);
		this.setSizeOfFamily(size);
	}
	public int getGuestID() {
		return guestID;
	}
	public void setGuestID(int guestID) {
		this.guestID = guestID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getSizeOfFamily() {
		return sizeOfFamily;
	}
	public void setSizeOfFamily(int sizeOfFamily) {
		this.sizeOfFamily = sizeOfFamily;
	}
}
