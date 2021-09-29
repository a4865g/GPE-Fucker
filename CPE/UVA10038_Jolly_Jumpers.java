import java.util.*;

public class main{
	public static void main(String[] argvs){
		Scanner sc=new Scanner(System.in);
		
		while(sc.hasNext()){
			int cnt=sc.nextInt();
			int[] num=new int[cnt];
			for(int i=0;i<cnt;i++){
				num[i]=sc.nextInt();
			}
			
			boolean flag=true;
			
			if(cnt!=1){
				int[] abs=new int[cnt-1];
				for(int i=0;i<cnt-1;i++){
					abs[i]=Math.abs(num[i]-num[i+1]);
				}
				
				Arrays.sort(abs);
				for(int i=0;i<cnt-1;i++){
					if(abs[i]!=i+1){
						flag=false;
						break;
					}
				}
			}
			if(flag==true){
				System.out.println("Jolly");
			}else{
				System.out.println("Not jolly");
			}
			
		}
	}

}