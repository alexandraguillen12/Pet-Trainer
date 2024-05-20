
public class Dog extends Pet
{
    // class definition
    String breed;
    
    /* constructor method */
    public Dog(String name, int health, int energy, int happiness, String breed){
        super(name, health, energy, happiness);
        this.breed = breed;
    }
    
    /* return a string stating breed, name, health, energy,and happiness */
    public String toString(){
        return breed + " " + name + " (health = " + health + ", energy = " + energy + ", happiness = " + happiness + ")";
    }
    
    String feed(){
        if (energy >= 7 && health < 6){
           health -= 2;
           happiness -= 2;
           return name + " sick from a bad chocolate cookie -> -2 health, +0 energy, -2 happiness";}
        else {
            energy += 2;
            happiness += 2;
            return name + " eats all the cookies and is loving life -> +0 health, +2 energy, +2 happiness";
        }
    }
    
    String walk(){
        if (energy < 5){
           health -= 1;
           happiness -= 3;
           return name + " is too tired for walking -> -1 health, +0 energy, -3 happiness";}
        else {
            health += 2;
            energy -= 1;
            happiness += 2;
            return name + " enjoys spending time with you outside -> +2 health, -1 energy, +2 happiness";
        }
    }
}
