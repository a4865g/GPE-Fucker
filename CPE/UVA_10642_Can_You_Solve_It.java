import java.util.*;

public class main{
	public static void main(String[] argv){
		Scanner sc=new Scanner(System.in);
		
		int case_cnt=sc.nextInt();
		for(int i=0;i<case_cnt;i++){
			int x1=sc.nextInt();
			int y1=sc.nextInt();
			int x2=sc.nextInt();
			int y2=sc.nextInt();
			
			long ans=0;
			for(int j=0;j<(x1+y1);j++){
				ans=ans-j-1;
			}
			ans-=x1;
			
			for(int j=0;j<(x2+y2);j++){
				ans=ans+j+1;
			}
			ans+=x2;
			
			System.out.println("Case "+(i+1)+": "+ans);
		}
	}
}