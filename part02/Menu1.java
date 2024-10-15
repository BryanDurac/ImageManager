package part02;
import java.util.ArrayList;
import console.Console;

public class Menu1 {
	protected Console con;
    private String title;
    protected ArrayList<String> options;

    public Menu1(Console con, String title) {
        this.con = con;
        this.title = title;
        this.options = new ArrayList<>();
    }

    public void addOption(String option) {
        options.add(option);
    }

    public void display() {
        con.println(title);
        con.println("+++++++++++++++++");
        for (int i = 0; i < options.size(); i++) {
            con.println((i + 1) + ". " + options.get(i));
        }
        con.println();
        con.print("Enter Selection: ");
    }

    public int getUserChoice() {
        String strChoice = con.readLn();
        return Integer.parseInt(strChoice);
    }
    
    public void processChoice(int value) {
    }
}