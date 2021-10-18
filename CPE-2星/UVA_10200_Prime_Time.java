import java.util.*;

public class main{
	public static void main(String[] argv){
		Scanner sc=new Scanner(System.in);
		boolean[] x=new boolean[10001];
		x[0]=true;
		int i=1;
		BigInteger max=new BigInteger("10001");
		BigInteger fortyone=new BigInteger("41");
		for(BigInteger a=BigInteger.ONE;i<10001;a.add(BigInteger.ONE),i++){
			if(a.pow(2).add(a).add(fortyone).isProbablePrime(1)){
				x[i]=true;
			}
		}
		
		while(sc.hasNext()){
			int A=sc.nextInt();
			int B=sc.nextInt();
			int c=0;
			for(int i=A;i<=B;i++){
				if(x[i]){
					c++;
				}
			}
			System.out.printf("%.2f\n\r",100.0*(float)(c)/(B-A+1));
		}
	}
}