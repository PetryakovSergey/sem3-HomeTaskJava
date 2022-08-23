import java.util.Scanner;

/**
 * Ui
 */
public class Ui {

    public Ui() {
        
    }
    public  int  scaner() {
        Scanner sc = new Scanner(System.in);
        System.out.println("input number");
        int num = sc.nextInt();
        //sc.close();
        return num;
        
        
    }
    public  void getMessage(){
        System.out.println("input number of animal");
    }
}