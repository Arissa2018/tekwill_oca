package practice_05_1;
import java.util.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ShoppingCart {


    public static void main(String[] args) throws IOException
    {
        String custName;
        String itemDesc;
        String message;

        double price;
        int quantity;
        double tax=1.3;
        double total;
        Scanner input = new Scanner(System.in);
        System.out.print("Introduceti cantitatea de articole = ");
        quantity=input.nextInt();
        System.out.print("Introduceti numele si prenumele = ");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        custName=br.readLine();
        System.out.print("Introduceti denumirea articolului dorit = ");
        itemDesc=br.readLine();

        message = custName +" wants to purchase " +quantity +" " +itemDesc;
        System.out.print("Introduceti pretul = ");
        price = input.nextDouble();
        total = quantity * price * tax;
        if (quantity>1){
            message=message+"s";
        }
        boolean outofstocks=false;
        if(outofstocks){
            System.out.println(itemDesc +" is not available");
        } else {System.out.println(message);
            System.out.println("De achitat = "+total);
        }

        // Test quantity and modify message if quantity > 1.

        // Declare outOfStock variable and initialize it.

        // Test outOfStock and notify user in either case.


    }
}