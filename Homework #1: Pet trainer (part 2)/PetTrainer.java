import java.util.Scanner;

public class PetTrainer
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("################################################################");
        System.out.println("Pet trainer - CMPU-102 edition\n");
        System.out.println("Cats and dogs. Living together. Mass hysteria!");
        System.out.println("################################################################");

        System.out.println("Pick a name for your cat:");
        String catname = scanner.next();

        System.out.println("Pick a color for your cat:");
        String catcolor = scanner.next();

        System.out.println("Pick a name for your dog:");
        String dogname = scanner.next();

        System.out.println("Pick a breed for your dog:");
        String dogbreed = scanner.next();

        Cat cat = new Cat(catname, 5, 5, 5, catcolor);

        Dog dog = new Dog(dogname, 5, 5, 5, dogbreed);

        for (int i=1; i <= 5; i++){
            System.out.println("######################### Round 1 of " + i + " #########################");

            System.out.println("Available actions: feed, walk");
            pickAndRunAction(cat);
            pickAndRunAction(dog);
            
            cat.range();
            dog.range();
        }

        System.out.println("###################### Training complete! ######################");
        System.out.println("Final stats:");
        System.out.println("- " + cat.toString());
        System.out.println("- " + dog.toString());
        
        int catSum = 0;
        int dogSum = 0;
        
        catSum = cat.sum();
        dogSum = dog.sum();
        
        if (catSum > dogSum)
            System.out.println("Your cat turned out better than your dog. You might be a cat person.");
        else 
        System.out.println("Your dog turned out better than your cat. You might be a dog person.");
        
        System.out.println("################################################################");
    }

    static void pickAndRunAction(Pet pet){
        Scanner scanner = new Scanner(System.in);
        String action;
        
        while(true){
            System.out.println("Pick action for " + pet.toString());
            action = scanner.next();
            if (action.equals("feed") || action.equals("walk"))
                break;
            System.out.println("Invalid action... Available: feed, walk...");    
        }
        
        if (action.equals("feed")){
            System.out.println("feeding...");
            System.out.println("Result: " + pet.feed());}
        else if (action.equals("walk")){
            System.out.println("walking...");
            System.out.println("Result: " + pet.walk());}  
    }
}
