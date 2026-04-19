
/**
 * Write a description of class WellingtonZoo here.
 *
 * @author Kanya Farley
 * @version 20/4/26
 */
public class WellingtonZoo
{
    Whiptail first;
    
    /**
     * Constructor for objects of class WellingtonZoo
     */
    public WellingtonZoo()
    {
        first = new Whiptail("Anita"); // create first whiptail (crucial)
        first.createMother("Brianna"); // create first whiptails mother
        
        // continued generations of whiptails
        first.getMother().createMother("Carol");
        first.getMother().getMother().createMother("Dua Lipa");
        first.getMother().getMother().getMother().createMother("Emily");
        
        // prints generations from first to last (great band haha lol) (youngest to oldest)
        Whiptail temp = first;
        while (temp.getMother() != null) {
            System.out.println(temp.getName());
            temp = temp.getMother();
        }
        System.out.println(temp.getName());
    }
}
