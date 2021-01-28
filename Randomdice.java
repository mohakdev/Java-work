import java.util.Random;
import java.util.Scanner;
public class Randomdice
{
    // random class is used to generate random floates and integers
    // roll() function allow us to generate a random number 
    // the main() function allow us to run the function if user answer yes 
    public static void roll()
    {
        Random no = new Random();
        Integer dice = no.nextInt(7);
        System.out.println(dice);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        for(int a = 1 ; a<=10 ;a--)// Infinite loop is created here 
        {
            System.out.print("Do you want to run the program -:");
            String answer = sc.nextLine();
            if(answer.equals("yes"))// If the user says yes the roll function runs 
            {
                roll();
            }
            else // If user say anything but yes the Infinite Loop will break at line 28 
            {
                System.out.println("Quitting program");
                break;
            }
        }
        sc.close();
    }
}