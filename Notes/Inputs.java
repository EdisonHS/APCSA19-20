
/**
 * Write a description of class Inpouts here.
 *
 * @author Wiebe
 * @version 8.22.19
 */
import java.util.Scanner;
public class Inputs
{
    /**This program will ask you for a phrase,
     * and it will repeat it back to you in
     * the terminal
     * 
     */
    public static void sayIt(String[] args){
        /*
         * This is a multi-line comment
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! What is your name?");
        String line1 = scanner.nextLine();
        System.out.println(line1);
        
        System.out.println("How old are you?");
        int line2 = scanner.nextInt();
        System.out.println(line2 + "?!?!?");
        System.out.println("You belong in a museum!");

        System.out.print("Last year, you were ");
        System.out.print(line2 - 1);
        System.out.print(" years old.");
    }
    public static void recasting(){
        int number = 123;
        System.out.print("The last number is ");
        System.out.println(number % 10);
    }
}
