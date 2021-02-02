import java.util.*;

public class Rock {
    public static void rock()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Choose rock, paper, scissors -:");
        String player_choice = scan.nextLine();
        Random rand = new Random();
        String[] all_choices = {"rock","paper","scissors"};//All options
        String computer_choice = all_choices[rand.nextInt(all_choices.length)];//Making computer choice one option
        //System.out.println(computer_choice);
        if(player_choice.equals("rock")&&computer_choice.equals("rock"))
        {
            System.out.print("Computer choice -:");
            System.out.println(computer_choice);
            System.out.println("It's a tie");
            
        }
        if(player_choice.equals("rock")&&computer_choice.equals("paper"))
        {
            System.out.print("Computer choice -:");
            System.out.println(computer_choice);
            System.out.println("You lose");
            
        }
        if(player_choice.equals("rock")&&computer_choice.equals("scissors"))
        {
            System.out.print("Computer choice -:");
            System.out.println(computer_choice);
            System.out.println("You won");
            
        }
        if(player_choice.equals("paper")&&computer_choice.equals("rock"))
        {
            System.out.print("Computer choice -:");
            System.out.println(computer_choice);
            System.out.println("You won");
            
        }
        if(player_choice.equals("paper")&&computer_choice.equals("paper"))
        {
            System.out.print("Computer choice -:");
            System.out.println(computer_choice);
            System.out.println("Its a tie");
            
        }
        if(player_choice.equals("paper")&&computer_choice.equals("scissors"))
        {
            System.out.print("Computer choice -:");
            System.out.println(computer_choice);
            System.out.println("You lose");
            
        }
        if(player_choice.equals("scissors")&&computer_choice.equals("rock"))
        {
            System.out.print("Computer choice -:");
            System.out.println(computer_choice);
            System.out.println("You lose");
            
        }
        if(player_choice.equals("scissors")&&computer_choice.equals("paper"))
        {
            System.out.print("Computer choice -:");
            System.out.println(computer_choice);
            System.out.println("You won");
            
        }
        if(player_choice.equals("scissors")&&computer_choice.equals("scissors"))
        {
            System.out.print("Computer choice -:");
            System.out.println(computer_choice);
            System.out.println("Its a tie");
            
        }
        scan.close();
    }
    public static void main(String[] args) 
    {
        rock();
        
    }
}

