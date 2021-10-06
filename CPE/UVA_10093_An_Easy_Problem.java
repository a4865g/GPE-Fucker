import java.util.*;

public class main{
	public static void main(String[] argv){
		Scanner sc=new Scanner(System.in);
		String st;
		
		while(sc.hasNextLine()){
			st=sc.nextLine();
			char[] Ctmp=st.toCharArray();
			int sum=0;
			int max=1; //notice!!
			for(char tmp:Ctmp){
				int R=0;
				if(tmp>='0'&&tmp<='9'){
					R=tmp-'0';
				}else if(tmp>='A'&&tmp<='Z'){
					R=tmp-'A'+10;
				}else if(tmp>='a'&&tmp<='z'){
					R=tmp-'a'+36;
				}
				sum+=R;
				if(R>max)max=R;
			}
			
			for(int i=max;i<=62;i++){
				if(i==62){
					System.out.println("such number is impossible!");
					break;
				}
				if(sum%i==0){
					System.out.println(i+1);
					break;
				}
			}
		}
	}
}