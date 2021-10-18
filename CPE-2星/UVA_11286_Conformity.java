import java.util.*;

public class main{
	public static void main(String[] argv){
		Scanner sc=new Scanner(System.in);
		while(true){
			int n=sc.nextInt();
			if(n==0){
				break;
			}
			long[] abc=new long[n];
			for(int i=0;i<n;i++){
				int[] a=new int[5];
				for(int j=0;j<5;j++){
					a[j]=sc.nextInt();
				}
				Arrays.sort(a);
				long c=0;
				for(int j=0;j<5;j++){
					c=c*1000+a[j];
				}
				abc[i]=c;
			}
			Arrays.sort(abc);
			long cur=abc[0];
			int cnt=1;
			int max_cnt=0;
			int ans=0;
			for(int i=1;i<n;i++){
				if(cur==abc[i]){
					cnt++;
				}else{
					cur=abc[i];
					if(max_cnt==cnt){
						ans+=cnt;
					}else if(max_cnt<cnt){
						ans=cnt;
						max_cnt=cnt;
					}
					cnt=1;
				}
			}
			
			if(max_cnt==cnt){
				ans+=cnt;
			}else if(max_cnt<cnt){
				ans=cnt;
			}
			System.out.println(ans);
		}
	}
}