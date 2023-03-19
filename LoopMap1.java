import java.util.ArrayList;
import java.util.Scanner;

public class NumberStats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt();
            numbers.add(num);
        }
