import java.util.*;
public class Print_name{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.print("Hi ");
        System.out.print(name);
        sc.close();
    }
}