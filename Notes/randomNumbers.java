
/**
 * Write a description of class randomNumbers here.
 *
 * @author Wiebe
 * @version 8.29.19
 */
import java.lang.Math;
// import java.util.Random; DO NOT USE THIS CLASS!!!!!!!!!!!
public class randomNumbers
{
    public static void main(String[] args){
        double num = Math.random()*10 + 1;
        int newNum = (int) num;
        System.out.println(newNum);
    }
    public static void main2(String[] args){
        double num = Math.random()* 44 + 27;  //There are 44 numbers between 27 and 70
        int newNum = (int) num;
        System.out.println(newNum);
    }
}
