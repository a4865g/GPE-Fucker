import java.util.*;

public class main{
	public static void main(String[] argv){
		Scanner sc=new Scanner(System.in);
		
		int num;
		while((num=sc.nextInt())!=0){
			String st="";
			while(true){
				if(num==1){
					st="1"+st;
					break;
				}
				st=(char)num%2+st;
				num/=2;
			}
			
			int cnt=0;
			for(int i=0;i<st.length();i++){
				if(st.charAt(i)=='1'){
					cnt++;
				}
			}
			
			System.out.println("The parity of "+st+" is "+cnt+" (mod 2).");
		}
	}
}

/*
¥t¸Ñ
import java.util.*;

public class main{
	public static void main(String[] argv){
		Scanner sc=new Scanner(System.in);
		
		int num;
		while(sc.hasNext() && (num=sc.nextInt())!=0){
			String st=Integer.toBinaryString(num);
			
			int count=0;
			for(int i=0;i<st.length();i++){
				if(st.charAt(i)=='1') count++;
			}
			
			System.out.println("The parity of "+st+" is "+count+" (mod 2).");
		}
	}
}
*/