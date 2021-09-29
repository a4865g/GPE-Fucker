import java.util.*;

public class main{
	public static void main(String[] argvs){
		Scanner sc=new Scanner(System.in);
		int cnt=0;
		while(sc.hasNextLine()){
			String string=sc.nextLine();
			
			for(int i=0;i<string.length();i++){
				if(string.charAt(i)=='"'&&cnt%2==0){
					System.out.print("``");
					cnt++;
				}else if(string.charAt(i)=='"'&&cnt%2==1){
					System.out.print("''");
					cnt++;
				}else{
					System.out.print(string.charAt(i));
				}
			}
			System.out.println("");
		}
	}

}