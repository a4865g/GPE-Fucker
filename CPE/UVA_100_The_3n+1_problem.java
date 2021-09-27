import java.util.*;

public class main{
	public static void main(String[] argvs){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextInt()){
			int a=sc.nextInt();
			int b=sc.nextInt();
			int max=Math.max(a,b);
			int min=Math.min(a,b);
			int c=0;
			for(int i=min;i<=max;i++){
				int tmp=1;
				for(int j=i;j!=1;){
					if(j%2==1){
						j=3*j+1;
					}else{
						j/=2;
					}
					tmp++;
				}
				if(tmp>c){
					c=tmp;
				}
			}
			System.out.println(a+" "+b+" "+c);
		}
	}
}