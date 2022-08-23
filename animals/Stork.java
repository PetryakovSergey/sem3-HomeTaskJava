package animals;

import interfaces.iFlayable;

public class Stork extends Bird implements iFlayable{

    public Stork(int height, int weight, String eyeColor, int heightOfFlight) {
        super(height, weight, eyeColor, heightOfFlight);
        
    }

    @Override
    public void makeSound() {
        System.out.println("kurlik kurlik");
        
    }

    @Override
    public String getInfo() {
        return String.format("Height: %d, Weight: %d, Eye Color: %s, Height of Flight: %d",
        this.height, this.weight,this.eyeColor,this.heightOfFlight);
    }
    public void flight(){

    }
        
}
