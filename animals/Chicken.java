package animals;
public class Chicken extends Bird {

    public Chicken(int height, int weight, String eyeColor, int heightOfFlight) {
        super(height, weight, eyeColor, heightOfFlight);
        
    }

    @Override
    public void makeSound() {
        System.out.println("ko ko ko");
        
    }

    @Override
    public String getInfo() {
        return String.format("Height: %d, Weight: %d, Eye Color: %s, Height of Flight: %d",
        this.height, this.weight,this.eyeColor,this.heightOfFlight);
    }

    
    
}
