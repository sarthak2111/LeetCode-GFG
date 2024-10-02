import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class CheggProblem {
    public static void SetQuestion(String[] args) {
        Set<String> mySet = new HashSet<>(); //declare the set as HashSet
        mySet.add("Chocolate"); //Nex/////t 4 lines are used to store Ice-cream flavours
        mySet.add("BlackCurrent");
        mySet.add("Strawberry");
        mySet.add("Vanilla");
        System.out.println("Set contents :");
        for(String iceCreamChoice : mySet){
            System.out.println(iceCreamChoice);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your fav. ice-cream flavour");
        String userInput = scanner.next(); //here we input the string to check in list
        if(mySet.contains(userInput)){    //through contains we check if it is present in the set
            mySet.remove(userInput); //as the user input is present in the set so we remove it from the set
            for(String iceCreamChoice : mySet){
                System.out.println(iceCreamChoice);
            }
        }
        else{
            List<String> list = new ArrayList<String>(mySet); //create a list from set
            Collections.sort(list);// We use sort() method to sort the list
            for(String iceCreamChoice : list){
                System.out.println(iceCreamChoice);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double monthSales = 0, advPay = 0, adminFee = 0, commRate = 0;
        System.out.println("Enter monthlySales and advance pay amount :");
        monthSales = sc.nextDouble();
        advPay = sc.nextDouble();
        if(monthSales<10000){
            adminFee = 120;
            commRate = 0.05;
        }
        else if(monthSales >= 10000 && monthSales <= 14999){
            adminFee = 120;
            commRate = 0.10;
        }
        else if(monthSales >= 15000 && monthSales <= 16999){
            adminFee = 150;
            commRate = 0.12;
        }
        else if(monthSales >= 17000 && monthSales <= 21999){
            adminFee = 210;
            commRate = 0.14;
        }
        else if(monthSales>21999){
            adminFee = 230;
            commRate = 0.15;
        }
        if(advPay < (monthSales * commRate)){
            System.out.println("Your monthly pay is $"+((monthSales * commRate) - advPay - adminFee));
        }
        else{
            System.out.println("The amount owing is $"+((monthSales * commRate) + adminFee));
        }
    }
}
