
/**
 * collection of Animal objects
 * 
 * 
 * @author (GavinMoy) 
 * @version (3/5/16)
 */
public class Farm
{
    private Animal [] a = new Animal [3];
    Farm()
    {
        a[0] =new NamedCow("cow","Elsie","moo");
        a[1] = new Chick("chick", "cheep","cluck");
        a[2] = new Pig ("pig", "oink");
    }

    public void animalSounds() {
        for (int i = 0; i< a.length; i++) {
            System.out.println(a[i].getType() + " goes " + a[i].getSound());
        }

        System.out.println("the cow is known as " + ((NamedCow)a[0]).getName());
    }
}

