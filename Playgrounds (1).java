/**@author Jamal Bakri & Mohammed Faysal
 * @version 1.2.0 2021/8/4 */
public class Playgrounds {
	private double price;
	private int [] times= new int [3];
	private int Size;
	public static int ID=0;
	/**Counter for the id of playgroundOwner
	 *@param PlaygroundOwner */
	public Playgrounds() {
		ID+=1;
	}
	/** setter for price
	 * @param price initialize value for price*/
	public void setPrice(double price) {
		this.price=price;
	}	
	/** Takes time and how many open times in a playgorund 
	 * @param times avalible times
	 * @param size  how many time slots are avalible */
	public void setTime(int [] times,int size) {
		this.Size=size;
			for(int i=0;i<size;i++) {
				this.times[i]=times[i];
			}
	}/**over riding setTime()
	 * @param  after every time 
	 * a player book a playground*/
	public void setTime(int slot) {
		for(int i=0;i<Size;i++) {
			if(this.times[i]==slot) {
				this.times[i]=0;
			}else {
			this.times[i]=times[i];
		}}
		}
	/** getter for price 
	 * @return double */
	public double getPrice() {
		return price;
	}
	/**Display all the time slots so that owners can chose  
	 * @return String */
	public String getTimes() {
		String timeSlot="";
		int slot=0;
		for(int i=0;i<Size;i++) {
			slot=times[i];
		switch (slot){
		case 1:
			timeSlot+="(1) 10 to 12 AM";
		break;
		case 2:
			timeSlot+="(2) 12 to 2 PM";
		break;
		case 3:
			timeSlot+="(3) 2 to 4 PM";
		break;
		case 4:
			timeSlot+="(4) 4 to 6 PM";
		break;
		case 5:
			timeSlot+="(5) 6 to 8 PM";
		break;
		case 6:
			timeSlot+="(6) 8 to 10 PM";
		break;
		case 7:
			timeSlot+="(7) 10 to 12 PM";
		break;
		 }//switch
		}//for loop	
		return timeSlot;
	}
	//Booking function
	public void book(int time) {
		String timeSolt1="";
		switch (time){
		case 1:
			timeSolt1+="(1) 10 to 12 AM";
		break;
		case 2:
			timeSolt1+="(2) 12 to 2 PM";
		break;
		case 3:
			timeSolt1+="(3) 2 to 4 PM";
		break;
		case 4:
			timeSolt1+="(4) 4 to 6 PM";
		break;
		case 5:
			timeSolt1+="(5) 6 to 8 PM";
		break;
		case 6:
			timeSolt1+="(6) 8 to 10 PM";
		break;
		case 7:
			timeSolt1+="(7) 10 to 12 PM";
		break;
		}
		System.out.println("\n Price is:"+getPrice()+" booking time is:"+timeSolt1);
		setTime(time);
	}
		//Print the playground info
		public String toString() {
			return " Price is :"+getPrice()+" times: "+getTimes() ;
		}
}