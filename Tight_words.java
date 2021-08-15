import java.util.*;
/*
10637:Tight words
correct(1.00)
 */
public class Tight_words {
    static double[][] dp=new double[101][10];
    public static void main(String[] argv){
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int k=scanner.nextInt();
            int n=scanner.nextInt();
            for(int i=0;i<=k;i++){
                dp[1][i]=1.0/(k+1);
            }
            for(int i=2;i<=n;i++){
                for(int j=0;j<=k;j++){
                    dp[i][j]=0.0;
                    for(int t=0;t<=k;t++){
                        if(Math.abs(t-j)>1)continue;
                        dp[i][j]+=dp[i-1][t]/(k+1);
                    }
                }
            }

            double sum=0.0;
            for(int i=0;i<=k;i++){
                sum+=dp[n][i];
            }
            System.out.printf("%.5f\n",100.0*sum);
        }
    }
}
