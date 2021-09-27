import java.util.*;

public class main{
	public static void main(String[] argvs){
		Scanner sc=new Scanner(System.in);
		int cnt=sc.nextInt();
		String country[]=new String[cnt];
		Set<String> set=new HashSet<String>();
		
		for(int i=0;i<cnt;i++){
			country[i]=sc.next();
			set.add(country[i]);
			String no=sc.nextLine();
		}
		
		String st[]=set.toArray(new String[set.size()]);
		Arrays.sort(country);
		Arrays.sort(st);
		
		for(int i=0;i<st.length;i++){
			int cnt_num=0;
			for(int j=0;j<cnt;j++){
				if(st[i].equals(country[j])) cnt_num++;
			}
			System.out.println(st[i]+" "+cnt_num);
		}
		
	}

}