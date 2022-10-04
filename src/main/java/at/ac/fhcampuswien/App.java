package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    Scanner scanner = new Scanner(System.in);

    //todo Task 1
    public void sayHelloWorld(){
        // input your solution here
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        // input your solution here
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){
        // input your solution here
        char buchstabe = 'Z';
        int hexVal = 0xface;
        int octVal = 012;
        long a = 80L;
        float minus = 44e-1f;
        float f = 5.5f;
        double decimalExponent = 8.88e1;
        double b = 99.9;

        int sum = (int) buchstabe + hexVal + octVal + (int) a + (int) minus + (int) f + (int) decimalExponent + (int) b;

        System.out.println(sum);

    }

    //todo Task 4
    public void addTwoNumbers(){
        // input your solution here
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int sum = x + y;
        System.out.println(sum);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        // input your solution here
        System.out.println("Before Swap:");
        System.out.print("x: ");
        int x = scanner.nextInt();
        System.out.print("y: ");
        int y = scanner.nextInt();
        // zuerst werden x und y addiert, die Summer ist der vorläufige neue x wert
        x = x + y;
        // um y zu erhalten wird von dem nun neuen x wert y abgezogen, so wird aus y die variable x der eingabe
        y = x - y;
        // nun wird von der Summe(x) die neue Variable y abgezogen und so wird aus x die variable y der eingabe
        x = x - y;

        System.out.println("After Swap:");
        System.out.println("x: " + x );
        System.out.println("y: " + y);

    }

    //todo Task 6
    public void compareTwoNumbers() {
        // input your solution here
        System.out.print("n1: ");
        int n1 = scanner.nextInt();
        System.out.print("n2: ");
        int n2 = scanner.nextInt();

        if (n1 > n2) {
            System.out.println("n1 > n2");
        } else if (n2 > n1) {
            System.out.println("n2 > n1");
        } else {
            System.out.println("n1 == n2");
        }
    }

    //todo Task 7
    public void ratingSalesPerson(){
        // input your solution here
        System.out.print("Enter annual Revenue: ");
        int revenue = scanner.nextInt();

        if (revenue < 0 || revenue >= 100000) {
            System.out.println("Invalid Revenue");
        } else if (revenue < 20000) {
            System.out.println("Poor Sales Revenue");
        } else if (revenue < 50000) {
            System.out.println("Average Sales Revenue");
        } else if (revenue < 80000) {
            System.out.println("Good Sales Revenue");
        } else {
            System.out.println("Excellent Sales Revenue");
        }
    }

    //todo Task 8
    public void getCommissionRate(){
        // input your solution here
        System.out.print("Enter CommissionClass: ");
        int comClass = scanner.nextInt();

        switch (comClass) {
            case 1:
                System.out.println("Your Commission Rate was set to 0.01");
                break;
            case 2:
                System.out.println("Your Commission Rate was set to 0.02");
                break;
            case 3:
                System.out.println("Your Commission Rate was set to 0.03");
                break;
            case 4:
                System.out.println("Your Commission Rate was set to 0.04");
                break;
            default:
                System.out.println("Your Commission Rate was set to 0.0");
        }
    }

    //todo Task 9
    public void leapyear() {
        // input your solution here
        System.out.print("Year: ");
        int year = scanner.nextInt();
        if (year % 4 != 0) {
            System.out.println("Not a Leapyear");
        } else if (year % 100 != 0) {
            System.out.println("Leapyear");
        } else if (year % 400 == 0) {
            System.out.println("Leapyear");
        } else {
            System.out.println("Not a Leapyear");
        }
    }
    //todo Task 10
    public void transposedNumbers() {
        // input your solution here
        System.out.print("Number: ");
        int number = scanner.nextInt();

        int rev = 0;
        int lastDig = 0;

        if (number >999) {
            System.out.println("Too long");
        } else do {
            //durch den Modulus % wird von der eingegebenen Zahl der Rest angezeigt welcher über bleibt wenn man durch 10 dividiert.
            lastDig = number % 10;
            // Hier wird mit 10 multipliziert um die Ziffer die beim Rest heraus kommt um eine Stelle nach links zu schieben.
            // Start bei 0 somit ergibt sich beim ersten Durchlauf 0*10 + die letze Ziffer die eingegeben wurde
            rev= rev*10 + lastDig;
            //Hier wird durch 10 geteilt um die letzte Ziffer zu entfernen und den Durchlauf neu zu beginnen
            number = number / 10;
        } while (number > 0);
        System.out.println(rev);
    }

    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}