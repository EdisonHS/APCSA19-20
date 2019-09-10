
/**
 * Write a description of class Stapler here.
 *
 * @author Wiebe
 * @version 9.4.19
 */
public class Stapler
{
    private int staplesLeft;
    private String color;
    private String brand;
    private String size;
    private boolean isElectric;
    private boolean isJammed;
    private String name;

    public Stapler(String name, int numOfStaples, String color, 
    String brandName, String size, boolean isElectric){
        isJammed = false;
        staplesLeft = numOfStaples;
        this.color = color;
        brand = brandName;
        this.size = size;
        this.isElectric = isElectric;
        this.name = name;
    }

    public Stapler(){
        name = "Stapler";
        isJammed = false;
        staplesLeft = 100;
        color = "Red";
        brand = "Swingline";
        isElectric = false;
        size = "Regular";
    }

    public Stapler(String brandName){
        this("Stapler", 100, "red", brandName, 
            "Regular", false);
    }

    public void stapleStuff(){
        System.out.println("You stapled the papers with the " + color + " stapler.");
        staplesLeft--;
        System.out.println("You have " + staplesLeft + " staples left.");
    }

    public void toss(String name){
        System.out.println("You  throw the stapler at " + name + ".");
        isJammed = true;
        System.out.println("The stapler is now broken");
    }
    //Accessor Methods
    public String getName(){
        return name;
    }
    public int numOfStaplesLeft(){
        return staplesLeft;
    }
    //Mutator Methods
    
    public void changeName(String newName){
        name = newName;
    }
    
}
