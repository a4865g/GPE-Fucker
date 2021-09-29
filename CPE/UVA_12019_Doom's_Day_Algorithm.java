import java.util.*;

public class main{
	public static void main(String[] argvs){
		Scanner sc=new Scanner(System.in);
		int[] month={31,28,31,30,31,30,31,31,30,31,30,31};
		String[] week={"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"}; // 1/1 is Saturday
		int cases=sc.nextInt();
		for(int i=0;i<cases;i++){
			int M=sc.nextInt();
			int D=sc.nextInt();
			D=D-1; //index=0
			for(int j=1;j<M;j++){
				D=D+month[j-1];
			}
			System.out.println(week[D%7]);
		}
	}
}