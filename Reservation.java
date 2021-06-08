
public class Reservation {
	private String playerName;
	private String playgroundName;
	private double price;
	private String time;	
	//setters && getters
	public void setPlaygroundName(String playgroundName) {
		this.playgroundName=playgroundName;
	}
public void setPlayerName(String playerName) {
		this.playerName=playerName;
	}
public void setPrice(double price) {
	this.price=price;
}
	public String getPlayerName() {
		return playerName;
	}
	public String getplaygroundName() {
		return playgroundName;
	}
	public double getPrice() {
		return price;
	}
	public void setTime(int slot) {
		String timeSlot="";
		switch (slot){
		case 1:
			timeSlot="10 to 12 AM";
		break;
		case 2:
			timeSlot="12 to 2 PM";
		break;
		case 3:
			timeSlot="2 to 4 PM";
		break;
		case 4:
			timeSlot="4 to 6 PM";
		break;
		case 5:
			timeSlot="6 to 8 PM";
		break;
		case 6:
			timeSlot="8 to 10 PM";
		break;
		case 7:
			timeSlot="10 to 12 PM";
		break;
		}
		time = timeSlot;
	}
	public String getTime() {
		return time;
	}
	public String toString() {
		return "Player :"+getPlayerName()+","+getplaygroundName()+", price"+getPrice()+"time:"+getTime();
	}
}
