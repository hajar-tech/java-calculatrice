//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {

    public static void Sum() {
        double num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first number: ");
        num1 = scanner.nextDouble();
        System.out.println("enter the second number: ");
        num2 = scanner.nextDouble();
        System.out.println("The result is: "+(num1+num2));
    }
    public static void main(String[] args) {
       Sum();
    }
}