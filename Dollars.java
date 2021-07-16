import java.text.DecimalFormat;
import java.util.*;
//22181:Dollars
public class Dollars {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int money[]={10000,5000,2000,1000,500,200,100,50,20,10,5};
        int part1,part2;
        long dp[]=new long[30005];
        for (int i=0;i<30005;i++){
            dp[i]=1;
        }
        for(int i=0;i<10;i++){
            for (int j=money[i];j<=30000;j++){
                dp[j]+=dp[j-money[i]];
            }
        }
//        for (int i=0;i<30005;i++){
////            dp[i]=1;
//            System.out.println(dp[i]);
//        }
        while (scanner.hasNext()){
            double input=scanner.nextDouble();
            int price=(int)(input*100);
            if(price==0)
                break;
            System.out.printf("%6.2f"+"%17d\n",input,dp[price]);
        }
    }
}
