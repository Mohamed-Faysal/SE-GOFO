import java.util.Scanner;
public class Player extends Playgrounds{
	private String name;
	public static int IDnumber=0;
	public Player() {
		IDnumber++;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}

	public void Book(){
		Scanner Slotinput = new Scanner(System.in); 
		System.out.println("Enter Desired time slot :");
		int bookedslot = Slotinput.nextInt();
	}
	public String ToStrig(){
		return name + " " +IDnumber;
	}
}


