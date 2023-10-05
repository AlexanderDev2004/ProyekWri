import java.util.Scanner;
public class Nested1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value;
        System.out.println("Enter a value (1-100) : ");
        value = sc.nextInt();

        if (value >= 0 && value <= 100 ) {
            if (value > 90 && value < 100) {
            System.out.println("Grade A You Amazin ");    
            }
        } else if (value > 80 && value < 89) {
            System.out.println("Grade b keep up ");
        }
        else if (value > 50 && value < 59) {
            System.out.println("Grade c keep up ");
        } else {
            System.out.println("Grett E");
        }
      sc.close();  
    }
}