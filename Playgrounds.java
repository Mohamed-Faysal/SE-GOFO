
public class Playgrounds {
	private double price;
	private int [] times= new int [3];
	private int Size;
	public static int id=0;
	public Playgrounds() {
		id++;
	}
	public void setPrice(double price) {
		this.price=price;
	}
	//Size is slote count 
	public void setTime(int [] times,int size) {
	this.Size=size;
		
		for(int i=0;i<size;i++) {
			this.times[i]=times[i];
		}
	}
	public double getPrice() {
	return price;
	}
	public String getTimes() {
	
	String timeSlot="";
	int slot=0;
	for(int i=0;i<Size;i++) {
		slot=times[i];
	switch (slot){
	case 1:
		timeSlot+=" 10 to 12 AM";
	break;
	case 2:
		timeSlot+=" 12 to 2 PM";
	break;
	case 3:
		timeSlot+=" 2 to 4 PM";
	break;
	case 4:
		timeSlot+=" 4 to 6 PM";
	break;
	case 5:
		timeSlot+=" 6 to 8 PM";
	break;
	case 6:
		timeSlot+=" 8 to 10 PM";
	break;
	case 7:
		timeSlot+=" 10 to 12 PM";
	break;
	
	}//switch
	}//for loop
	
	return timeSlot;
	}
	public String toString() {
		return "Price is :"+getPrice()+" times: "+getTimes() ;
	}
}
