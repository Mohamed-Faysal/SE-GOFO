/**@author Islam abdelazim 
 * @version 1.0.0 2021/8/4 */
public class PlaygroundOwner {
	private String name;
	public static int IDnumber=0;
	/**Counter for the id of playgroundOwner
	 *@param PlaygroundOwner */
	public PlaygroundOwner() {
		IDnumber++;
	}
	
	/** setter for name 
	 * @param name
	 */
	public void setName(String name) {
		this.name=name;
	}
	
	/** returns name 
	 * @return String */
	public String getName() {
		return name;
	}
}
