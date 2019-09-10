
/**
 * Write a description of class StaplerRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StaplerRunner
{
    public static void main(){
        Stapler myStapler = new Stapler();
        Stapler stapler2 = new Stapler("PaperPro");
        
        //This Doesn't work, because the 
        //constructor doesnt exist
        
        //Stapler stapler3 = new Stapler(100);
        //System.out.println(myStapler.isJammed);
        myStapler.stapleStuff();
        myStapler.stapleStuff();
        stapler2.stapleStuff();
    }
}
