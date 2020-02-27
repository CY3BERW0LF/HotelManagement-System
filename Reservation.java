import java.time.LocalDate;
public class Reservation {
	Guest guest;
	Room room;
	double rate;
	LocalDate start;
	LocalDate end;
	Boolean checkIn;
	
	public Reservation(Guest g,Room r,double rate,LocalDate s, LocalDate e) {
		this.setGuest(g);
		this.setRoom(r);
		this.setRate(rate);
		this.setStart(s);
		this.setEnd(e);
		this.setCheckIn(false);
	}
	public void print() {
		System.out.println("Guest:"+this.getGuest().getFirstName()+" "+this.getGuest().getLastName());
		System.out.println("Room:"+this.getRoom().getRoomID());
		System.out.println("From:"+this.getStart()+" to "+this.getEnd());
		System.out.println("$"+this.price());
		System.out.println("Checked in:"+this.getCheckIn());
	}
	public double price() {
		return this.getRate()*this.getEnd().compareTo(this.getStart());
		
	}
	
	public Guest getGuest() {
		return guest;
	}
	public void setGuest(Guest guest) {
		this.guest = guest;
	}
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public LocalDate getStart() {
		return start;
	}
	public void setStart(LocalDate start) {
		this.start = start;
	}
	public LocalDate getEnd() {
		return end;
	}
	public void setEnd(LocalDate end) {
		this.end = end;
	}
	public Boolean getCheckIn() {
		return checkIn;
	}
	public void setCheckIn(Boolean checkIn) {
		this.checkIn = checkIn;
	}
}
