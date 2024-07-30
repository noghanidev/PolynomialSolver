import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine(); //:)
        PolynomialCredibilityChecker checker = new PolynomialCredibilityChecker(userInput);
    }
}
