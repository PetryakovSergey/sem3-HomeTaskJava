package animals;
import animals.base.Animal;

/*1.Домашнее животное со следующими свойствами:
1.1 Кличка
1.2 Порода
1.3 Наличие прививок
1.4 Цвет шерсти
1.5 Дата рождения
И методами:
1.5 Проявлять ласку

*/


public abstract class Pets extends Animal{
    
    protected String name;
    protected String breed;
    protected String vaccinated;
    protected String color;
    protected String dateOfBirth;

    public Pets(int height, int weight, String eyeColor,String name, String breed, String vaccinated, String color, String dateOfBirth){
        super(height, weight, eyeColor);
        this.name = name;
        this.breed = breed;
        this.vaccinated = vaccinated;
        this.color = color;
        this.dateOfBirth = dateOfBirth;


    }

    public abstract void love();


}
