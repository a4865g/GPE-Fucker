import java.util.*;

public class main{
	public static void main(String[] argv){
		Scanner sc=new Scanner(System.in);
		int field=0;
		while(sc.hasNext()){
			int row=sc.nextInt();
			int col=sc.nextInt();
			if(row==0&&col==0){
				break;
			}
			if(field!=0){
				System.out.println("");
			}
			char[][] arr=new char[row][col];
			
			for(int i=0;i<row;i++){
				String tmp=sc.next();
				for(int j=0;j<col;j++){
					arr[i][j]=tmp.charAt(j);
				}
			}
			System.out.println("Field #"+(++field)+":");
			for(int i=0;i<row;i++){
				for(int j=0;j<col;j++){
					if(arr[i][j]=='*'){
						System.out.print("*");
					}else{
						int ans=0;
						
						if(i-1>=0 && arr[i-1][j]=='*')ans++;
						if(i+1<row && arr[i+1][j]=='*')ans++;
						if(j-1>=0 && arr[i][j-1]=='*')ans++;
						if(j+1<col && arr[i][j+1]=='*')ans++;
						
						if(i-1>=0 && j-1>=0 && arr[i-1][j-1]=='*')ans++;
						if(i+1<row && j+1<col && arr[i+1][j+1]=='*')ans++;
						if(i-1>=0 && j+1<col && arr[i-1][j+1]=='*')ans++;
						if(i+1<row && j-1>=0 && arr[i+1][j-1]=='*')ans++;
						
						System.out.print(ans);
					}
				}
				System.out.println("");
			}
		}
	}
}