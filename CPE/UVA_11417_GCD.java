import java.util.*;

public class main{
	public static void main(String[] argv){
		Scanner sc=new Scanner(System.in);
		int in;
		while((in=sc.nextInt())!=0){
			int G=0;
			for(int i=1;i<in;i++){
				for(int j=i+1;j<=in;j++){
					G+=gcd(i,j);
				}
			}
			System.out.println(G);
		}
	}
	
	static int gcd(int a,int b){
		while((a%=b)!=0&&(b%=a)!=0);
		return a+b;
	}
	
}