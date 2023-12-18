import java.lang.reflect.Array;

public class Main {
    /**
     * Counts the number of set bits (bits with value 1) in the binary representation of a positive integer
     * @param n The input integer for which the number of set bits is to be counted
     * @return The number of set bits in the binary representation of the input integer
     * @throws IllegalArgumentException if the input number is negative
     */
    public static int countBits(int n) {
        // Check if the input number is negative and throw an exception if it is
        if (n < 0) {
            throw new IllegalArgumentException("The number should be positive, not negative");
        }

        // Initialize a variable to count the number of set bits
        int count = 0;

        // Iterate through the bits of the input number and count the set bits
        while (n > 0) {
            count += n & 1; // Increment count if the least significant bit is set (i.e., equal to 1)
            n >>= 1; // Right shift the input number to examine the next bit
        }

        // Return the total count of set bits in the binary representation of the input number
        return count;
    }

    /**
     * Main method to demonstrate the functionality of the countBits function
     * @param args Command line arguments (not used in this example)
     * @throws Exception if an error occurs during execution
     */
    public static void main(String[] args) throws Exception {
        // Print the test results for counting set bits in different numbers
        System.out.println("Bits counted with number 1234: " + countBits(1234));
        System.out.println("Bits counted with number 4: " + countBits(4));
        System.out.println("Bits counted with number 9: " + countBits(9));
        System.out.println("Bits counted with number 7: " + countBits(7));
        System.out.println("Bits counted with number 10: " + countBits(10));

        // Attempt to count bits for a negative number, which should throw an exception
        System.out.println("Bits counted with number -1: " + countBits(-1)); // This line will throw an IllegalArgumentException

        // Print a message to indicate the completion of the test
        System.out.println("Test over");
    }
}
