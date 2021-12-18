package learning_java;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Primitives
        int integer = 5;
        int integer2 = 2;
        double decimal = 7.0;
        boolean bool_var = true;
        char c = 'f'; // chars require ''

        String str = "9weufj"; // strings require "", and it is not primitive

        System.out.println(integer + ", " + decimal + ", " + bool_var);
        System.out.println("char: " + c);
        System.out.println("string: " + str);



        // Operations
        double div = (integer/decimal);
        System.out.println("division: " + div);

        double power = Math.pow(integer, decimal);
        System.out.println(power);

        double div2 = integer/(double)integer2; // type casting, otherwise 2.0 is returned instead of 2.5
        System.out.println(div2);


        // Scanners - allow for user input
        Scanner sc = new Scanner(System.in);
        String scanned = sc.next(); // sc.next() expects a string
        int scanned_int = sc.nextInt(); // sc.nextInt() expects an int
        // nextDouble() and nextBoolean() are also a thing
        System.out.println("input str: "+scanned);
        System.out.println("input int: "+scanned_int);


    }
}






