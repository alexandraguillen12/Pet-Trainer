
public class PetCreator
{
    /* main method */
    public static void main(String[] args){

        //create pet, dog, and cat objects
        Pet Alex = new Pet("Alex", 3, 4, 6);
        Dog Maddie = new Dog("Maddie", 7, 9, 8, "German Shepherd");
        Cat Penelope = new Cat("Penelope", 5, 5, 5, "Gray");

        //print objects
        System.out.println(Alex.toString());
        System.out.println(Maddie.toString());
        System.out.println(Penelope.toString());

    }
}
