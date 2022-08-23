package animals;
import animals.base.Animal;
import interfaces.iFlayable;

public abstract class Bird extends Animal implements iFlayable {
    protected int heightOfFlight; 

    protected Bird(int height, int weight, String eyeColor,int heightOfFlight) {
        super(height, weight, eyeColor);
        this.heightOfFlight=heightOfFlight;
        
    }
    public void flight(){
        String.format("I'm flying at %d meters", this.heightOfFlight);
    }
    public void fly(){
        System.out.println("I can fly");
    }
}
