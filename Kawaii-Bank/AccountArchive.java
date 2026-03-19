
/**
 * Svaes and stores accounts
 *
 * @author Kanya Farley
 * @version 1 19/03/26
 */
import java.util.ArrayList;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
public class AccountArchive
{
    private ArrayList<Account> accounts = new ArrayList<Account>();
    /**
     * Constructor for objects of class AccountCreator
     */
    public AccountArchive()
    {
        Account OMarajPettySavings = new Account("Onika Maraj-Petty", "08-0101-0423087-00", "14 Mt View St, Wellington", "Savings", 450.06);
    }
    
    void saveToFile (String Accounts) {
        File file = new File("Accounts.csv");
        try {
            FileWriter writer = new FileWriter(file);
            for (Account thisAccount : accounts) {
                writer.write(thisAccount.getCustomerName() + ", " +
                thisAccount.getAccountNumber() + ", " +
                thisAccount.getCustomerAddress() + ", " +
                thisAccount.getAccountType() + ", " +
                thisAccount.getCurrentBalance() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Sorry! Couldn't write that file.");
        }
    }
    
    void loadFromFile () {
        try {
            File file = new File("Accounts.csv");
            Scanner read = new Scanner(file);
            while (read.hasNextLine()) {
                String line = read.nextLine();
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
    void addAccount(Account currentAccount) {
        accounts.add(currentAccount);
    }
}
