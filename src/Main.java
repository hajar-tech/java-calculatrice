//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Math.*;
public class Main {
    public static double Read(){
        Scanner scanner = new Scanner(System.in);
        double read = scanner.nextDouble();
        return read;
    }

    public static void Addition() {
        double num1, num2;
        System.out.println("enter the first number: ");
        num1 = Read();
        System.out.println("enter the second number: ");
        num2 = Read();
        System.out.println("The result is: " + (num1 + num2));
    }

    public static void Soustraction() {
        double num1, num2;
        System.out.println("enter the first number: ");
        num1 = Read();
        System.out.println("enter the second number: ");
        num2 = Read();
        System.out.println("The result is: " + (num1 - num2));
    }

    public static void Multiplication() {
        double num1, num2;
        System.out.println("enter the first number: ");
        num1 =Read();
        System.out.println("enter the second number: ");
        num2 = Read();
        System.out.println("The result is: " + (num1 * num2));
    }

    public static void Division() {
        double num1, num2;
        System.out.println("enter the first number: ");
        num1 = Read();
        System.out.println("enter the second number: ");
        num2 = Read();
        if (num2 == 0) {
            System.out.println("Error : Impossible deviser par 0 !!");
        } else {
            System.out.println("The result is: " + (num1 / num2));
        }
    }

    public static void Puissance() {
        double base, pow;
        System.out.println("enter la base: ");
        base = Read();
        System.out.println("enter la puissance: ");
        pow = Read();
        System.out.println("The result is: " + Math.pow(base, pow));
    }

    public static void Racine() {
        double num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number: ");
        num = scanner.nextDouble();
        if (num < 0) {
            System.out.println("Error: the number is negative enter a positive one!!");
        } else {
            System.out.println("The square is: " + Math.sqrt(num));
        }
    }

    public static void Factorielle() {
        double num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number: ");
        num = scanner.nextDouble();
        for (double i = num - 1; i >= 1; i--) {
            num = num * i;
            //System.out.println("The result is: " + num);

        }
        System.out.println("The result is: " + num);
    }



    public static void main(String[] args) {
        int choix =0;
       do {
           System.out.println("\t******************** Menu Principale *****************\n ");
           System.out.println("1: Addition(+)");
           System.out.println("2: Soustraction(-)");
           System.out.println("3: Multiplication(*)");
           System.out.println("4: Division(/)");
           System.out.println("5: Puissance(^)");
           System.out.println("6: Racine Carrée");
           System.out.println("7: Factorielle(!)");
           System.out.println("8: Quiter");

           System.out.println("entrer un choix de 1 à 8");
           Scanner scanner = new Scanner(System.in);

           try{
               choix = scanner.nextInt();

           switch(choix){
               case 1:
                   Addition();
                   break;
               case 2:
                   Soustraction();
                   break;
               case 3:
                   Multiplication();
                   break;
              case 4:
                   Division();
                   break;
               case 5:
                   Puissance();
                   break;
              case 6:
                   Racine();
                   break;
               case 7:
                   Factorielle();
                   break;
               case 8:
                   System.out.println("you finished the programme");
                   break;
               default:
                   System.out.println("chose a number from the menu!!!!");
           }
       }catch (InputMismatchException e){
               System.out.println("Error: that was not a number!!");
           }
       }
       while (choix != 8);
    }
}