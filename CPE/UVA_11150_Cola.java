import java.util.*;

public class main{
	public static void main(String[] argv){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextInt()){
			int in=sc.nextInt();
			System.out.println(in+in/2);
		}
	}
}