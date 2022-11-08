import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    int sides;
    Scanner scanner = new Scanner(System.in);

    public Dice(){
        System.out.println("Enter the number of sides of the Dice: ");
        sides = scanner.nextInt();
    }

    public int roll(){
        return ThreadLocalRandom.current().nextInt(1,sides+1);
    }
}
