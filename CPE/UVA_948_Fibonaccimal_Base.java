import java.util.*;

public class main{
	public static void main(String[] argvs){
		Scanner sc=new Scanner(System.in);
		int case_cnt=sc.nextInt();
		int in=0;
		
		// create fib table
		// 1E about equal fib(43)
		int[] arr =new int[50];
		arr[0]=1;
		arr[1]=2;
		for(int i=2;i<43;i++){
			arr[i]=arr[i-2]+arr[i-1];
		}
		
		while(case_cnt-- > 0){
			in=sc.nextInt();
			System.out.print(in+" = ");
			
			int i=42;
			
			//find the close "in" num
			while(in<arr[i]){
				i--;
			}
			
			while(i>=0){
				if(in>=arr[i]){
					in-=arr[i];
					System.out.print("1");
				}else{
					System.out.print("0");
				}
				
				i--;
			}
			System.out.println(" (fib)");
		}
	}
}