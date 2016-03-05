
/**
 * sbuclass of Cow class allows for name
 * 
 * @author (Gavin Moy) 
 * @version (3/5/16)
 */
public class NamedCow extends Cow
{
   private String myName;
   NamedCow(String type, String name, String sound) {
       super(type, sound);
       myName = name;
    }
   public String getName() {
       return myName;
    }
}
