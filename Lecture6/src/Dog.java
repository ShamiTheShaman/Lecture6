import java.util.Scanner;

public class Dog {
    int age;
    double weight;
    String name;
    Scanner scanner = new Scanner(System.in);

    public Dog(){
        System.out.println("Enter the Dog name: ");
        name = scanner.next();
        System.out.println("Enter the Dog age: ");
        age = scanner.nextInt();
        System.out.println("Enter the Dog weight: ");
        weight = scanner.nextDouble();
    }

    public String bark(){
        return "Bark";
    }

    public String woof(){
        return "Woof";
    }

    public String ageToHuman(){
        switch (age){
            case 1:
                    return "15 human Year";
            case 2:
                return "24 human Year";
            case 3:
                return "28 human Year";
            case 4:
                return "32 human Year";
            case 5:
                return "36 human Year";
            case 6:
                return "40 human Year";
            case 7:
                return "44 human Year";
            case 8:
                return "48 human Year";
            case 9:
                return "52 human Year";
            case 10:
                return "56 human Year";
            case 11:
                return "60 human Year";
            case 12:
                return "64 human Year";
            case 13:
                return "68 human Year";
            case 14:
                return "72 human Year";
            case 15:
                return "76 human Year";
            case 16:
                return "80 human Year";
            default:
                return "Less than 1 year old or older than 16 years old";
        }
    }
}
