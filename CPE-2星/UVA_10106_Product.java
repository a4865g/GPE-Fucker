import java.util.*;
import java.math.*;
public class main{
	public static void main(String[] argv){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			String n1=sc.next();
			String n2=sc.next();
			BigInteger bn1=new BigInteger(n1);
			BigInteger bn2=new BigInteger(n2);
			BigInteger ans=bn1.multiply(bn2);
			System.out.println(ans.toString());
		}
	}
}