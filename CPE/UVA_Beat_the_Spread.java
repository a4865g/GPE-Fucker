import java.util.*;

public class main{
	public static void main(String[] argv){
		Scanner sc=new Scanner(System.in);
		int case_cnt=sc.nextInt();
		for(int i=0;i<case_cnt;i++){
			long s=sc.nextLong();
			long d=sc.nextLong();
			long x=s+d;
			long y=s-d;
			if(x<0||y<0||x%2!=0||y%2!=0){
				System.out.println("impossible");
			}else{
				System.out.println((x/2)+" "+(y/2));
			}
		}
	
	}

}