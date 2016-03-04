
/**
 * Write a description of class Farm here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Farm
{
    private Animal [] a = new Animal [3];
    Farm()
    {
     a[0] =new Cow("cow","moo");
     a[1] = new Chick("chick", "cluck");
     a[2] = new Pig ("pig", "oink");
    }
    public void animalSounds() {
        for (int i = 0; i< a.length; i++)
        System.out.println(a[i].getType() + " goes " + a[i].getSound());
    }
}
