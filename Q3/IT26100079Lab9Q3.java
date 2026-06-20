public class IT26100079Lab9Q3 {

    // Method to add two integers
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    // Method to multiply two integers
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    // Method to square an integer
    public static int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        
        // Expression i: (3 * 4 + 5 * 7)^2
        int prod1 = multiply(3, 4);      // 12
        int prod2 = multiply(5, 7);      // 35
        int sum1 = add(prod1, prod2);    // 12 + 35 = 47
        int result1 = square(sum1);      // 47^2 = 2209

        // Expression ii: (4 + 7)^2 + (8 + 3)^2
        int sumA = add(4, 7);            // 11
        int sqA = square(sumA);          // 11^2 = 121
        
        int sumB = add(8, 3);            // 11
        int sqB = square(sumB);          // 11^2 = 121
        
        int result2 = add(sqA, sqB);     // 121 + 121 = 242

        // Display results matching the expected output format
        System.out.println("Result of (3 * 4 + 5 * 7)^2      : " + result1);
        System.out.println("Result of (4 + 7)^2 + (8 + 3)^2  : " + result2);
    }
}