
/**
 * Testing class
 * 
 * @author (Gavin MOy) 
 * @version (3/5/16)
 */
public class TestFarm
{
   public static void main(String[] args) {
       Cow c = new Cow("cow", "moo");
       System.out.println(c.getType() + " goes " + c.getSound() );
       Chick ch = new Chick("chick", "cheep", "cluck");
       System.out.println(ch.getType() + " goes " + ch.getSound() );
       Pig p = new Pig("pig", "oink");
       System.out.println(p.getType() + " goes " + p.getSound() );
       Farm farm = new Farm();
       farm.animalSounds();
    }
}
