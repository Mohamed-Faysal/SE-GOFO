/**@author Mohammed Faysal & Jamal Bakri 
 * @version 1.0.0 2021/8/4
 */
import java.util.Scanner;
public class Player extends Playgrounds{
	private String name;
	public static int IDnumber=0;
	/**Counter for the Player 
	 *@param Player */
	public Player() {
		IDnumber++;
	}
	
	/** Setter for name 
	 * @param name */
	public void setName(String name) {
		this.name=name;
	}
	
	/** returns the name 
	 * @return String */
	public String getName() {
		return name;
	}
	/**Book a playground for the player
	 *@param Book */
	public void Book(){
		Scanner Slotinput = new Scanner(System.in); 
		System.out.println("Enter Desired time slot :");
		int bookedslot = Slotinput.nextInt();
	}
	
	/** display class content
	 * @return String
	 */
	public String ToStrig(){
		return name + " " +IDnumber;
	}
}


