import java.util.*;
public class Calculator
{
    public static Integer add(Integer numb1 ,Integer numb2) 
    {
        Integer result = numb1 + numb2;
        return result;
    }
    public static Integer sub(Integer numb1 , Integer numb2)
    {
        Integer result = numb1 - numb2;
        return result;
    }
    public static Integer mul(Integer numb1 , Integer numb2)
    {
        Integer result = numb1 * numb2;
        return result;
    }
    public static Integer div(Integer numb1 , Integer numb2)
    {
        Integer result = numb1 / numb2;
        return result;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Which Operation do you want to perform : ");
        String operate = sc.next();
        if(operate.contentEquals("add"))
        {
            System.out.print("Enter 1st no.");
            Integer fnumb = sc.nextInt();
            System.out.print("Enter 2nd no.");
            Integer snumb = sc.nextInt();
            Integer result = add(fnumb, snumb);
            System.out.println(result);
        }
        else if(operate.contentEquals("minus"))
        {
            System.out.print("Enter 1st no.");
            Integer fnumb = sc.nextInt();
            System.out.print("Enter 2nd no.");
            Integer snumb = sc.nextInt();
            Integer result = sub(fnumb, snumb);
            System.out.println(result);
        }
        else if(operate.contentEquals("multiply"))
        {
            System.out.print("Enter 1st no.");
            Integer fnumb = sc.nextInt();
            System.out.print("Enter 2nd no.");
            Integer snumb = sc.nextInt();
            Integer result = mul(fnumb, snumb);
            System.out.println(result);
        }
        else if(operate.contentEquals("divide"))
        {
            System.out.print("Enter 1st no.");
            Integer fnumb = sc.nextInt();
            System.out.print("Enter 2nd no.");
            Integer snumb = sc.nextInt();
            Integer result = div(fnumb, snumb);
            System.out.println(result);
        }
        else
        {
            System.out.println("Operation not supported");
        }
        sc.close();
    }   
}