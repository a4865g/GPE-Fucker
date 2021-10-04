import java.util.*;

public class main{
	public static void main(String[] argvs){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			long people=sc.nextLong();
			long day=sc.nextLong();
			long cnt=people;
			while(people<day){
				cnt++;
				people+=cnt;
			}
			System.out.println(cnt);
		}
	}
}