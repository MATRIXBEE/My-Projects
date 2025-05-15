public class SumOfN {
    public static void main(String[] args) {
        int N = 10;
        System.out.println("Recursive Sum: " + sumRecursive(N));
    }

    public static int sumRecursive(int N) {
        if (N == 0)
            return 0;
        return N + sumRecursive(N - 1);
    }
}
