import java.util.Scanner;

public class HelloWorld{  // class name should be same as filename
    public static void main(String[] args) {
        System.out.println("Hello, World!");  // system -> class , println -> function
        System.out.print("Hello, World!");  // system -> class , println -> function

        Scanner input = new Scanner(System.in);
        System.out.print(input.next());
        System.out.print(input.nextInt());
    }
}

// static: This keyword indicates that the method belongs to the class, not to any specific
//         instance of the class. This means you don't need to create an object of the HelloWorld 
//         class to call this method. The JVM calls the main method directly via the class name.


// String[] args: This is a parameter for the main method. String[] represents an array of String 
//                objects, and args is the name of the array. This array can store any command-line 
//                arguments passed to the program when it is executed. If no arguments are provided,
//                the array will be empty.