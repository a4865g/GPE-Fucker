import java.util.*;

public class main{
	public static void main(String[] argv){
		Scanner sc=new Scanner(System.in);
		
		int cases=Integer.parseInt(sc.next());
		
		for(int i=0;i<cases;i++){
			String tmp=sc.next(); //N
			tmp=sc.next(); //=
			int n=Integer.parseInt(sc.next());
			int size=n*n;
			long[] arr=new long[size];
			
			for(int j=0;j<size;j++){
				arr[j]=Long.parseLong(sc.next());
			}
			
			boolean flag=true;
			for(int j=0;j<size;j++){
				if(arr[j]<0||arr[j]!=arr[size-j-1]){
					flag=false;
					break;
				}
			}
			
			if(flag){
				System.out.println("Test #"+(i+1)+": Symmetric.");
			}else{
				System.out.println("Test #"+(i+1)+": Non-symmetric.");
			
			}
			
		}
	}
}