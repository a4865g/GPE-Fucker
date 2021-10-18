import java.util.*;
import java.math.*;

public class main{
	public static void main(String[] argv){
		Scanner sc=new Scanner(System.in);
		ArrayList<BigInteger> f=new ArrayList<BigInteger>();
		f.add(BigInteger.valueOf(1));
		f.add(BigInteger.valueOf(1));
		for(int i=2;i<=50;i++){
			f.add(f.get(i-1).add(f.get(i-2)));
		}
		
		while(sc.hasNext()){
			int n=sc.nextInt();
			if(n==0){
				break;
			}
			System.out.println(f.get(n));
		}
	}
}