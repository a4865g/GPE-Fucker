import java.util.*;

public class main{
	public static void main(String[] argv){
		Scanner sc=new Scanner(System.in);
		int case_cnt=sc.nextInt();
		while(case_cnt-->0){
			int n=sc.nextInt();
			StringBuilder sb=new StringBuilder();
			if(n<2){
				sb.append(n);
			}
			for(int i=9;i>1&&n>1;--i){
				while(n%i==0){
					sb.append(i);
					n/=i;
				}
			}
			
			if(n>1){
				System.out.println("-1");
			}else{
				char[] s=sb.toString().toCharArray();
				Arrays.sort(s);
				for(int i=0;i<s.length;i++){
					System.out.print(s[i]);
				}
				System.out.println("");
			}
		}
	}
}