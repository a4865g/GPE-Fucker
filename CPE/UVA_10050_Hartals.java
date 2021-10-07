import java.util.*;

public class main{
	public static void main(String[] argv){
		Scanner sc=new Scanner(System.in);
		int case_cnt=sc.nextInt();
		while((case_cnt--)>0){
			int N=sc.nextInt();
			int i=sc.nextInt();
			int[] h=new int[i];
			for(int j=0;j<i;j++){
				h[j]=sc.nextInt();
			}
			
			int ans=0;
			for(int j=1;j<N+1;j++){
				if(j%7!=6&&j%7!=0){
					for(int k=0;k<i;k++){
						if(j%h[k]==0){
							ans++;
							break;
						}
					}
				}
			
			}
			System.out.println(ans);
			
		}
	}

}