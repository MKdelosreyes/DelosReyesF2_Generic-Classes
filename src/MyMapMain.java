import Map.MyMap;

import java.util.Scanner;

public class MyMapMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyMap<Integer, String> myMap = new MyMap<>();

        char op;
        int key;
        String val;

//        add - adds keys and values, Integer key and a String value
//        g - get method tester
//        r - remove method tester
//        p - display
//        x - exit program

        while(true) {
            System.out.print("Enter operation: ");
            op = sc.next().charAt(0);

            switch (op) {
                case 'a':
                    key = sc.nextInt();
                    val = sc.nextLine();
                    myMap.put(key, val);
                    break;
                case 'g':
                    key = sc.nextInt();
                    if(myMap.get(key) == null) {
                        System.out.println("Value: " + myMap.get(key));
                    } else {
                        System.out.println("Value: " + myMap.get(key).substring(1));
                    }
                    break;
                case 'r':
                    key = sc.nextInt();
                    if(myMap.get(key) == null) {
                        System.out.println("Value: " + myMap.remove(key));
                    } else {
                        System.out.println("Removed " + myMap.remove(key).substring(1));
                    }
                   break;
                case 'p':
                    myMap.display();
                    break;
                case 'x':
                    System.out.println("Exiting...");
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}