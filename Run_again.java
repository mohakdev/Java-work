import java.util.Scanner;
public class Run_again {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        for(int a = 1 ; a<=10 ;a--)// Infinite loop is created here 
        {
            System.out.print("Do you want to run the program -:");
            String answer = sc.nextLine();
            if(answer.equals("yes"))// If the user says yes the roll function runs 
            {
                //Method you want to call if yes
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
