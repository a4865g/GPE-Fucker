import java.util.*;

public class main{
	public static void main(String[] argv){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			long a=sc.nextLong();
			long b=sc.nextLong();
			int time=0;
			int carry=0;
			if(a==0 &&b==0){
				break;
			}
			while(a!=0||b!=0){
				if(a%10+b%10+carry>=10){
					time++;
					carry=1;
				}else{
					carry=0;
				}
				a/=10;
				b/=10;
			}
			if(time==0){
				System.out.println("No carry operation.");
			}else{
				if(time==1){
					System.out.println("1 carry operation.");
				}else{
					System.out.println(time+" carry operations.");
				}
			}
		}
	}
}