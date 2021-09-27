import java.util.*;

public class main{
	public static void main(String[] argvs){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			String in=sc.next();
			if(in.equals("0"))break;
			int odd=0;
			int even=0;
			for(int i=0;i<in.length();i++){
				if(i%2==0)
					even+=in.charAt(i)-'0';
				else
					odd+=in.charAt(i)-'0';
			}
			if((odd-even)%11==0){
				System.out.println(in+" is a multiple of 11.");
			}else{
				System.out.println(in+" is not a multiple of 11.");
			}
		}
	}
}