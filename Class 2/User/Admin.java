import java.util.Scanner;

public class Admin extends User {
    String staffId;
     void uploadResults(String course, float score) {
        Scanner adminInput = new Scanner(System.in);
        System.out.println(course + score);

     }
     public static void main(String[] args) {
        Admin staffId = new Admin();
        staffId.password = "New staff";
        System.out.println(staffId.name);
     }
}