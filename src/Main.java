import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        //This is my first code in Java

        // By using "for loop"!!!
        for(int i = 0; i < 7; i ++){
            System.out.println("Hello Vistula" + i);
        }
        //-----

        int age = 19;
        System.out.println(age);
        int year = 2025;
        int month = 2;
        int day = 20;
        System.out.println("the code was written in " + day+"/"+month+"/"+year);

        // just for fun

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your grade: ");
        String grade = scanner.nextLine().toUpperCase();
        System.out.println("You entered: " + grade);

        switch (grade) {
            case "A":
                System.out.println("You got great point");
                break;
            case "B":
                System.out.println("You got good point");
                break;
            case "C":
                System.out.println("You got average point");
                break;
            case "D":
                    System.out.println("You got bad point");
                break;
            case "F":
                System.out.println("You failed");
            default:
                System.out.println("invalid grade");
        }
        scanner.close();

        System.out.print("See you, bye");
    }
}
