import java.util.*;

public class main{
	public static void main(String[] argvs){
		Scanner sc= new Scanner(System.in);
		while(sc.hasNext()){
			String s=sc.next();
			if(s.equals("0")) break;
			
			int num=0;
			while(s.length()!=1){
				for(int i=0;i<s.length();i++){
					num=num+(s.charAt(i)-'0');
				}
				s=Integer.toString(num);
				num=0;
			}
			System.out.println(s);
		}
	
	}

}