import java.util.*;

public class main{
	public static void main(String[] argv){
		Scanner sc=new Scanner(System.in);
		
		while(sc.hasNextLine()){
			long x=Long.parseLong(sc.nextLine());
			String an[]=sc.nextLine().split("\\s+");
			
			long ans=0;
			long xp=1;
			for(int i=an.length-2;i>=0;i--,xp*=x){
				ans+=Long.parseLong(an[i])*(an.length-1-i)*xp;
			}
			
			System.out.println(ans);
		}
	}
}