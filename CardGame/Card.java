
/**
 * This provides the constructor with attributes for generating cards
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
        this.value = valueOfFace();
    }
    
    public String getFace() {
        return(this.faces);
    }
    
    public String getSuit() {
        return(this.suits);
    }
    
    // not sure how to add this to main!
    public int valueOfFace() {
        switch (this.faces) {
            case "Ace" : value = 1;
                break;
            case "2" : value = 2;
                break;
            case "3" : value = 3;
                break;
            case "4" : value = 4;
                break;
            case "5" : value = 5;
                break;
            case "6" : value = 6;
                break;
            case "7" : value = 7;
                break;
            case "8" : value = 8;
                break;
            case "9" : value = 9;
                break;
            case "10" : value = 10;
                break;
            case "Jack" : value = 10;
                break;
            case "Queen" : value = 10;
                break;
            case "King" : value = 10;
                break;
        }
        return value;
    }
    
    public int getValue() {
        return(this.value);
    }
}
