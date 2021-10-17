import java.util.*;
public class main{
	public static void main(String[] argv){
		Scanner sc=new Scanner(System.in);
		
		while(true){
			int n=sc.nextInt();
			if(n==0)break;
			int[] x=new int[2*n];
			int[] y=new int[2*n];
			for(int i=0;i<2*n;i++){
				x[i]=sc.nextInt();
				y[i]=sc.nextInt();
			}
			
			boolean flag=true;
			for(int A=-500;flag&&A<=500;A++){
				for(int B=-500;flag&&B<=500;B++){
					int l=0,r=0;
					for(int i=0;i<2*n;i++){
						if(A*x[i]+B*y[i]>0){
							l++;
						}else if(A*x[i]+B*y[i]<0){
							r++;
						}
					}
					if(l==n&&r==n){
						System.out.println(A+" "+B);
						flag=false;
					}
				}
			}
			
		}
	}
}