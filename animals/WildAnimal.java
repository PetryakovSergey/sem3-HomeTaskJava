package animals;
import animals.base.Animal;

public abstract class WildAnimal extends Animal{

    protected String lifeArea;
    protected String dateOfFounfing;


    public WildAnimal(int height, int weight, String eyeColor, String lifeArea, String dateOfFounding) {
        super(height, weight, eyeColor);
        this.lifeArea = lifeArea;
        this.dateOfFounfing = dateOfFounding;
        
    }
    
}
