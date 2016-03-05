import java.util.*;
/**
 * Chick implementation of Animal
 * 
 * @author (Gavin Moy) 
 * @version (3/5/16)
 */
public class Chick implements Animal
{
    
    private String myType;
    private String mySound;
    private String mySound2;
    Chick(String type, String sound) {
        myType = type;
        mySound = sound;
    }
    Chick(String type, String sound, String sound2) {
        myType = type;
        mySound = sound;
        mySound2 = sound2;
    }
    public String getSound() {
        int num = (int)(Math.random()+.5);
        if(num ==0) {
            return mySound; 
        }
        else {
            return mySound2;
        }
    }
    public String getType() {return myType;}
}
