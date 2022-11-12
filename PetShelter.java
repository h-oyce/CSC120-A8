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
        this.name = name;
        this.age = age;
        this.animalType = animalType;
        this.breed = breed;
        this.health = health;
        this.timeInShelter= timeInShelter;

        this.petsAvailable = new Hashtable<String,String>();
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
    public void grab(String item){
        this.name = item;
        System.out.println(name + " is a "+ animalType + " available for adoption!");

    }

    public String drop(String item){
        this.name = item;
        String adopted = (name + " has been adopted into a loving home!");
        undo();
        return adopted;

    }

    public void examine(String item){
        this.health = item;
        System.out.println(name + " is in " + health + " condition");
    
    }

    public void use(String item){
        System.out.println(name + " is using the " + item + ". So cute!");
    }

    public boolean walk(String direction){
        if (health != "Tired"){
            System.out.println(name + " is walking to " + direction);
            return true;
        }
        else{
            System.out.println(name + " is too tired to walk to " + direction);
            return false;
        }
        
    }

    public boolean fly(int speed, int hour){
        if (animalType == "Bird"){
            System.out.println(name + " is flying !");
            return true;

        }
        else{
            System.out.println(name + " isn't a bird! " + animalType + "'s can't fly!");
            return false;

            
        }
    }
    

    public Number shrink(){
        this.timeInShelter -= 1;
        System.out.println(name + " has been in their happy new home for " + timeInShelter + " days!");
        return timeInShelter;
        
    }

    public Number grow(){
        this.timeInShelter += 1;
        System.out.println(name + " has been in the shelter for " + timeInShelter + " days.");
        return timeInShelter;
    
    }


    public void play(String item){
        System.out.println(name + " is playing with " + item + " right now!");
        health = "Tired";
        rest();
    }

    public void rest(){
        examine("resting");
    
    }

    public void undo(){
        petsAvailable.remove(name);
 
    }

    public String toString() {
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