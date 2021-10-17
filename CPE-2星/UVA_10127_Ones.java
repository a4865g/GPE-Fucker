import java.util.*;

public class main{
	public static void main(String[] argv){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int n=sc.nextInt();
			int now=1;
			int ans=1;
			while(now!=0){
				if(n>now){
					ans++;
				}
				if(n>now){
					now=now*10+1;
				}else{
					now=now%n;
				}
			}
			System.out.println(ans);
		}
	}
}