
public class PlaygroundOwner {
	private String name;
	public static int IDnumber=0;
	public PlaygroundOwner() {
		IDnumber++;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
}
