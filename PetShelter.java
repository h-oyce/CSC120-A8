/*
@File       : PetShelter.java
@Time       : 2022/11/16 4:00 PM EST
@Author     : JCrouser edited by Lily G., Juniper H., Lesly H., and Priscilla T.
@Desc       : A Java file that implements the contract file provided by Professor JCrouser. We chose to create a Petshelter and used different methods to interact with the pets.
*/

import java.util.Hashtable; //imports Hashtable so that we can store a list of pets (key: name, value: type of animal) in the pet shelter



public class PetShelter implements Contract {
    private Hashtable<String,String> petsAvailable; //Hashtable to store pets in the shelter
    private String name;
    private int age;
    private String animalType;
    private String breed;
    protected String health;
    protected int timeInShelter;


    public PetShelter(String name, int age, String animalType, String breed, String health, int timeInShelter){
        this.name = name; //listing the attributes for our method
        this.age = age;
        this.animalType = animalType;
        this.breed = breed;
        this.health = health;
        this.timeInShelter= timeInShelter;

        this.petsAvailable = new Hashtable<String,String>(); //initializing our hashtable with our attributes
        System.out.println("Welcome to our Pet Shelter!");

    }



    public String getName() { //returns the name of the pet
        return this.name;
    }
    
    public int getAge() { //returns the age of the pet
        return this.age;
    }
    
    public String animalType(){ //returns the type of pet, cat, dog, bird, etc
        return this.animalType;
    }
    
    public String breed(){ //returns the breed of the pet
        return this.breed;
    }



    /*methods */
    public void grab(String item){ //implements grab from the provided contract @param: String Item
        this.name = item;
        System.out.println(name + " is a "+ animalType + " available for adoption!");

    }

    public String drop(String item){ //implements drop from the provided contract @param: String Item
        this.name = item;
        String adopted = (name + " has been adopted into a loving home!");
        undo();
        return adopted;

    }

    public void examine(String item){ //implements examine from the provided contract @param: String Item
        this.health = item;
        System.out.println(name + " is in " + health + " condition");
    
    }

    public void use(String item){ //implements use from the provided contract @param: String Item
        System.out.println(name + " is using the " + item + ". So cute!");
    }

    public boolean walk(String direction){ //implements walk from the provided contract @param: String Item
        if (health != "Tired"){
            System.out.println(name + " is walking to " + direction);
            return true;
        }
        else{
            System.out.println(name + " is too tired to walk to " + direction);
            return false;
        }
        
    }

    public boolean fly(int speed, int hour){ //implements fly from the provided contract. This method only works for the animal type "Bird" @param: String Item
        if (animalType == "Bird"){
            System.out.println(name + " is flying !");
            return true;

        }
        else{
            System.out.println(name + " isn't a bird! " + animalType + "'s can't fly!");
            return false;

            
        }
    }
    

    public Number shrink(){ //This method interacts with the length of time an animal has been adopted (Shelter - 1)
        this.timeInShelter -= 1;
        System.out.println(name + " has been in their happy new home for " + timeInShelter + " days!");
        return timeInShelter;
        
    }

    public Number grow(){ //This method interacts with the length of time an animal has been in the shelter (Shelter + 1)
        this.timeInShelter += 1;
        System.out.println(name + " has been in the shelter for " + timeInShelter + " days.");
        return timeInShelter;
    
    }


    public void play(String item){ //implements play from the provided contract @param: String Item
        System.out.println(name + " is playing with " + item + " right now!");
        health = "Tired";
        rest();
    }

    public void rest(){ //implements rest from the provided contract
        examine("resting");
    
    }

    public void undo(){ //implements undo from the provided contract. Uses the .remove method with an animal's name
        petsAvailable.remove(name);
 
    }

    public String toString() { //implements walk from the provided contract @return: String Item (name, age, breed, animalType)
        return this.name + " is a "  +  this.age + " year old " + this.breed + " " + this.animalType;
    }

    public void printRegistry(){ //prints out the entire registry of pets available in the shelter
        System.out.println(petsAvailable);
    }
   
    
    

public static void main(String[]args){ //main for testing
    PetShelter mPetShelter = new Pet("Tangbao", 1, "Cat", "Domestic Short Hair", "Good", 10);
    System.out.println(mPetShelter);
    mPetShelter.grab("Tangbao");
    mPetShelter.use("cat tree");
    mPetShelter.grow();
    mPetShelter.shrink();
    mPetShelter.walk("the couch");
    mPetShelter.rest();
    mPetShelter.examine("tired");
    mPetShelter.drop("Tangbao");
    mPetShelter.fly(3,1);
    mPetShelter.printRegistry();

}


}