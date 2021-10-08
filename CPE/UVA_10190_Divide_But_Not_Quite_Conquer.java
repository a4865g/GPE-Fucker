import java.util.*;

public class main{
	public static void main(String[] argv){
		Scanner sc=new Scanner(System.in);
		
		while(sc.hasNextLong()){
			long n=sc.nextLong();
			long m=sc.nextLong();
			
			List list=new ArrayList();
			
			long tmp=1;
			while(m>1&&n>=m&&tmp<=n){
				list.add(tmp);
				tmp*=m;
			}
			//Notice!! Long change to long
			if((!list.isEmpty()) && (long)list.get(list.size()-1)==n){
				for(int i=list.size()-1;i>=0;i--){
					if(i!=0){
						System.out.print(list.get(i)+" ");
					}else{
						System.out.print(list.get(i));
					}
				}
				System.out.println("");
			}else{
				System.out.println("Boring!");
			}
			
		}
	}
}