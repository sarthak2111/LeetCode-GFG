import java.util.Scanner;

public class StringReplaceRecursion {
    public static int index = 0;
    public static String replace(String string, char oldChar, char newChar){
        if(string.charAt(index) == oldChar) {
            string = string.substring(0,index)+newChar+string.substring(index+1);
            return string;
        }
        index++;
        return replace(string, oldChar, newChar);
    }

    public static String replaceAll(String string, char oldChar, char newChar){
        if(index >= string.length()){
            return string;
        }
        if(string.charAt(index) == oldChar) {
            string = string.substring(0,index)+newChar+string.substring(index+1);
        }
        index++;
        return replaceAll(string, oldChar, newChar);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu \n1. Test replace method\n" +
                "2. Test replaceAll method\n" +
                "3. Exit\n\n\n");
        int choice = sc.nextInt();
        while(choice > 0 && choice < 3){
            index = 0;
            if(choice == 1){
                System.out.println("enter the input string, the old character, and the new character, each on a separate line");
                sc.nextLine(); //to read enter key
                String string = sc.nextLine(); // input the string
                char oldChar = sc.next().charAt(0); //input the old character
                char newChar = sc.next().charAt(0); //input the new character
                System.out.println("Output String : "+replace(string, oldChar, newChar));
            }
            else if(choice == 2){
                System.out.println("enter the input string, the old character, and the new character, each on a separate line");
                sc.nextLine();
                String string = sc.nextLine(); // input the string
                char oldChar = sc.next().charAt(0); //input the old character
                char newChar = sc.next().charAt(0); //input the new character
                System.out.println("Output String : "+replaceAll(string, oldChar, newChar));
            }
            System.out.println("\n\nMenu \n1. Test replace method\n" +
                    "2. Test replaceAll method\n" +
                    "3. Exit\n");
            choice = sc.nextInt();
        }
    }
}
