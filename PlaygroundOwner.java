
public class PlaygroundOwner {
	private String name;
	public static int IDnumber=0; //keep track of player in case added sign in feature 
	public PlaygroundOwner() {
		IDnumber++;
	}
	//setters && getters
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
}
