import java.math.BigInteger;
import java.util.Scanner;

/*
11130:The Priest Mathematician
correct(1.00)
 */

public class The_Priest_Mathematician {
    public static void main(String[] argv){
        BigInteger f[]=new BigInteger[10010];
        f[0]=BigInteger.valueOf(0);
        f[1]=BigInteger.valueOf(1);
        int i=2;
        int cnt=1;
        while (i<=10000){
            BigInteger add=BigInteger.valueOf(1).shiftLeft(cnt);
            for (int j=0;j<cnt+1&&i<=10000;j++){
                f[i]=f[i-1].add(add);
                i++;
            }
            cnt++;
        }
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int n=scanner.nextInt();
            System.out.println(f[n]);
        }
    }
}
