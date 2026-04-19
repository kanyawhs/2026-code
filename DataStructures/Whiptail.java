
/**
 * Information about a New Mexican Whiptail
 *
 * @author Kanya Farley
 * @version 20/4/26
 */
public class Whiptail
{
    private String name; // MUST BE IN QUOTES!
    private int length;
    
    Whiptail mother; // allows each whiptail type to have another of same type linked to it
    
    //setters:
    /**
     * Constructor for whiptail with no data
     */
    public Whiptail()
    {
        this.name = "anonymous";
    }
    
    /**
     * Constructor for whiptail with a name
     */
    public Whiptail(String name) {
        this.name = name;
    }
    
    //getters:
    public void setName(String name) {
        this.name = name;
    }
    
    public void setLength(int length) {
        this.length = length;
    }
    
    public String getName() {
        return(this.name);
    }
    
    public int length() {
        return(this.length);
    }
    
    //creates mother:
    public void createMother() {
        this.mother = new Whiptail();
    }
    
    public void createMother(String name) {
        this.mother = new Whiptail(name);
    }
    
    //gets mother:
    public void setMother(Whiptail mother) {
        this.mother = mother;
    }
    
    public Whiptail getMother() {
        return(this.mother);
    }
}
