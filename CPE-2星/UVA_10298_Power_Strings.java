import java.util.*;

public class main{
	public static void main(String[] argv){
		Scanner sc=new Scanner(System.in);
		
		while(sc.hasNext()){
			String str=sc.next();
			if(str.equals(".")){
				break;
			}
			
			String a="";
			for(int i=0;i<str.length();i++){
				a+=str.charAt(i);
				if(str.length()%a.length()!=0){
					continue;
				}
				
				boolean flag=true;
				for(int j=0;j<str.length();j+=a.length()){
					if(!str.substring(j,j+a.length()).equals(a)){
						flag=false;
						break;
					}
				}
				
				if(flag){
					break;
				}
			}
			System.out.println(str.length()/a.length());
		}
	}
}