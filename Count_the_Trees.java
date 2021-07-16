import java.math.BigInteger;
import java.util.Scanner;
// 10605:Count the Trees
public class Count_the_Trees {
    public static void main(String[] args) {
        BigInteger[] f = new BigInteger[301];
        BigInteger[] g = new BigInteger[301];
        f[1] = BigInteger.valueOf(1);
        g[1] = BigInteger.valueOf(1);
        for(int i = 2; i <= 300; i++) {
            f[i] = f[i-1].multiply(BigInteger.valueOf(4*i-2)).divide(BigInteger.valueOf(i+1));
            g[i] = g[i-1].multiply(BigInteger.valueOf(i));
        }

        Scanner cin = new Scanner(System.in);
        while(cin.hasNext()) {
            int n = cin.nextInt();
            if(n == 0)
                break;
            System.out.println(f[n].multiply(g[n]));
        }
    }
}
