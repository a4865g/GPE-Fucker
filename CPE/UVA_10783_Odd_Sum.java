import java.util.*;

public class main{
	public static void main(String[] argv){
		Scanner sc=new Scanner(System.in);
		int case_cnt=sc.nextInt();
		for(int i=0;i<case_cnt;i++){
			int l=sc.nextInt();
			int r=sc.nextInt();
			int cnt=0;
			for(int j=l;j<=r;j++){
				if(j%2==1){
					cnt+=j;
				}
			}
			System.out.println("Case "+(i+1)+": "+cnt);
		}
	}
}