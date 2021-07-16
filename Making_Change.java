import java.util.*;

import static java.lang.Math.min;

// 24931:Extend to Palindromes
//score:0.4

public class Making_Change {
    static int N=601;

    public static void main(String[] args){
        try{
            Scanner scanner=new Scanner(System.in);
            int[] coin={5,10,20,50,100,200};
            int have[]=new int[6];
            int dp[]=new int[N];
            int change[]=new int[201];
            for(int i=5;i<201;++i){
                int back=i;
                for (int k=5;k>=0 && back!=0;--k){
                    change[i]+=back/coin[k];
                    back%=coin[k];
                }
            }
            while (scanner.hasNext()){
                for(int i=0;i<6;i++){
                    have[i]=scanner.nextInt();
                }
                int sum=0;

                for(int i=0;i<6;++i){
                    sum+=coin[i]*have[i];
                }
                if(sum==0){
                    break;
                }
                int price;
                price=(int)(scanner.nextDouble()*100);
                for (int i=1;i<N;++i){
                    dp[i]=(int)1e9;
                }

                for (int i =0;i<6;++i){
                    for (int k=have[i];k!=0;--k){
                        for(int p=min(600,sum);p>=coin[i];--p){
                            int tmp=p-coin[i];
                            if(dp[tmp]<(int)1e9){
                                dp[p]=min(dp[tmp]+1,dp[p]);
                            }
                        }
                    }
                }
                int min=(int) 1e9;
                for (int p = min(600, sum); p >= price; --p)
                {
                    if (dp[p] < (int) 1e9)
                    {
                        if (p > price)
                            dp[p] += change[p - price];

                        if (dp[p] < min)
                            min = dp[p];
                    }
                }
                System.out.println("  "+min);
            }
        }catch (Exception e){

        }

    }
}
