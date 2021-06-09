/**@author Mohammed Faysal & Jamal Bakri 
 * @version 1.2.0 2021/8/4
 */
public class Player {

	private String name;
	public static int IDnumber=0; //keep track of player in case added sign in  feature 
	/**Counter for the Player 
	 *@param Player */
	public Player() {
		IDnumber++;
	}
	/** sets a name variable for name 
	 *@param name returns parameter*/
	public void setName(String name) {
		this.name=name;
	}
	/** returns the name 
	 * @return String */
	public String getName() {
		return name;
	}
}

