
/**
 * pig implementation of Animal interface
 * 
 * @author (Gavin Moy) 
 * @version (3/5/16)
 */
public class Pig implements Animal
{
    
        private String myType;
        private String mySound;
        Pig(String type, String sound) {
            myType = type;
            mySound = sound;
        }
        public String getSound() {return mySound;}
        public String getType() {return myType;}
    }
