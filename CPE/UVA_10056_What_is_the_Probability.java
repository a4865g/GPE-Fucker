import java.util.*;

/*
算機率==
n筆測資 幾個人玩 每人贏的機率 求第k位贏

Round_1：
第一個人獲勝的機率：p
第二個人獲勝的機率：q*p
第三個人獲勝的機率：(q^2)*p
第k個人獲勝的機率：(q^(k-1))*p
Round_2：
第一個人獲勝的機率：(q^n)*p
第二個人獲勝的機率：(q^n)*q*p
第三個人獲勝的機率：(q^n)*(q^2)*p
第k個人獲勝的機率：(q^n)*(q^(k-1))*p
Round_R：
第一個人獲勝的機率：(q^(R-1)*n)*p
第二個人獲勝的機率：(q^(R-1)*n)*q*p
第三個人獲勝的機率：(q^(R-1)*n)*(q^2)*p
第k個人獲勝的機率：(q^(R-1)*n)*(q^(k-1))*p

使用等比級數整理每個回合獲勝的機率可以得此：(q^(k-1)*p) * (1-(q^n^R)) / (1-q^n)
(首項：(q^(k-1)*p)、公比：q^n)
*/

public class main{
	public static void main(String[] argvs){
		Scanner sc=new Scanner(System.in);
		
		int cnt=sc.nextInt();
		int R=50;
		
		while(cnt>0){
			int n=sc.nextInt();
			double p=sc.nextDouble();
			double q=1-p;
			int k=sc.nextInt();
			
			double a=Math.pow(q,k-1)*p;
			double r=Math.pow(q,n);
			
			if(p==0){
				System.out.println("0.0000");
			}else{
				System.out.printf("%.4f\r\n",a*(1-Math.pow(r,R))/(1-r));
			}
			
			cnt--;
		}
	}
}