import java.util.*;
import java.math.*;

public class main{
	public static void main(String[] argv){
		Scanner sc=new Scanner(System.in);
		BigInteger[] f=new BigInteger[5001];
		f[1]=BigInteger.valueOf(1);
		f[2]=BigInteger.valueOf(1);
		for(int i=3;i<=5000;i++){
			f[i]=f[i-1].add(f[i-2]);
		}
		while(sc.hasNext()){
			int n=sc.nextInt();
			System.out.println("The Fibonacci number for "+n+" is "+f[n]);
		}
	}
}