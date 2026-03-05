
/**
 * Write a description of class CDArchive here.
 *
 * @author Kanya Farley
 * @version 05/03/2026
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
public class CDArchive
{
    private ArrayList<CD> albums = new ArrayList<CD>();
    Scanner kb = new Scanner(System.in);
    /**
     * Constructor for objects of class CDArchive
     */
    public CDArchive()
    {
        CD Wake = new CD("Hail The Sun", "Wake", 2014, 3122); // initializes object on its own
        boolean active = true;
        while (active) {
            System.out.println("Add an album? Enter 'yes' or 'no'");
            String userInput = kb.nextLine();
            if (userInput.equals("yes") || userInput.equals("Yes") || userInput.equals("YES")) {
                System.out.println("Enter artist name!");
                String artistName = kb.nextLine();
                System.out.println("Enter album name for " + artistName);
                String albumName = kb.nextLine();
                System.out.println("What year was " + albumName + " by " + artistName + " released? Enter an integer.");
                int releaseYear = kb.nextInt();
                System.out.println("What's the run time (in seconds) for " + albumName + " (" + releaseYear + ") by " + artistName + "?");
                int runTime = kb.nextInt();
                albums.add(new CD(artistName, albumName, releaseYear, runTime));
            } else if (userInput.equals("no") || userInput.equals("No") || userInput.equals("NO")) {
                System.out.println("Okay! Here are all the albums you've entered: ");
                for (int i = 0; i > albums.size(); i++) { // doesn't work...
                    CD currentCD = albums.get(i);
                    System.out.println(currentCD.getArtistName() + ", " + currentCD.getAlbumName() + ", " + currentCD.getReleaseYear() + ", " + currentCD.getRunTime());
                }
                active = false;
            }
        }
    }
    
    void loadFromFile(String CDs) {
        
    }
}
