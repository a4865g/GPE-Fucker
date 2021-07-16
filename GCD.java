import java.net.HttpURLConnection;
import java.util.*;
// 11076:GCD

public class GCD {
    public static void main(String[] args) {
        int n=0;
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            n=scanner.nextInt();
            if(n==0)
                break;
            int G=0;
            for(int i=1;i<n;i++){
                for(int j=i+1;j<=n;j++){
                    G+= gcd(i,j);
                }
            }
            System.out.println(G);
        }
    }

    private static int gcd(int i, int j) {
        while((i%=j)!=0&&(j%=i)!=0);
        return i+j;
    }
}
