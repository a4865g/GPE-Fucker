import java.util.*;
import java.math.*;

public class main{
	public static int GCD(int a,int b){
		while((a%=b)!=0&&(b%=a)!=0);
		return a+b;
	}
	public static void main(String[] argv){
		Scanner sc=new Scanner(System.in);
		int x;
		while((x=sc.nextInt())!=0){
			int[] a=new int[1005];
			int N=1;
			a[0]=x;
			while((x=sc.nextInt())!=0){
				a[N]=x;
				N++;
			}
			N=N-1; //notice!!
			int d=Math.abs(a[0]-a[1]);
			for(int i=1;i<N;i++){
				d=GCD(d,Math.abs(a[i]-a[i+1]));
			}
			System.out.println(d);
		}
	}
}