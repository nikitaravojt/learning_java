package learning_java;
import javax.security.sasl.SaslClient;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Primitives
        int integer = 5;
        int integer2 = 2;
        double decimal = 7.0;
        boolean bool_var = true;
        char c = 'f'; // chars require ''

        String str = "9weufj"; // strings require "", and String is not primitive

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


/*        // Scanners - allow for user input
        Scanner sc = new Scanner(System.in);
        String scanned = sc.next(); // sc.next() expects a string
        // nextInt(), nextDouble() and nextBoolean() are also a thing
        // should always use sc.next() though, and validate the input datatype manually
        // converting input into int: int scanned_conv = Integer.parseInt(scanned);

        System.out.println("input str: "+scanned);*/


        // Comparing 2 strings - do not use ==, use str1.equals(str2) instead

/*        // Conditionals...
        if (scanned.equals("hello")) {
            System.out.println("Input is 'hello'");
        }
        else if (scanned.equals("goodbye")) {
            System.out.println("Input is 'goodbye'");
        }
        else {
            System.out.println("Input is not 'hello'");
        }*/



/*
        // Arrays and looping
        // Arrays have fixed length and cannot be appended to (their size cannot change)
        int[] intArray = new int[3];
        intArray[0] = 2;
        intArray[1] = 5;
        intArray[2] = 12;

        // Easier way:
        String[] strArray = {"one", "two", "three"};
        System.out.println("Third element is: "+strArray[2]);

        for (int i=0; i <= strArray.length-1; i++) {
            System.out.println(strArray[i]);
        }

        // for item in names
        for (int element:intArray) {
            System.out.println(element);
        }

        // Populate string array based on user input, printing them at the end
        String[] names = new String[3];
        for (int i=0; i < names.length; i++) {
            System.out.println("Input string: ");
            Scanner sc = new Scanner(System.in);
            String input = sc.next();
            names[i] = input;
        }
        for (String element:names) {
            System.out.println(element);
            if (element.equals("target")) {
                break; // try and avoid using break
            }
        }



        // Number guesser
        Scanner sc2 = new Scanner(System.in);
        int guess;
        int correct = 4;

        do {
            System.out.println("Guess the number between 1 and 5:");
            guess = sc2.nextInt();
        } while (guess != correct);

        */





        // --- Sets and lists ---
        // HashSet, TreeSet and LinkedHashSet are a thing. TreeSets order the data, unlike HashSet.
        // set.remove(), add(), clear(), isEmpty(), size(), contains() are a thing
        Set<Integer> t = new HashSet<Integer>(); // sets contain unordered, unique elements (cannot index them) - like a bubble
        t.add(2);
        t.add(4);
        System.out.println(t);

        if (t.contains(4)) { // sets search through, add and remove elements extremely fast, no matter the size!
            System.out.println("Set contains 4");
        } else {
            System.out.println("Set does not contain 4");
        }

        // ArrayLists are the equivalent of lists in python (mutable size and elements)
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(43); // int 43 added at index 0
        arr.add(79); // int 79 added at index 1
        arr.add(79); // int 79 added at index 2
        arr.add(79); // int 79 added at index 3
        arr.add(79); // int 79 added at index 4

        arr.get(0); // returns int 43
        arr.set(1, 12); // replaces index 1 to int 12

        System.out.println(arr.subList(1,3)); // returns list of arr between index 1 and index 3 (NON-inclusive, so idx 1 and 2)

        System.out.println(arr);



        // Maps (dictionaries) aka HashTables/HashMaps

        Map obj1 = new HashMap(); // HashMap is unordered and cannot contain 2 of the same keys, e.g., two "mass" elems, it'll just overwrite the first one
        obj1.put("name", "Sun"); // add new item to dict; (key, value)
        obj1.put("mass", 333000);
//        obj1.put("pos", int[]); // not sure how to make the dict item value an array/list?
        // TreeMap() is sorted (alphabetically or numerically), but can only store values of the same type (all ints, strings or whatever)
        // LinkedHashMap() is sorted but not alphabetically/numerically, rather in the order in which you define your elems

        obj1.containsValue(333000); // returns True
        obj1.containsKey("name"); // returns True

        obj1.values(); // returns all values in map (dict)
        obj1.keySet(); // returns all keys in map (dict)
        // obj1.clear(); // clears dict
        // obj1.isEmpty(); // returns true if map is empty


        System.out.println(obj1.get("name"));




        // Creating classes and objects
        Dog ted = new Dog("Ted", 7); // object of class Dog in Dog.java
        ted.speak(); // speak() method called

        Cat cat1 = new Cat("Milly", 3, 100);
        cat1.speak();
        cat1.animalSpeak(); // accessing static method via instance reference (i.e., using cat1 object)






    }
}






