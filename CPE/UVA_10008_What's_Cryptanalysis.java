import java.util.*;

public class main{
	public static void main(String[] argvs){
		Scanner sc=new Scanner(System.in);
		int[] cnt=new int[26];
		int max=0;
		int n=sc.nextInt();
		sc.nextLine(); //notice!!
		for(int i=0;i<n;i++){
			String s=sc.nextLine().toUpperCase();
			for(int j=0;j<s.length();j++){
				char c=s.charAt(j);
				if('A'<=c && c<= 'Z'){
					cnt[c-'A']++;
					if(cnt[c-'A']>max){
						max=cnt[c-'A'];
					}
				}
			}
		}
		
		for(int i=max;i>0;i--){
			for(int j=0;j<26;j++){
				if(cnt[j]==i){
					System.out.println(((char)(j+'A'))+" "+i);
				}
			}
		}
	
	}

}