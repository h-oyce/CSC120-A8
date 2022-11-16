/*
@File       : pet.java
@Time       : 2022/11/16 4:00 PM EST
@Author     : JCrouser edited by Lily G., Juniper H., Lesly H., and Priscilla T.
@Desc       : A Java file that extends our PetShelter and allows us to add new pets into our virtual shelter.
*/

public class Pet extends PetShelter{


    public Pet(String name, int age, String animalType, String breed, String health, int timeInShelter){
        super(name, age, animalType, breed, health, timeInShelter);
    }
    
    
    
    public static void main(String[]args){
           /**
        * This is the main method 
        * which is very important for the
        * execution of a java program. Here we can test adding a pet
        */ 

    Pet Tangbao = new Pet("Tangbao", 1, "Cat", "Domestic Short Hair", "Good", 1);
    System.out.println(Tangbao);
    }
    
    }