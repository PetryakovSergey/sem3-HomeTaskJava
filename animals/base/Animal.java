package animals.base;
/**
 * Animal
 */
public abstract class Animal {

    protected int height;
    protected int weight;
    protected String eyeColor;

    public Animal(int height, int weight, String eyeColor){
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
    }

    public abstract void makeSound();

    public abstract String getInfo();

    
}