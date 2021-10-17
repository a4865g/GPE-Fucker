import java.util.*;
import java.math.*;

public class main{
	public static void main(String[] argv){
		Scanner sc=new Scanner(System.in);
		BigInteger[] fact=new BigInteger[1005];
		fact[0]=BigInteger.ONE;
		for(int i=1;i<=1000;i++){
			fact[i]=fact[i-1].multiply(BigInteger.valueOf(i));
		}
		
		while(sc.hasNext()){
			int n=sc.nextInt();
			
			String str=fact[n].toString();
			
			int ans=0;
			for(int i=0;i<str.length();i++){
				ans+=str.charAt(i)-'0';
			}
			
			System.out.println(ans);
		}
	}
}