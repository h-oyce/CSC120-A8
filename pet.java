public class Pet extends PetShelter{


public Pet(String name, int age, String animalType, String breed, String health, int timeInShelter){
    super(name, age, animalType, breed, health, timeInShelter);
}





public static void main(String[]args){
Pet Tangbao = new Pet("Tangbao", 1, "Cat", "Domestic Short Hair", "Good", 1);
System.out.println(Tangbao);
}

}
