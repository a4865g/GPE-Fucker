import java.util.*;

class main{
	public static void main(String[] argvs){
		Scanner sc=new Scanner(System.in);
		
		while(sc.hasNextLong()){
			long a=sc.nextLong();
			long b=sc.nextLong();
			System.out.println(Math.abs(a-b));
		}
	}
}