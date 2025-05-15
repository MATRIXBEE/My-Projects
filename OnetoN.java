public class OnetoN {
    public static void main (String[] args) {
        int N = 10;
        Print(N);
    }

    public static void Print(int N) {
        if (N == 0)
            return;
        Print(N - 1);
        System.out.println(N);
    }
}
