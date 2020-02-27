import java.util.ArrayList;
import java.time.LocalDate;
public class Hotel {
Room[] rooms;
ArrayList<Reservation> reservation;
ArrayList<Guest> guestBook;
double[] rates;
public Hotel() {
	rooms=new Room[20];
	for(int x=0;x<rooms.length;x++) {
		Room r=new Room(x,"single king");
		rooms[x]=r;
	}
	reservation= new ArrayList<Reservation>();
	guestBook= new ArrayList<Guest>();
	Guest repair=new Guest(0,"Repair","Repair",0);
	guestBook.add(repair);
} 
public void addGuest(String frist,String last,int size) {
	guestBook.add(new Guest(guestBook.size(),frist,last,size));
	
}
public void reserveRoom(Room r,Guest g,LocalDate s, LocalDate e) {
	int size=reservation.size();
	Reservation res;
	for(int i=0;i<size;i++) {
		res=reservation.get(i);
		if(r==res.getRoom()) {
			if(s.compareTo(res.getStart())>=0& s.compareTo(res.getEnd())<=0|e.compareTo(res.getStart())>=0& e.compareTo(res.getEnd())<=0) {
					System.out.println("Reseration Failed 0");
			}else {
				reservation.add(new Reservation(g,r,32.0,s,e));
				System.out.println("Reseration Maded 1");
			}
		}else {
			reservation.add(new Reservation(g,r,32.0,s,e));
			System.out.println("Reseration Maded 2");
		}
		
	}
	if(reservation.size()==0) {
		reservation.add(new Reservation(g,r,32.0,s,e));
		System.out.println("Reseration Maded 3");
	}	
}
public void deleteReserve(Guest c, LocalDate s, LocalDate e) {
	int size=reservation.size();
	Reservation res;
	for(int i=0;i<size;i++) {
		res=reservation.get(i);
		if(c==res.getGuest()& s==res.getStart()& e==res.getEnd()) {
			reservation.remove(res);
		}
	}
}
public void repairRoom(Room r) {
	if(rooms[r.getRoomID()].getCurrentGuest()!= null){
		Guest temp = rooms[r.getRoomID()].getCurrentGuest();
		rooms[r.getRoomID()].setCurrentGuest(guestBook.get(0));
		//TODO
		//set new room for temp
		
	}else {
		rooms[r.getRoomID()].setCurrentGuest(guestBook.get(0));
	}
	
}
public void guestCheckIn(Guest c ,LocalDate s) {
	for(Reservation res:reservation) {
		if(c==res.getGuest()& s==res.getStart()) {
			if(res.getRoom().getCurrentGuest()== null) {
				res.setCheckIn(true);
				rooms[res.getRoom().getRoomID()].setCurrentGuest(c);
			}else {
				//TODO
				//Manger override to move to new room
			}
			
		}
		}
	
}
public void guestCheckOut(Guest c, LocalDate e) {
	for(Reservation res:reservation) {
		if(c==res.getGuest()& e==res.getEnd()) {
			rooms[res.getRoom().getRoomID()].setCurrentGuest(null);			
		}
	}
}
//TODO Manger Reports Employe Reports
public void report() {
	for(Reservation res:reservation) {
		res.print();
		
	}
}
}
