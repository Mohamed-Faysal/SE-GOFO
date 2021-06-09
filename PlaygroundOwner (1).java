/**@author Islam abdelazim 
 * @version 1.2.0 2021/8/4 */
public class PlaygroundOwner {
	private String name;
	public static int IDnumber=0; //keep track of player in case added sign in feature 
	/**Counter for the id of playgroundOwner
	 *@param PlaygroundOwner */
	public PlaygroundOwner() {
		IDnumber++;
	}
	/** setter for name 
	 * @param name initialize a value for name*/
	public void setName(String name) {
		this.name=name;
	}
	/** returns name 
	 * @return String returns initalized value */
	public String getName() {
		return name;
	}
}