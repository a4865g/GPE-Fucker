import java.util.*;

public class main{
	public static boolean[][] mat;
	public static int[] color;
	
	public static boolean fillColor(int id,int toFill){
		if(color[id]==Integer.MAX_VALUE){
			boolean flag=true;
			color[id]=toFill;
			for(int i=0;i<mat.length&&flag;i++){
				if(mat[id][i]){
					flag=fillColor(i,1-toFill);
				}
			}
			return flag;
		}else if(color[id]!=toFill){
			return false;
		}
		return true;
	}
	public static void main(String[] argv){
		Scanner sc=new Scanner(System.in);
		while(true){
			int n=sc.nextInt();
			if(n==0){
				break;
			}
			int l=sc.nextInt();
			mat=new boolean[n][n];
			color=new int[n];
			Arrays.fill(color,Integer.MAX_VALUE);
			
			for(int i=0;i<l;i++){
				int src=sc.nextInt();
				int dest=sc.nextInt();
				mat[src][dest]=true;
				mat[dest][src]=true;
			}
			
			if(fillColor(0,0)){
				System.out.println("BICOLORABLE.");
			}else{
				System.out.println("NOT BICOLORABLE.");
			}
		}
	}
}