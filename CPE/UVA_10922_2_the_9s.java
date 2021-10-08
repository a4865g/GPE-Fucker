import java.util.*;

public class main{
	public static void main(String[] argv){
		Scanner sc=new Scanner(System.in);
		
		while(sc.hasNext()){
			String in=sc.next();
			if(in.equals("0")){
				break;
			}
			
			/*
			 cnt ? degree
			 ex 999 degree=2
			 1.  9+9+9=27
			 2.  2+7=9
			*/
			int cnt=0;
			String tmp=in;
			while(true){
				int total=0;
				for(int i=0;i<tmp.length();i++){
					total+=tmp.charAt(i)-'0';
				}
				if(total%9==0){
					cnt++;
					if(total==9){
						break;
					}else{
						tmp=String.valueOf(total);
					}
				}else{
					break;
				}
			}
			
			if(cnt==0){
				System.out.println(in+" is not a multiple of 9.");
			}else{
				System.out.println(in+" is a multiple of 9 and has 9-degree "+cnt+".");
			}
		}
	}
}