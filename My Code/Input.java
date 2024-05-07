import java.util.Scanner;

public class Input {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you love java? ");
        String question = scanner.nextLine();
        System.out.println("Java is a fun language");
        System.out.println("How old are you? ");
        
        System.out.println("Enter your of birth");
        int year_of_birth = scanner.nextInt();
        System.out.println("Enter the current year");
        int year = scanner.nextInt();
         
        int age = (year - year_of_birth);

        System.out.println("You are "+ age + " years old");


        
        
        

    }

    
}
