import java.util.*;

public class main{
	public static void main(String[] argv){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int case_cnt=sc.nextInt();
			int[] arr=new int[case_cnt];
			for(int i=0;i<case_cnt;i++){
				arr[i]=sc.nextInt();
			}
			Arrays.sort(arr);
			
			int mid=arr[case_cnt/2];
			int mid2=arr[(case_cnt-1)/2];
			
			int cnt=0;
			for(int i=0;i<case_cnt;i++){
				if(arr[i]==mid||arr[i]==mid2){
					cnt++;
				}
			}
			
			int d=mid-mid2+1;
			
			System.out.println(mid2+" "+cnt+" "+d);
		}
	}
}