import java.util.*;
public class hello
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter your class");
        Integer section = sc.nextInt();        
        System.out.print("Your name ");
        System.out.println(name);
        System.out.print("Your Class ");
        System.out.println(section);
        sc.close();
    }
}