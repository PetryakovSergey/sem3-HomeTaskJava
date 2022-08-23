package animals;
public class Wolf extends WildAnimal{
    
    private String headOfSquad;

    public Wolf(int height, int weight, String eyeColor, String lifeArea, String dateOfFounding,String headOfSquad) {
        super(height, weight, eyeColor, lifeArea, dateOfFounding);
        this.headOfSquad = headOfSquad;
        
    }

    public String getterHeadOfSquad(){
        return headOfSquad;
    }    

    @Override
    public void makeSound() {
        System.out.println("Auuuuf");
        
    }

    @Override
    public String getInfo() {
        return String.format("Height: %d, Weight: %d, Eye Color: %s, Life area: %s, Date of founding: %s, Head of Squad: %s",
        this.height, this.weight,this.eyeColor,this.lifeArea,this.dateOfFounfing,getterHeadOfSquad());
        
    }
    
    
    
}
