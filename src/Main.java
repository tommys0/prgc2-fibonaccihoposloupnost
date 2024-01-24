public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 514; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }


    private static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        long predchozi = 0;
        long soucasny = 1;

        for (int i = 2; i <= n; i++) {
            long dalsi = predchozi + soucasny;
            predchozi = soucasny;
            soucasny = dalsi;
        }

        return soucasny;
    }
}
