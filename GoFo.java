import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/*notes
 * you can make the id = counter for the user so he can access his account any time 
 * make playgrounds counter
*/
public class GoFo {

	public static void main(String[] args) {
		ArrayList<Playgrounds> playgrounds = new ArrayList<Playgrounds>();
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<PlaygroundOwner> playgroundOwners = new ArrayList<PlaygroundOwner>();
		Player player = new Player();
		PlaygroundOwner playgroundOwner = new PlaygroundOwner();
		Playgrounds playground = new Playgrounds();
		int choice,counter=-1;
		String name;
		boolean bool=true;
		Scanner input = new Scanner(System.in);
		//for playgrounds
		int pgCounter=-1;
		double price;
		while(bool) {
			counter++;
			System.out.println("Welcom To Gofo App \n 1-Register as Player \n 2-Register as playground owner\n 3-Quit");
			choice=input.nextInt();
			if(choice==1) {
				
				System.out.println("Enter your Name");
				name=input.next();
				player.setName(name);
				players.add(player);
				System.out.println("Welcome "+players.get(counter).getName());
				System.out.println("1-Book a Playground \n2-Return\n3-Quit");
				choice=input.nextInt();
				switch(choice) {
				case 1:
					System.out.println("The Avalible Times are");
					//this should be the array on line 74 slots
					//System.out.println(Arrays.toString(slots));
					//if u want the bookedslot just print bookedslot the variable in book
					player.Book();
					break;
				case 2:
					counter--;
					break;
				case 3:
					bool=false;
					break;
				default:
					System.out.println("Invalid choice, Quiting...");
					bool=false;
					break;
				}
				
			} else if (choice==2) {
				System.out.println("Enter your Name");
				name=input.next();
				playgroundOwner.setName(name);
				playgroundOwners.add(playgroundOwner);
				System.out.println("Welcome "+playgroundOwners.get(counter).getName());
				System.out.println("1-Add a Playground \n2-Return\n3-Quit");
				choice=input.nextInt();
				switch(choice) {
				case 1:
					pgCounter++;
					System.out.println("Enter the price");
					price=input.nextDouble();
					System.out.println("The available slots are \n1-(10 to 12 AM)  \n2-(12 to 2 PM)"
							+ ", 3-(2 to 4 PM), 4-(4 to 6 PM), 5-(6 to 8 PM)"
							+ "\n6-(8 to 10 PM), 7-(10 to 12 PM)"
							+ "\nHow many slots are available? and which?");
					choice=input.nextInt();
					int[] slots = new int [choice];
					for(int i=0;i<choice;i++) {
						slots[i]=input.nextInt();
					}
					playground.setPrice(price);
					playground.setTime(slots, choice);
					playgrounds.add(playground);
					System.out.println("Added "+playgrounds.get(pgCounter).toString());
					break;
				case 2:
					counter--; //Return the counter to the same indexing number in the array list (always zero because there is no sign in and you just register one time)
					break;
				case 3:
					bool=false;
					break;
				default:
					System.out.println("Invalid choice, Quiting...");
					bool=false;
					break;
				}
			}
			else if (choice==3) {
				bool=false;
			}
			else {
				System.out.println("Invalid choise, Quiting...");
				break;
			}
			
		}
	}

}
