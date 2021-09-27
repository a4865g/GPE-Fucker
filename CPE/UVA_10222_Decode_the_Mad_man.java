import java.util.*;

public class main{
	public static void main(String[] argvs){
		Scanner sc=new Scanner(System.in);
		String table="`1234567890-=qwertyuiop[]asdfghjkl;'zxcvbnm,./";
		while(sc.hasNextLine()){
			String s=sc.nextLine().toLowerCase();
			for(int i=0;i<s.length();i++){
				if(s.charAt(i)==' '){
					System.out.print(" ");
				}else{
					for(int j=0;j<table.length();j++){
						if(table.charAt(j)==s.charAt(i)){
							if(j-2>=0){
								System.out.print(table.charAt(j-2));
							}else{
								System.out.print(table.charAt(j));
							}
							break;
						}
					}
				}
			}
			System.out.println("");
		}
	}

}