package Projects;
import java.util.ArrayList;
import java.util.Scanner;
public class Assign6ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> allSongs = new ArrayList<>();
		ArrayList<String> artists = new ArrayList<>();
		ArrayList<String> partyPlaylist = new ArrayList<>();
		
		allSongs.add("Thank u, next");
		artists.add("Ariana Grande");
		
		allSongs.add("Happier");
		artists.add("Marshmallow");
		
		allSongs.add("Without Me");
		artists.add("Halsey");
		
		//print library of songs
		for(int i = 0; i < allSongs.size(); i++) {//prints all songs
			System.out.println(i + " " + allSongs.get(i)
				+ " " + artists.get(i));
		}

		System.out.println("1. add to library \n" 
				+ "2. delete from library \n"
				+ "3. add to party playlist \n"
				+ "4. exit");	
		
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		
		switch(choice) {
		
			case 1:
				input.nextLine();
				System.out.println("enter song title: ");
				allSongs.add(input.nextLine());
				System.out.println("enter artist: ");
				artists.add(input.nextLine());
				break;
				
			case 2:
				System.out.println("enter song number to delete: ");
				int delete = input.nextInt();
				allSongs.remove(delete);
				artists.remove(delete);
				break;
				
			case 3:
				System.out.println("enter song # to add to party playlist: ");
				partyPlaylist.add(allSongs.get(input.nextInt()));
				break;
				
			case 4:
				System.out.println("bye");
				flag = false;
				break;
				
			default:
				System.out.println("invalid option");
				
		}//end switch
		
		while(flag);
		
		//print library of songs
		for(int i = 0; i < allSongs.size(); i++) {//prints all songs
			System.out.println(i + " " + allSongs.get(i)
				+ " " + artists.get(i));
		}

	}//end main

}//end class
