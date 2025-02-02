import java.util.Scanner;

public class Input{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name: ");
        String name;
        name = scanner.nextLine();

        System.out.print("What is your age: ");
        int age;
        age = scanner.nextInt();

        System.out.print("What is your weight: ");
        double weight;
        weight = scanner.nextDouble();

        System.out.print("Are you a smoker(true/false): ");
        boolean smoker;
        smoker = scanner.nextBoolean();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Smoker: " + smoker);
    }
}
