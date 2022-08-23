
import java.util.Scanner;

import animals.Cat;
import animals.Chicken;
import animals.Dog;
import animals.Stork;
import animals.Tiger;
import animals.Wolf;


public class Program {
    // public static int  scaner() {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("input number");
    //     int num = sc.nextInt();
    //     // sc.close();
    //     return num;
        
        
    // }
    // public static void getMessage(){
    //     System.out.println("input number of animal");
    // }
    
   
    public static void main(String[] args) {
        Cat cat = new Cat(1, 1, "blue", "Cat", "Not ident", "Yes", "grey", "22.04", "Yes");
        Chicken chicken = new Chicken(30, 3, "grey", 1);
        Dog dog = new Dog(60 ,10, "blue", "Bobik", "n/u", "yes", "multicolor", "12.06.2022", "No");
        Stork stork = new Stork(55, 7, "brown", 1000);
        Tiger tiger = new Tiger(150, 70, "green", "jungles", "30.01.2022");
        Wolf wolf = new Wolf(130, 55, "grey", "forest", "3.01.2022", "No");

        
       

        Zoo zoopark = new Zoo();
        zoopark.add(cat);
        zoopark.add(dog);
        zoopark.add(stork);
        zoopark.add(chicken);
        zoopark.add(tiger);
        zoopark.add(wolf);
        zoopark.getSize();
        Ui user = new Ui();
        
        
        
        int userMenuChoise = user.scaner();
        
        if ((userMenuChoise >=1 && userMenuChoise <=4) && userMenuChoise <= zoopark.getCount()){
            
        
        switch (userMenuChoise) {
            
            case  1:
                
                
                System.out.println("Use main to add animal");
                break;
            case 2:
                user.getMessage();   
                int userChoise = user.scaner();
                zoopark.remove(userChoise);   
                break;
            case 3:    
                user.getMessage();
                userChoise = user.scaner();
                System.out.println(zoopark.info(userChoise)); 
                break;
            case 4:
                user.getMessage();
                userChoise = user.scaner();
                zoopark.voice(userChoise);
                break;
            

        }
        
        }else if (userMenuChoise==5||userMenuChoise==6){
            switch (userMenuChoise) {
                case 5:
                    zoopark.printAllInfo();
                    break;
            
                case 6:
                        zoopark.allVoice();
                        break;    
                default:
                        break;
            }
        }else{System.out.println("input correct number");}
        zoopark.getSize();
        
    }
}       

    



 

        


