import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Tabuada de: ");
        int num = input.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", num, i, num*i);
        }
    }
}