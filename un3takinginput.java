import java.util.*;
public class un3takinginput {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a roll number: ");
        int roll = sc.nextInt();
        System.out.println("Rollno: "+ roll);

        System.out.println("Enter your name: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Name: "+ name);

        System.out.println("Enter your surname: ");
        String surname = sc.nextLine();
        System.out.println("surName: "+ surname);
    }
}
