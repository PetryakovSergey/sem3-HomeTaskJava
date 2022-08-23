package animals;

import interfaces.Ilove;

public class Cat extends Pets implements Ilove{

    private String wool;
    
    public Cat(int height, int weight, String eyeColor, String name, String breed, String vaccinated, String color,
            String dateOfBirth,String wool) {
        super(height, weight, eyeColor, name, breed, vaccinated, color, dateOfBirth);
        this.wool = wool;

    }

    public String getWool(){
        return wool;
    }

    @Override
    public void love() {
        System.out.println("touch");
        
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
        
    }

    @Override
    public String getInfo() {
        return String.format("Height: %d, Weight: %d, Eye Color: %s, Name: %s, Breed: %s, Vacctinated: %s, Color: %s, Date of birth: %s, Presence of wool: %s",
        this.height, this.weight,this.eyeColor,this.name,this.breed,this.vaccinated,this.color,this.dateOfBirth,getWool());
        
    }

    @Override
    public void ilove() {
        System.out.println("mur love");
        
    }

    
}
