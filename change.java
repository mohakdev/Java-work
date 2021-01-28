import java.util.*;
public class change {
    public static Integer celsius(Integer cell)
    {
        Integer result = (cell*9/5)+32;
        return result;
    }
    public static Integer fahrenheit(Integer fahren)
    {
        Integer result = (fahren-32)*5/9;
        return result;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type c-to-f to convert celsius to fahrenheit otherwise vice-versa:-");
        String what = sc.nextLine();
        if(what.contentEquals("c-to-f"))
        {
            System.out.print("Enter celsius-:");
            Integer celsius = sc.nextInt();
    
            Integer cell_result=celsius(celsius);
            System.out.print(cell_result);
        }
        else if(what.contentEquals("f-to-c"))
        {
            System.out.print("Enter fahrenheit-:");

            Integer fahrenheit = sc.nextInt();
            Integer fahren_result=fahrenheit(fahrenheit);
            System.out.print(fahren_result);

        }
        sc.close();    
    }
}
