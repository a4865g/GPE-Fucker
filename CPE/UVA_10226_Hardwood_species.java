import java.util.*;

public class main{
	public static void main(String[] argv){
		Scanner sc=new Scanner(System.in);
		int case_cnt=sc.nextInt();
		while(sc.hasNextLine()){
			TreeMap<String,Integer> map=new TreeMap<String,Integer>();
			
			String st;
			int cnt=0;
			while(sc.hasNextLine()&&!(st=sc.nextLine()).equals("")){
				if(map.containsKey(st)){
					map.put(st,map.get(st)+1);
				}else{
					map.put(st,1);
				}
				cnt++;
			}
			
			for(Object key:map.keySet()){
				System.out.printf("%s %.4f",key.toString(),map.get(key)*100.0/cnt);
				System.out.println("");
			}
			if(map.size()!=0&&(--case_cnt)>0){
				System.out.println("");
			}
		}
	}
}