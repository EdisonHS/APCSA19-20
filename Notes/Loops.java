
/**
 * Write a description of class Loops here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Loops
{
    public static void main(){
        for (int i = 0; i < 100; i++){
            System.out.println("We did a thing!");
        }
    }

    public static void main2(){
        for (int i = 0; i < 100; i+=2){
            System.out.println("We did a thing!");
        }
    }

    public static void main3(){
        for (int i = 0; i < 10; i+=2){
            System.out.println(i);
        }
    }

    public static void main4(){
        for (int i = 0; i < 10;){
            System.out.println(i);
            i++;
        }
    }

    public static void main5(){
        for (int i = 10; i > 0; i--){
            System.out.println(i);
        }
    }

    public static void main6(){
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void challenge1(){
        for (int row = 1; row < 6; row++){
            for (int col = 1; col <= row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
    public static void whileLoops(){
        int counter = 10;
        while (counter > 0){
            System.out.println("The count is " + counter);
            counter--;
        }
    }
}
