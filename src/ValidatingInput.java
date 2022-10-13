public class ValidatingInput {
    public static void main(String[] args) {

        // Consider this simple program that prompts the user for a number and computes its logarithm:
        // Scanner in = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // double x = in.nextDouble();
        // double y = Math.log(x);
        // System.out.println("The log is " + y);

        // In Java, if you ask for Math.log(-1), it returns NaN, which stands for "not a number".
        // We can check for this condition and print an appropriate message:
        // if (x > 0) {
        // double y = Math.log(x);
            // System.out.println("The log is " + y);
        // } else {
            // System.out.println("The log is undefined");
        // }

        // The Scanner class provides hasNextDouble, which checks wheter the next input can be interpreted as a double.
        // If not, we can display an error message:
        // if (!in.hasNextDouble()) {
            // String word = in.next();
            // System.err.println(word + "is not a number");
        // }
    }
}
