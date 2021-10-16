import java.util.*;

public class main{
	public static void main(String[] argv){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int N=sc.nextInt();
			if(N==0){
				break;
			}
			int[] k=new int[100];
			for(int m=1;m<500;m++){
				for(int i=1;i<=N;i++){
					k[i]=0;
				}
				boolean OK=true;
				int j=1;
				k[j]=1;
				int cnt=0;
				while(true){
					j++;
					if(j>N){
						j=1;
					}
					if(k[j]==0){
						cnt++;
						if(cnt==m){
							k[j]=1;
							cnt=0;
						}
					}
					
					if(k[13]==1){
						break;
					}
				}
				
				for(int i=1;i<=N;i++){
					if(k[i]==0){
						OK=false;
						break;
					}
				}
				if(OK){
					System.out.println(m);
                    break;
				}
			}
			
		}
	}
}