import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


import animals.base.Animal;

/*Так же реализовать класс "Зоопарк", в котором будет
храниться любая структура данных животных(массив, стек, очередь),
в котором организовать приватный массив объектов-животных со следующими методами:*/
public class Zoo {
    private List <Animal> listAnimals;
    private int counter = 0;
   
    {System.out.println("1. to add animal\n2. to remove animal\n3. print info about animal\n4. to ask animal: - make a voice\n5. print all animals in zoo info\n6. to make all animals voices in zoo");  }
    
    public int getCount(){
        return counter;
    }

    public void getSize(){
        System.out.println(counter + " animals in zoo");
    }
    public Zoo() {
        this.listAnimals = new LinkedList<>();
    // отличие объекта от класса
        
    }

    public void add(Animal animal) {
        listAnimals.add(animal);
        counter++;
    
    }
    public Animal get(Integer index) {
        return listAnimals.get(index);
    }
    public void remove(int index) {
        listAnimals.remove(index);
        counter--;
    }
    //3.Посмотреть информацию о животном с номером i
    public String info(int index){
        return  get(index).getInfo();
    }

    // Заставить животное с номером i издать звук
    public void voice(int index){
        get(index).makeSound();
    }

    //Напечатать информацию о животных, которые есть на данный момент в зоопарке
    public void printAllInfo() {
        Iterator<Animal> iterator = listAnimals.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getInfo());
        }
    }
    //Заставить всех животных, которые на данный момент есть в зоопарке, издать звук

    public  void allVoice() {
        
        for (Animal animal : listAnimals) {
            animal.makeSound();        
        }
    }
    
}
       

    
    


