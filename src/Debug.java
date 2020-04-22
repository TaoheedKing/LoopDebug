import java.util.Scanner;

public class Debug {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("please enter a word!");
        String userInput;
        userInput = keyboard.nextLine();

        while (userInput != "") {
            System.out.println(userInput);
            break;
        }
    }
}
