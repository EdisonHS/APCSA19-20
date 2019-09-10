
/**
 * Write a description of class Notes3 here.
 *
 * @author Wiebe
 * @version 8.28.19
 */
public class Notes3
{
    public static final double PI = 3.1415936535897932384;
    int guacamole = 17;
    
    public static void main(){
        
    }
    /*List of operators:
     * 
     * 
     * + (Addition)
     * % (Modulus)
     * - (Subtraction)
     * * (Mult)
     * = (Assignment)
     * > (Greater than)
     * < (Less than)
     * >= (Greater than or equal to)
     * <= (Less than or equal to)
     * && (AND)
     * || (OR)
     * ++ (Increment)
     * -- (Decrement)
     * / (Division)
     * ! (NOT)
     * +=
     * -=
     * *=
     * /=
     * %=
     * == (Primitive equality)
     * != (Primitive inequality)
     * 
     */
    public static void equality(){
        int a = 5;
        int b = 5;
        System.out.println("This is true");
        System.out.println(a==b);
        System.out.println();
        
        String c = "this";
        String d = "this";
        
        System.out.println(c == d);  //DO NOT DO THIS!!!!!!!!!
        System.out.println(c.equals(d));  //Use this instead
    }
    
    public static void mystery(){
        int a = 5;
        int b = 0;
        System.out.println(a/b);
    }
    public static int round(double number){
        return (int) (number + 0.5);
    }
}
