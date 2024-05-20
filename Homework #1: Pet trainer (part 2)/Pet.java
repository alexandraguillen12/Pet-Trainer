public class Pet
{
    // class definition
    String name;
    int health;
    int energy;
    int happiness;
    
    /* constructor method */
    public Pet(String name, int health, int energy, int happiness){
        this.name = name;
        this.health = health;
        this.energy = energy;
        this.happiness = happiness;
    }
    
    /* return a string stating name, health, energy,and happiness */
    public String toString(){
        return "Pet " + name + " (health = " + health + ", energy = " + energy + ", happiness = " + happiness + ")";
    }
    
    String feed(){
        return "";
    }
    
    String walk(){
        return "";
    }
    
    public void range(){
            if (health > 10)
                health = 10;
            if (health < 0)
                health = 0; 
            if (energy > 10)
                energy = 10;
            if (energy < 0)
                energy = 0;
            if (happiness > 10)
                happiness = 10;
            if (happiness < 0)
                happiness = 0;    
        }
    
    public int sum(){
        return (health + energy + happiness);
    }
}
