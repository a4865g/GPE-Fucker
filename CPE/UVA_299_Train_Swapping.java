import java.util.*;

public class main{
	public static void main(String[] argvs){
		Scanner sc=new Scanner(System.in);
		int case_cnt=sc.nextInt();
		while((case_cnt--)>=0){
			int arr_cnt=sc.nextInt();
			int[] arr=new int[arr_cnt];
			for(int i=0;i<arr_cnt;i++){
				arr[i]=sc.nextInt();
			}
			
			int cnt=0;
			for(int i=0;i<arr_cnt-1;i++){
				for(int k=0;k<arr_cnt-1-i;k++){
					if(arr[k]>arr[k+1]){
						int tmp=arr[k];
						arr[k]=arr[k+1];
						arr[k+1]=tmp;
						cnt++;
					}
				}
			}
			
			System.out.println("Optimal train swapping takes "+cnt+" swaps.");
		}
	}
}