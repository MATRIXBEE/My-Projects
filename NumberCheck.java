public class NumberCheck {
    public static void checkOddOrEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is Even.");
        } else {
            System.out.println(number + " is Odd.");
        }
    }

    // Main method to test the function
    public static void main(String[] args) {
        checkOddOrEven(5);  // Output: 5 is Odd.
        checkOddOrEven(10); // Output: 10 is Even.
    }
}