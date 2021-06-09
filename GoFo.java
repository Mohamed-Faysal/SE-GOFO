import java.util.ArrayList;
import java.util.Scanner;

public class GoFo {

	public static void main(String[] args) {
		//Using array lists for the dynamic size
		ArrayList<Playgrounds> playgrounds = new ArrayList<Playgrounds>();
		ArrayList<Player> players = new ArrayList<Player>();
		ArrayList<PlaygroundOwner> playgroundOwners = new ArrayList<PlaygroundOwner>();
		
		Player player = new Player();
		PlaygroundOwner playgroundOwner = new PlaygroundOwner();
		Playgrounds playground = new Playgrounds();
		
		Scanner input = new Scanner(System.in); //to get input from the user
		
		//Counters for players, playground owners and playgrounds to access them in their array list	
		int playerCounter=-1,poCounter=-1,slot=0,pgCounter=-1;
		
		int choice;
		String name;
		double price;
		boolean bool=true;
		
		while(bool) {		
			System.out.println("Welcom To Gofo App \n 1-Register as Player \n 2-Register as playground owner\n 3-Quit");
			choice=input.nextInt();
			if(choice==1) {
				//Registering new player
				playerCounter++;
				System.out.println("Enter your Name");
				name=input.next();
				player.setName(name);
				players.add(player);
				System.out.println("Welcome "+players.get(playerCounter).getName());
				
				System.out.println("1-Book a Playground \n2-Return\n3-Quit");
				choice=input.nextInt();
				
				switch(choice) {
				case 1:
					System.out.println("Enter playground Id to show avilabl times");
					choice=input.nextInt();
					choice--; //indexing of array list starts whit 0, so it's always id-1
					System.out.println(playgrounds.get(choice)+
							"\n pick a slot number");
					slot=input.nextInt();
					playgrounds.get(choice).book(slot);	//book function in Playgrounds class			
					break;
				case 2:
					playerCounter--; //Return the counter to the same indexing number in the array list
					break;
				case 3:
					bool=false; //Stop the loop
					break;
				default:
					System.out.println("Invalid choice, Quiting...");
					bool=false;
					break;
				}
				
			} else if (choice==2) {
				//Registering new playground owner
				poCounter++;
				System.out.println("Enter your Name");
				name=input.next();
				playgroundOwner.setName(name);
				playgroundOwners.add(playgroundOwner);
				System.out.println("Welcome "+playgroundOwners.get(poCounter).getName());
				
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
					System.out.println("Added "+playgrounds.get(pgCounter).toString()+playgrounds.size());  
					break;
				case 2:
					poCounter--; //Return the counter to the same indexing number in the array list (always zero because there is no sign in and you just register one time)
					break;
				case 3:
					bool=false; //Stop the loop
					break;
				default:
					System.out.println("Invalid choice, Quiting...");
					bool=false;
					break;
				}
			}
			else if (choice==3) {
				bool=false; //Stop the loop
			}
			else {
				System.out.println("Invalid choise, Quiting...");
				break;
			}
			
		}
	input.close(); //closing the scanner
	}
	
}
