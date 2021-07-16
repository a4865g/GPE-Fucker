import java.util.Scanner;
//
public class Power_Crisis {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N, m, count;
        int k[] = new int[100];

        while (sc.hasNext()) {
            N = sc.nextInt();
            if (N == 0)
                break;

            for (m = 1; m < 500; m++) {
                boolean OK = true;
                for (int q = 1; q < 100; q++)
                    k[q] = 0;

                int j = 1;
                count = 0;
                k[j] = 1;

                while (true) {
                    j++;
                    if (j > N) { //over N
                        j=1;
                    }
                    if (k[j] == 0) {
                        count++;
                        if (count == m) {
                            k[j] = 1;
                            count = 0;
                        }
                    }

                    if (k[13] == 1)
                        break;
                }

                for (int i = 1; i <= N; i++) {
                    if (k[i] == 0) {
                        OK = false;
                        break;
                    }
                }

                if (OK) {
                    System.out.println(m);
                    break;
                }
            }
        }
    }
}
