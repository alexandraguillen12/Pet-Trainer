
public class Cat extends Pet
{
    // class definition
    String color;

    /* constructor method */
    public Cat(String name, int health, int energy, int happiness, String color){
        super(name, health, energy, happiness);
        this.color = color;
    }

    /* return a string stating color, name, health, energy,and happiness */
    public String toString(){
        return color + " cat " + name + " (health = " + health + ", energy = " + energy + ", happiness = " + happiness + ")";
    }

    String feed(){
        if (Math.random() > .5){
            happiness -= 2;
            return name + " rejects your food -> +0 health, +0 energy, -2 happiness";}
        else {
            energy += 2;
            happiness += 2;
            return name + " eats and licks their paws in delight -> +0 health, +2 energy, +2 happiness";}
    }

    String walk(){
        if (Math.random() > .5){
            health -= 2;
            energy += 3;
            happiness += 2;
            return color + " " + name + " doesn’t feel like walking, eats instead -> -2 health, +3 energy, +2 happiness";}
        else {
            if (energy < 5){
                happiness -= 2;
                health += 1;
                return color + " " + name + " trips and falls -> +1 health, +0 energy, -2 happiness";}
            else {   
                health += 3;
                energy -= 1;
                return color + " " + name + " enjoys spending time with you outside -> +3 health, -1 energy, +0 happiness";}
            }
    }
}
