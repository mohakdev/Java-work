import java.util.*;

public class money_convert {
    // All usd conversions
    public static Integer usd_to_inr(Integer usd)
    {
        Integer answer = usd*73;
        return answer;
    }
    public static double usd_to_sgd(Integer usd)
    {
        double answer = usd*1.33;
        return answer;
    }
    public static double usd_to_gbp(Integer usd)
    {
        double answer = usd*0.73;
        return answer;
    }
    public static double usd_to_dinar(Integer usd)
    {
        double answer = usd*0.30;
        return answer;
    }  
    // All usd conversions end here
    public static double inr_to_usd(Integer inr)
    {
        double answer = inr*0.014;
        return answer;
    }  
    public static double inr_to_sgd(Integer inr)
    {
        double answer = inr*0.018;
        return answer;
    }  
    public static double inr_to_gbp(Integer inr)
    {
        double answer = inr*0.010;
        return answer;
    }  
    public static double inr_to_dinar(Integer inr)
    {
        double answer = inr*0.0042;
        return answer;
    }  
    // All inr conversions end here
    public static double sgd_to_usd(Integer sgd)
    {
        double answer = sgd*0.75;
        return answer;
    }  
    public static double sgd_to_inr(Integer sgd)
    {
        double answer = sgd*54.97;
        return answer;
    }
    public static double sgd_to_gbp(Integer sgd)
    {
        double answer = sgd*0.55;
        return answer;
    }
    public static double sgd_to_dinar(Integer sgd)
    {
        double answer = sgd*0.23;
        return answer;
    }
    // All sgd conversions end here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type the first currency -:");
        String f_currency = sc.nextLine();
        System.out.print("Type the second currency -:");
        String s_currency = sc.nextLine();
        if (f_currency.contentEquals(""))
        {
            System.out.println("       Your first currency is null(blank)");
        }
        if (s_currency.contentEquals(""))
        {
            System.out.println("       Your second currency is null(blank)");
        }
        System.out.print("Type the value -:");
        Integer value = sc.nextInt();
        if (f_currency.contentEquals("usd"))
        {

            if (s_currency.contentEquals("inr"))
            {
                System.out.println(usd_to_inr(value));
            }
            if (s_currency.contentEquals("sgd"))
            {
                System.out.println(usd_to_sgd(value));
            }
            if (s_currency.contentEquals("gbp"))
            {
                System.out.println(usd_to_gbp(value));
            }
            if (s_currency.contentEquals("dinar"))
            {
                System.out.println(usd_to_dinar(value));
            }
        }
        if (f_currency.contentEquals("inr"))
        {

            if (s_currency.contentEquals("usd"))
            {
                System.out.println(inr_to_usd(value));
            }
            if (s_currency.contentEquals("sgd"))
            {
                System.out.println(inr_to_sgd(value));
            }
            if (s_currency.contentEquals("gbp"))
            {
                System.out.println(inr_to_gbp(value));
            }
            if (s_currency.contentEquals("dinar"))
            {
                System.out.println(inr_to_dinar(value));
            }
        }
        if (f_currency.contentEquals("sgd"))
        {

            if (s_currency.contentEquals("usd"))
            {
                System.out.println(sgd_to_usd(value));
            }
            if (s_currency.contentEquals("inr"))
            {
                System.out.println(sgd_to_inr(value));
            }
            if (s_currency.contentEquals("gbp"))
            {
                System.out.println(sgd_to_gbp(value));
            }
            if (s_currency.contentEquals("dinar"))
            {
                System.out.println(sgd_to_dinar(value));
            }
        }
        sc.close();
    }

}
