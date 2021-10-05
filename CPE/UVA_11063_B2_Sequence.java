import java.util.*;

public class main{
	public static void main(String[] argv){
		Scanner sc=new Scanner(System.in);
		int cnt=1;
		while(sc.hasNextInt()){
			int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
			}
			
			boolean flag=true;
			if(arr[0]<1){
				flag=false;
			}
			for(int i=1;i<n;i++){
				if(arr[i-1]>arr[i]){
					flag=false;
				}
			}
			
			Vector<Integer> vector=new Vector<Integer>();
			for(int i=0;i<n;i++){
				if(!flag) break;
				
				for(int j=i;j<n;j++){
					int tmp=arr[i]+arr[j];
					Iterator<Integer> iterator=vector.iterator();
					while(iterator.hasNext()){
						if(iterator.next()==tmp) flag=false;
					}
					if(flag){
						vector.add(tmp);
					}else{
						break;
					}
				}
			}
			
			if(flag){
				System.out.println("Case #"+cnt+": It is a B2-Sequence.");
			}else{
				System.out.println("Case #"+cnt+": It is not a B2-Sequence.");
			}
			System.out.println("");
			cnt++;
			
		}
	
	}
}