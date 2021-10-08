import java.util.*;

public class main{
	public static void main(String[] argv){
		Scanner sc=new Scanner(System.in);
		
		while(sc.hasNext()){
			String in=sc.next();
			String ni="";
			
			for(int i=in.length()-1;i>=0;i--){
				ni+=in.charAt(i);
			}
			int int_in=Integer.parseInt(in);
			int int_ni=Integer.parseInt(ni);
			if(isPrime(int_in)&&isPrime(int_ni)&&int_in!=int_ni){
				System.out.println(int_in+" is emirp.");
			}else if(isPrime(int_in)){
				System.out.println(int_in+" is prime.");
			}else{
				System.out.println(int_in+" is not prime.");
			}
		}
	}
	public static boolean isPrime(int in){
		boolean flag=true;
		for(int i=2;i<=in/2;i++){
			if(in%i==0){
				flag=false;
				break;
			}
		}
		return flag;
	}
}