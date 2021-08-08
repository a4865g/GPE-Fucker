import java.math.BigInteger;
import java.util.*;

/*
10500:Brick Wall Patterns
correct(1.00)
 */

public class Brick_Wall_Patterns {
    static ArrayList<BigInteger> f=new ArrayList<BigInteger>();
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        BigInteger x=new BigInteger("1");
        BigInteger y=new BigInteger("2");
        Fibonacci(x,y,0,60); //if 50,make TLE. fuck u!
        int n;
        while(scanner.hasNext()){
            n=scanner.nextInt();
            if(n==0)break;
            System.out.println(f.get(n-1));
        }
//        scanner.close();
    }

    private static void Fibonacci(BigInteger x, BigInteger y, int cnt, int n) {
        f.add(x);
        if(cnt<n){
            Fibonacci(y,x.add(y),++cnt,n);
        }
    }
}
