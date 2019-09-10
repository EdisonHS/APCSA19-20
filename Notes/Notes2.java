public class Notes2
{
    public static int b = 10;
    // Notes2.b
    // Notes2.b()
    public static void main(String[] args)
    {
        int a;
        a = 15;
        System.out.println("Hello World!");
    }

    public static void changeNums(){
        System.out.println(b);
        b++; // Increment by 1
        System.out.println(b);
        b--; // Decrement by 1
        System.out.println(b);
        b *= 2;
        System.out.println(b);
        b %= 2; // B is set to the result of b mod 2
    }
}