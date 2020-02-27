public class Room {
 int roomID;
 String roomType;//"single king" "single queen" "double king" "double queen"
 Guest currentGuest;
 public Room(int x,String type) {
	 this.setRoomID(x);
	 this.setRoomType(type);
 }
public int getRoomID() {
	return roomID;
}
public void setRoomID(int roomID) {
	this.roomID = roomID;
}
public String getRoomType() {
	return roomType;
}
public void setRoomType(String roomType) {
	this.roomType = roomType;
}
public Guest getCurrentGuest() {
	return currentGuest;
}
public void setCurrentGuest(Guest currentGuest) {
	this.currentGuest = currentGuest;
}
}
