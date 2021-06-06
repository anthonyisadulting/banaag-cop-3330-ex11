package base;

import java.util.Scanner;

public class app {public static void main(String[] args){

    Scanner in = new Scanner(System.in);

    System.out.print("How many euros are you exchanging?");
    String euro = in.nextLine();
    double eu = Double.parseDouble(euro);

    System.out.print("What is the exchange rate?");
    String erate = in.nextLine();
    double er = Double.parseDouble(erate);

    double usd = eu * er;

    System.out.print(eu + " euroes at an exchange rate of " + erate + " is " +usd +
            " U.S. Dollars.");





    System.out.println();





















}

}
