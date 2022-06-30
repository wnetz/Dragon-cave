import java.util.Random;
import java.util.Scanner;

public class Project1
{
    private int ans;
    private Scanner scan;

    public static void main(String[] args) {
        new Project1(new Scanner(System.in)).run();
    }
    public Project1(Scanner s)
    {
        Random rand = new Random();
        ans = rand.nextInt(2)+1;
        scan = s;
    }
    public int run()
    {
        System.out.println("You are in a land full of dragons. In front of you,");
        System.out.println("you see two caves. In one cave, the dragon is friendly");
        System.out.println("and will share his treasure with you. the other dragon");
        System.out.println("is greedy and hungry and will eat you on sight.");
        System.out.println("which cave will you go into? (1 or 2)");
        int choice = -1;
        do
        {
            choice = userInput();
        }while (choice == -1);

        if(choice == ans)
        {
            System.out.println("you don't die");
        }
        else
        {
            System.out.println("you die");
        }
        return 0;
    }
    public int userInput()
    {
        int choice;
        try
        {
            choice = Integer.valueOf(scan.nextLine());
            if(!(choice == 1 || choice == 2))
            {
                throw new NumberFormatException();
            }
        }
        catch (NumberFormatException e)
        {
            System.out.println("invalid number");
            choice = -1;
        }
        return choice;
    }
}