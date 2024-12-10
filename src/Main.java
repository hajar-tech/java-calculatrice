//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.sql.SQLOutput;
import java.util.Scanner;
import java.lang.Math.*;
public class Main {

    public static void Addition() {
        double num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first number: ");
        num1 = scanner.nextDouble();
        System.out.println("enter the second number: ");
        num2 = scanner.nextDouble();
        System.out.println("The result is: "+(num1+num2));
    }
    public static void Soustraction() {
        double num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first number: ");
        num1 = scanner.nextDouble();
        System.out.println("enter the second number: ");
        num2 = scanner.nextDouble();
        System.out.println("The result is: "+(num1-num2));
    }
  /*  public static void Multiplication() {
        double num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first number: ");
        num1 = scanner.nextDouble();
        System.out.println("enter the second number: ");
        num2 = scanner.nextDouble();
        System.out.println("The result is: "+(num1*num2));
    }
    public static void Division() {
        double num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first number: ");
        num1 = scanner.nextDouble();
        System.out.println("enter the second number: ");
        num2 = scanner.nextDouble();
        if(num2==0){
            System.out.println("Error : Impossible deviser par 0 !!");
        }else {
            System.out.println("The result is: " + (num1 / num2));
        }
    }
    public static void Puissance() {
        double base, pow;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter la base: ");
        base = scanner.nextDouble();
        System.out.println("enter la puissance: ");
        pow = scanner.nextDouble();
        System.out.println("The result is: "+ Math.pow(base , pow));
    }*/



    public static void main(String[] args) {
        int choix;
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
             /*  case 6:
                   Racine();
                   break;
               case 7:
                   Factorielle();
                   break;*/
               case 8:
                   break;

           }
       }
       while (choix != 0);
    }
}