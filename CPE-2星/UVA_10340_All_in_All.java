import java.util.*;

public class main{
	public static void main(String[] argv){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			String s1=sc.next();
			String s2=sc.next();
			int j=0;
			for(int i=0;i<s2.length();i++){
				if(s1.charAt(j)==s2.charAt(i)){
					j++;
					if(j==s1.length()){
						break;
					}
				}
			}
			if(j==s1.length()){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}
	}
}