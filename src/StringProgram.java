import java.util.Scanner;

public class StringProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some text\n");
        String inputString = scanner.nextLine();
        System.out.println("You entered: "+inputString+"\n");
        if(inputString.length()>0){
            System.out.println("First letter: "+inputString.charAt(0)); //gives us character at first place
            System.out.println("Last letter: "+inputString.charAt(inputString.length()-1)); //gives us character at last place
        }
        else {
            System.out.println("Invalid input!");
        }
    }
}
