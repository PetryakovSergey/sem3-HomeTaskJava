package animals;
public class Tiger extends WildAnimal {

    public Tiger(int height, int weight, String eyeColor, String lifeArea, String dateOfFounding) {
        super(height, weight, eyeColor, lifeArea, dateOfFounding);
        
    }

    @Override
    public void makeSound() {
        System.out.println("Roar");
        
    }

    @Override
    public String getInfo() {
        return String.format("Height: %d, Weight: %d, Eye Color: %s, Life area: %s, Date of founding: %s",
        this.height, this.weight,this.eyeColor,this.lifeArea,this.dateOfFounfing);
        
    }
    
    
}