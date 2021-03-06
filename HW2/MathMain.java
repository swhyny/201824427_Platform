import java.util.Scanner;
public class MathMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int begin,end;
        System.out.print("Enter a begin number: ");
        begin = sc.nextInt();
        System.out.print("Enter an end number: ");
        end = sc.nextInt();
        sc.close();
        long sum = getSumBetween(begin, end);
        System.out.printf("Sum between %d and %d : %,d%n", begin, end, sum);
        long product = getProductBetween(begin, end);
        System.out.printf("Product between %d and %d : %,d%n", begin, end, product);
    }
    private static long getSumBetween(final int begin, final int end) {
        int res = 0;
        for (int x = begin; x <= end; x++) {
            res = res + x;
        }
        return res;
    }
    private static long getProductBetween(final int begin, final int end) {
        int res = 1;
        for (int i = begin; i <= end; i++) {
            res = res * i;
        }
        return res;
    }
}
