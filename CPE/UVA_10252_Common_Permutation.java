import java.util.*;

public class main{
	public static void main(String[] argvs){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextLine()){
			String a=sc.nextLine();
			String b=sc.nextLine();
			int[] table_a=new int[26];
			int[] table_b=new int[26];
			Arrays.fill(table_a,0);
			Arrays.fill(table_b,0);
			for(int i=0;i<a.length();i++){
				char ch=a.charAt(i);
				if('a'<=ch&&ch<='z')table_a[ch-'a']++;
			}
			for(int i=0;i<b.length();i++){
				char ch=b.charAt(i);
				if('a'<=ch&&ch<='z')table_b[ch-'a']++;
			}
			
			for(int i=0;i<26;i++){
				int min=Math.min(table_a[i],table_b[i]);
				for(int j=0;j<min;j++){
					System.out.print(((char)(i+'a')));
				}
			}
			
			System.out.println("");
		}
	
	}

}