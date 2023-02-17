import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = 0, total = 0, counter = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many number do you want to enter?");
        int n = scanner.nextInt();

        while(counter <= n){
            System.out.println("What is number " + counter + ": ");
            number = scanner.nextInt();
            total += number;
            counter++;
        }
        System.out.println("Total: " + total);
    }
}
