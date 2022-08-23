package animals;

import interfaces.Ilove;
import interfaces.itrainable;

public class Dog extends Pets implements Ilove, itrainable {
    
    private String trained;

    public Dog(int height, int weight, String eyeColor, String name, String breed, String vaccinated, String color,
            String dateOfBirth,String trained) {
        super(height, weight, eyeColor, name, breed, vaccinated, color, dateOfBirth);
        this.trained=trained;
        
        }
    

    @Override
    public void love() {
        System.out.println("lick");
        
    }

    @Override
    public void makeSound() {
        System.out.println("Gav gav");
        
    }

    @Override
    public String getInfo() {
        return String.format("Height: %d, Weight: %d, Eye Color: %s, Name: %s, Breed: %s, Vacctinated: %b, Color: %s, Date of birth: %s, Trained: %b",
        this.height, this.weight,this.eyeColor,this.name,this.breed,this.vaccinated,this.color,this.dateOfBirth,getterTrained());
        
    }
    public String getterTrained(){
        return trained;
    }

    public void train(){
        System.out.println("Let's train");
    }


    @Override
    public void ilove() {
        System.out.println("I love");
        
    }


    @Override
    public void canTrain() {
        System.out.println("I can train");
        
    }


    
}
