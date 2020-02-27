import java.time.LocalDate;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hotel h=new Hotel();
		h.addGuest("john", "doe", 2);
		h.addGuest("mike","long",3);
		LocalDate start=LocalDate.of(2019, 05, 13);
		LocalDate end=LocalDate.of(2019, 05, 19);
		
		h.reserveRoom(h.rooms[0], h.guestBook.get(1), start, end);
		h.reserveRoom(h.rooms[0], h.guestBook.get(2), start, end);
		start=LocalDate.of(2019, 05, 20);
		end=LocalDate.of(2019, 05, 25);
		h.reserveRoom(h.rooms[0], h.guestBook.get(2), start, end);
		
		h.guestCheckIn(h.guestBook.get(2),start);
		h.report();
		h.deleteReserve(h.guestBook.get(2), start, end);
		h.report();
	}

}
