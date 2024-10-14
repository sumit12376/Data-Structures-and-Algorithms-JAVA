import java.util.HashSet;

// Class with public and private methods
public class accessmodifier{
    static HashSet<Character> mp = new HashSet<>();

    // Public method that can be accessed from other classes
    public static int findMax(String s) {
        int i = 0;
        int j = 0;
        int max = -1;
        int n = s.length();
        
        while (j < n) {
            char ch = s.charAt(j);
            if (mp.contains(ch)) {
                while (i < j) {
                    mp.remove(s.charAt(i));
                    i++;
                    if (s.charAt(i - 1) == ch) {
                        break;
                    }
                }
            } else {
                mp.add(ch);
                max = Math.max(max, j - i + 1);
                j++;
            }
        }
        return max;
    }

    // Private method that cannot be accessed from outside this class
    private static void printMessage() {
        System.out.println("This is a private method.");
    }

    public static void main(String[] args) {
        String s = "abcabcbb"; // Replace with your input string
        int maxLength = findMax(s);
        System.out.println("The length of the longest substring without repeating characters is: " + maxLength);
        
        // Calling the private method inside the same class
        printMessage();
    }
}

// Another class that accesses the public method
class AnotherClass {
    public static void main(String[] args) {
        String s = "pwwkew";
        
        // Accessing the public method from SLIDING_lon_substr_witout_rep_ch
        int maxLength = SLIDING_lon_substr_witout_rep_ch.findMax(s);
        System.out.println("The length of the longest substring without repeating characters is: " + maxLength);
        
        // Trying to access the private method will result in a compilation error
         SLIDING_lon_substr_witout_rep_ch.printMessage(); // Uncommenting this line will cause an error
    }
}










// import java.util.HashSet;

// public class SLIDING_lon_substr_witout_rep_ch {
//     static HashSet<Character> mp = new HashSet<>();

//     // Public static method that can be accessed from other classes
//     public static int findMax(String s) {
//         int i = 0;
//         int j = 0;
//         int max = -1;
//         int n = s.length();
        
//         while (j < n) {
//             char ch = s.charAt(j);
//             if (mp.contains(ch)) {
//                 while (i < j) {
//                     mp.remove(s.charAt(i));
//                     i++;
//                     if (s.charAt(i - 1) == ch) {
//                         break;
//                     }
//                 }
//             } else {
//                 mp.add(ch);
//                 max = Math.max(max, j - i + 1);
//                 j++;
//             }
//         }
//         return max;
//     }

//     // Private static method that cannot be accessed from outside this class
//     private static void printMessage() {
//         System.out.println("This is a private static method.");
//     }

//     // Instance method
//     public void printInstanceMessage() {
//         System.out.println("This is an instance method.");
//     }

//     public static void main(String[] args) {
//         // Call the public static method directly using the class name
//         String s = "abcabcbb";
//         int maxLength = findMax(s);
//         System.out.println("The length of the longest substring without repeating characters is: " + maxLength);
        
//         // Call the private static method directly
//         printMessage();

//         // Create an object of the class
//         SLIDING_lon_substr_witout_rep_ch obj = new SLIDING_lon_substr_witout_rep_ch();
        
//         // Call the instance method using the object
//         obj.printInstanceMessage(); 
//     }
// }







constructot:


public class Car {
    // Attributes (properties)
    String color;
    String model;

    // Constructor
    public Car(String color, String model) {
        this.color = color;
        this.model = model;
    }

    // Method (behavior)
    public void displayInfo() {
        System.out.println("Car model: " + model + ", Color: " + color);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating instances of the Car class
        Car car1 = new Car("Red", "Toyota");
        Car car2 = new Car("Blue", "Honda");

        // Calling methods on the instances
        car1.displayInfo(); // Output: Car model: Toyota, Color: Red
        car2.displayInfo(); // Output: Car model: Honda, Color: Blue
    }
}


