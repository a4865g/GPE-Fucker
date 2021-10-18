import java.util.*;
 
public class main{
	public static void main(String[] argv){
 		Scanner sc=new Scanner(System.in);
 		int m=sc.nextInt();
 		int n=sc.nextInt();
 		HashMap<String,Integer> hm=new HashMap<String,Integer>();
 		for(int i=0;i<m;i++){
 			hm.put(sc.next(),sc.nextInt());
 		}
 		int sum=0;
 		String str;
 		for(int i=0;i<n;i++){
 			sum=0;
 			str=sc.next();
 			while(!str.equals(".")){
 				str=sc.next();
 				if(hm.containsKey(str)){
 					sum+=hm.get(str);
 				}
 			}
 			System.out.println(sum);
 		}
 	}
}