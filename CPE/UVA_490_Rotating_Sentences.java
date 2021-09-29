import java.util.*;

public class main{
	public static void main(String[] argvs){
		Scanner sc=new Scanner(System.in);
		Vector<String> vector=new Vector<String>();
		int line=0; //有幾行輸入
		int maxLength=0;
		while(sc.hasNextLine()){
			String st=sc.nextLine();
			if(st.length()>maxLength)maxLength=st.length();
			vector.add(st);
			line++;
		}
		int cnt=0; //算空白個數
		line--;
		for(int i=0;i<maxLength;i++){
			cnt=0;
			for(int j=line;j>=0;j--){
				if(i<vector.get(j).length()){
					while(cnt>0){
						System.out.print(" ");
						cnt--;
					}
					System.out.print(vector.get(j).charAt(i));
					cnt=0;
				}else{
					cnt++;
				}
			}
			System.out.println("");
		}
	}

}