import java.util.*;

public class main{
	public static void main(String[] argv){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextLong()){
			long a=sc.nextLong();
			long b=sc.nextLong();
			long x=0,y=1,pre_x=1,pre_y=0;
			while(b!=0){
				long q=a/b;
				
				long tmp=b;
				b=a%b;
				a=tmp;
				
				long next_x=pre_x-q*x;
				pre_x=x;
				x=next_x;
				
				long next_y=pre_y-q*y;
				pre_y=y;
				y=next_y;
			}
			System.out.println(pre_x+" "+pre_y+" "+a);
		}
	}
}