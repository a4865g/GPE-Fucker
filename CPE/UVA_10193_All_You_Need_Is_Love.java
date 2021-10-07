import java.util.*;

public class main{
	public static void main(String[] argv){
		Scanner sc=new Scanner(System.in);
		
		int case_cnt=sc.nextInt();
		
		for(int i=1;i<=case_cnt;i++){
			int a=Integer.parseInt(sc.next(),2);
			int b=Integer.parseInt(sc.next(),2);
			if(gcd(a,b)==1){
				System.out.println("Pair #"+i+": Love is not all you need!");
			}else{
				System.out.println("Pair #"+i+": All you need is love!");
			}
		}
	}
	
	public static int gcd(int a,int b){
		while((a%=b)!=0&&(b%=a)!=0);
		return a+b;
	}
}