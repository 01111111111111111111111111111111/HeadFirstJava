import java.util.Scanner;

/**
 * Created by mwz16 on 10/18/2017.
 */

public class taxComputerCost {

    public static void main (String[] args){

        Scanner reader = new Scanner (System.in);

        //System.out.println("What state are you in?") //possible future, connect to tax table/database based on State abbreviation entry

        System.out.println("What is the sales tax in your state?");
        double stateTax = Double.parseDouble(reader.nextLine());
        double stateTaxPercent = stateTax/100;

        System.out.println("Cost of laptop in $?");
        double computerCost = Double.parseDouble(reader.nextLine());

        System.out.println("The cost of the computer alone is $" + computerCost);

        double total = (stateTaxPercent*computerCost)+computerCost;
        System.out.println("Assuming sales tax of " + stateTax + "%, the total cost is $" + total);

    }
}