
/**
 * This provides the constructor with attributes for generating cards
 * 
 * Issues:
 * Can't make a new card via this class alone (program doesn't recognise contents in arrays)
 *
 * @author Kanya Farley
 * @version 20/02/2026
 */
public class Card {
    private String faces;
    private String suits;
    private int value;
    /**
     * Constructor for objects of class Card
     */
    public Card(String faces, String suits)
    {
        this.faces = faces;
        this.suits = suits;
    }
    
    public String getFace() {
        return(this.faces);
    }
    
    public String getSuit() {
        return(this.suits);
    }
}
