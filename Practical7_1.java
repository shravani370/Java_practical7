class Practical7_1 {

    static long factorialIterative(int n) {

        if (n < 0) {
            return -1;
        }

        long result = 1;

        for (int i = 2; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    static long factorialRecursive(int n) {

        if (n < 0) {
            return -1;
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {

        int number = 5;

        long iterativeResult = factorialIterative(number);
        long recursiveResult = factorialRecursive(number);

        System.out.println("Iterative: " + iterativeResult);
        System.out.println("Recursive: " + recursiveResult);
    }
}
