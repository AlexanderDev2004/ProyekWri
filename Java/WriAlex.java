import java.util.Scanner;
public class WriAlex {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int number;
        System.out.println("Enter Your Number");
        number = Input.nextInt();
        if (number %2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("odd Number");
        }

    }
}
    
    

    

