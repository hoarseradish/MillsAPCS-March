
/**
 * cow implementation of Animal
 * 
 * @author (Gavin Moy) 
 * @version (3/5/16)
 */
public class Cow implements Animal
{
    private String myType;
    private String mySound;
    Cow(String type, String sound) {
        myType = type;
        mySound = sound;
    }
    public String getSound() {return mySound;}
    public String getType() {return myType;}
}
