public class Fourt {
    public static void main(String[] args) {
        int n = 4;
        int m = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 3; i >= m; i--) {
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// Output ->
// ____*
// ___**
// __***
// _****
// __***
// ___**
// ____*