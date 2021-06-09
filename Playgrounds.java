/**@author Jamal Bakri
 * @version 1.0.0 2021/8/4 
 */
public class Playgrounds {
	private double price;
	private int [] times= new int [3];
	private int Size;
	public static int id=0;
	/**Counter for the id of playgroundOwner
	 *@param PlaygroundOwner */
	public Playgrounds() {
		id++;
	}
	
	/** setter for pricw 
	 * @param price
	 */
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
	}
	
	/** getter for price 
	 * @return double 
	 */
	public double getPrice() {
	return price;
	}
	
	/**Display all the time slots so that owners can chose  
	 * @return String 
	 */
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
	
			}
		}
	
		return timeSlot;
	}
	
	/** display class content
	 * @return String
	 */
	public String toString() {
		return "Price is :"+getPrice()+" times: "+getTimes() ;
	}
}
