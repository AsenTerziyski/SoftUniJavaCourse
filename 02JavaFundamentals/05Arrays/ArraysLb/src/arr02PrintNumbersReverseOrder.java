import java.util.Scanner;

public class arr02PrintNumbersReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
//        int[] arrNumbers = new int[n];

        int[] numbers = new int[n];
//        for (int i = 0; i < n; i++) {
//            numbers[i] = Integer.parseInt(scanner.nextLine());
//        }

        for (int i = 0; i <numbers.length; i++) {
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int number : numbers) {
            System.out.println(" " + number);
        }

//        for (int i = 0; i < n; i++) {
//            arrNumbers[i] = Integer.parseInt(scanner.nextLine());
//        }
//        for (int i = arrNumbers.length - 1; i >= 0; i--) {
//            System.out.print(arrNumbers[i] + " ");
//        }

    }
}