import java.util.*;

public class main{
	public static void main(String[] argv){
		Scanner sc=new Scanner(System.in);
		int case_cnt=sc.nextInt();
		
		while((case_cnt--)>0){
			int in=sc.nextInt();
			System.out.println(base10(in)+" "+base16(in));
		}
	}
	
	public static int base10(int in){
		int ans=0;
		while(in>0){
			if(in%2==1){
				ans++;
			}
			in/=2;
		}
		return ans;
	}
	
	public static int base16(int in){
		int ans=0;
		while(in>0){
			int tmp=in%10;
			while(tmp>0){
				if(tmp%2==1){
					ans++;
				}
				tmp/=2;
			}
			in/=10;
		}
		return ans;
	}
}