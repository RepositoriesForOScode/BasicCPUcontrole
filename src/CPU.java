import java.util.Arrays;
import java.util.Scanner;
public class CPU {

    public static void CPUpause(String[] args) { // String[] args is a list of strings
        args = UserInput(args);
        System.err.println(args.length);
        if (args.length != 1) { // if the length is 0 or greater than 1 
            System.err.println("Usage: java CPU <string>"); // print error message
            System.exit(1); // terminate program
        }

        String str = args[0]; // the one string element the the user provides in command line

        while (true) {
            // choosing 10 seconds for testing perposes, making the cpu wait 10 seconds before printing string
            spin(10);  // tells the cpu to wait, halt oporations on the proggram
            System.out.println(str); // print out the string from the users command line entries
        }
    }

    // Simulates CPU spin for the given number of seconds
    public static void spin(int seconds) {
        long start = System.nanoTime(); // gets the current time in nanoseconds
        long duration = seconds * 1_000_000_000L; // convert to nanoseconds to get durration in nanoseconds

        while ((System.nanoTime() - start) < duration) { // the diffrence between start time and current time 
            // has to be less than the durration, for example if start time is 50 and current time
            // is 60 and the duration is 10 sec then than the while loop will die.
        }
    }

    public static String[] UserInput(String[] args) {
        Scanner scanner = new Scanner(System.in); // create a scanner object to read user input
        System.out.print("Enter a string: "); // prompt the user for input
        String input = scanner.nextLine(); // read the input from the use
        args = Arrays.copyOf(args, args.length + 1); // add length to the the array
        args[args.length - 1] = input; // add user input to the array
        scanner.close(); // close user input
        return args; // return new array
    }

}

//A CPU (Central Processing Unit) is the brain of a computer. It’s the chip that executes instructions and performs calculations, moving data, 
//running programs, and making decisions based on logic.
/*
Here’s what the CPU handles in every program:

Fetch – Get the next instruction from memory.
Decode – Figure out what the instruction is asking.
Execute – Carry it out (e.g., add numbers, move data, jump somewhere).
Repeat – Billions of times per second.
*/
