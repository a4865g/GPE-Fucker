import java.util.*;
import java.math.*;

public class main{
	public static void main(String[] argv){
		Scanner sc=new Scanner(System.in);
		BigInteger mod=new BigInteger("131071");
		while(sc.hasNext()){
			String st=sc.nextLine();
			String in="";
			for(int i=0;i<st.length();i++){
				if(st.charAt(i)!='#'){
					in+=st.charAt(i);
				}else{
					break;
				}
			}
			
			BigInteger bin=new BigInteger(in,2);
			if(bin.mod(mod).equals(BigInteger.ZERO)){
				System.out.println("YES");
   			}else{
    			System.out.println("NO");
   			}
		}
	}
}