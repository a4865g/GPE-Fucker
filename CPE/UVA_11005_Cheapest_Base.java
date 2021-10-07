import java.util.*;

public class main{
	public static void main(String[] argv){
		Scanner sc=new Scanner(System.in);
		int case_cnt=sc.nextInt();
		for(int i=0;i<case_cnt;i++){
			System.out.println("Case "+(i+1)+":");
			
			int[] numMoney=new int[36];
			for(int j=0;j<36;j++){
				numMoney[j]=sc.nextInt();
			}
			
			int handle_cnt=sc.nextInt();
			for(int j=0;j<handle_cnt;j++){
				int handle=sc.nextInt();
				int min=Integer.MAX_VALUE;
				int[] total=new int[37];
				
				for(int k=2;k<37;k++){
					int tmp=handle;
					while(tmp>0){
						int ttmp=tmp%k;
						tmp/=k;
						total[k]+=numMoney[ttmp];
					}
					if(total[k]<min){
						min=total[k];
					}
				}
				
				System.out.print("Cheapest base(s) for number "+handle+":");
				for(int k=2;k<37;k++){
					if(total[k]==min){
						System.out.print(" "+k);
					}
				}
				System.out.println("");
			}
			
			if(i!=(case_cnt-1)){
				System.out.println("");
			}
		}
		
	}

}