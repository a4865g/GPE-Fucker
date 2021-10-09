import java.util.*;

public class main{
	public static void main(String[] argv){
		int r=6440;
		
		Scanner sc=new Scanner(System.in);
		
		while(sc.hasNext()){
			int s=sc.nextInt();
			double a=sc.nextInt();
			String type=sc.next();
			
			if(type.equals("deg")){
				a=Math.min(360-a,a);
			}else{
				a/=60; // 1 min= 60 deg
			}
			
			double arc=2*(s+r)*Math.PI*(a/360);
			double chord=2*(r+s)*Math.cos((90-a/2)*Math.PI/180);
			System.out.printf("%.6f %.6f",arc,chord);
			System.out.println("");
		}
	}
}