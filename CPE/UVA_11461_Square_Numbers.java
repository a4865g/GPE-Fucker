import java.util.*;

public class main{
	public static void main(String[] argv){
		Scanner sc=new Scanner(System.in);
		int a=0;
		int b=0;
		while((a=sc.nextInt())!=0&&(b=sc.nextInt())!=0){
			int cnt=0;
			int i=(int)Math.sqrt(a);
			while((int)Math.pow(i,2)<=b){
				if((int)Math.pow(i,2)>=a){
					cnt++;
				}
				i++;
			}
			System.out.println(cnt);
		}
	
	}

}