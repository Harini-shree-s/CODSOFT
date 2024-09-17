import java.util.Scanner;
public class Currency_convertor
{
    public static void main(String [] args)
    {
        Scanner scanner= new Scanner(System.in);
        System.out.println("_______-CURRENCY_CONVERTOR______");
        System.out.println("1.USD TO RUPEE");
        System.out.println("2.RUPEE TO USD");
        System.out.println("3.EURO TO RUPEE");
        System.out.println("4.RUPEE  TO EURO");
        System.out.println("ENTER YOUR CHOICE:");
        int choice= scanner.nextInt();

        if (choice==1){
            System.out.println("ENTER THE AMOUNT IN USD:");
            double USD=scanner.nextDouble();
            double Rupee= UsdToRupee(USD);
            System.out.print("RUPEE:  "+Rupee);

        }
        else if(choice==2)
        {
            System.out.println("ENTER THE AMOUNT IN RUPEE :");
            double Rupee=scanner.nextDouble();
            double USD= RupeeToUsd(Rupee);
            System.out.print("USD:  "+USD);
        }
        else if(choice==3)
        {
           System.out.println("ENTER THE AMOUNT IN EURO :");
            double EURO=scanner.nextDouble();
            double Rupee= EuroToRupee(EURO);
            System.out.print("RUPEE:  "+Rupee); 
        }
        else if(choice==4)
        {
          System.out.println("ENTER THE AMOUNT IN RUPEE :");
            double Rupee=scanner.nextDouble();
            double EURO = RupeeToEuro(RUPEE);
            System.out.print("EURO:  "+EURO);   
        }
        else
        {
            System.out.println("INVALID CHOICE CHOOSE A VALID OPTION");
        }
        Scanner.close();
    
    }
    public static double usdToRupee(double USD);
    {
        return USD * 83.47; 
    }
    public static double RupeeToUsd(double Rupee);
    {
        return Rupee * 0.0119804;
    }
    public static double EuroToRupee (double EURO);
    {
        return EURO *89.10;
    }
    public static double RupeeToEuro( double Rupee);
    {
         return Rupee * 0.0113;
    }
    
}