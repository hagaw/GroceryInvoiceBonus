package company.com;



import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class InvoiceApp {


    public static void main(String[] args) {

        Random rn= new Random();


        double totalPrice = 0;
        double totalInvoice=0;
        int totalQuantity=0;
        String stop = "";

       String userInputItemName = "";
//
        Scanner sc = new Scanner(System.in);
//

        ArrayList<Invoice> myInvoice = new ArrayList<Invoice>();
        int  userInputQuantit=rn.nextInt(10);





        do {


            System.out.println("pleas enter the Item Name");
            userInputItemName = sc.next();


            System.out.println("enter the price");

            double userInputPrice = sc.nextDouble();





           // System.out.println("enter the quantity");

            //int userInputQuantit = sc.nextInt();

            totalPrice = userInputQuantit * userInputPrice;


            totalInvoice=totalInvoice+totalPrice;
            totalQuantity=totalQuantity+userInputQuantit;

               myInvoice.add(new Invoice(userInputItemName, userInputPrice,  userInputQuantit, totalPrice));








            // Invoice invoice1 = new Invoice();

            System.out.println("Do you want to add more invoice ? yes/No");
            stop = sc.next();

            } while (!stop.equalsIgnoreCase("no")) ;


        System.out.println("Item Name" + "\t" + "Price" + "\t" + "Quantity" + "\t"+"Total");
        System.out.println("======================================");

        for (Invoice invoceprnt : myInvoice) {

            System.out.println(invoceprnt.getItemName() + "\t\t" + invoceprnt.getPrice() + "\t\t" + invoceprnt.getQuantity() + "\t\t" + invoceprnt.getTotalPrice());

        }

        System.out.println("total purchase amount "+"\t"+ totalInvoice);
        System.out.println("total purchase quantit " + totalQuantity);


        if (totalInvoice>20){
            System.out.println("You spend to much");
        }else {
            System.out.println("Thank you for Shopping at my market");
        }




    }
    }
