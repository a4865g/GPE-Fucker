import java.util.*;

public class main{
	public static void main(String[] argv){
		Scanner sc=new Scanner(System.in);
		int edgeX=sc.nextInt();
		int edgeY=sc.nextInt();
		boolean[][] drop_arr=new boolean[51][51];
		for(int i=0;i<=50;i++){
			Arrays.fill(drop_arr[i],false);
		}
		
		while(sc.hasNext()){
			int x=sc.nextInt();
			int y=sc.nextInt();
			char position=sc.next().charAt(0); //notice!!
			String cmd=sc.next();
			for(int i=0;i<cmd.length();i++){
				if(cmd.charAt(i)=='F'){
					int tmpX=x,tmpY=y;
					
					//add
					if(position=='N'){
						tmpY++;
					}else if(position=='E'){
						tmpX++;
					}else if(position=='S'){
						tmpY--;
					}else{
						tmpX--;
					}
					
					if(tmpX>edgeX||tmpY>edgeY||tmpX<0||tmpY<0){
						if(!drop_arr[x][y]){
							drop_arr[x][y]=true;
							System.out.println(x+" "+y+" "+position+" LOST");
							break;
						}
					}else{
						x=tmpX;
						y=tmpY;
					}
					
				}else{
					if(position=='N'){
						if(cmd.charAt(i)=='R'){
							position='E';
						}else{
							position='W';
						}
					}else if(position=='S'){
						if(cmd.charAt(i)=='R'){
							position='W';
						}else{
							position='E';
						}
					}else if(position=='E'){
						if(cmd.charAt(i)=='R'){
							position='S';
						}else{
							position='N';
						}
					}else{
						if(cmd.charAt(i)=='R'){
							position='N';
						}else{
							position='S';
						}
					}
				}
				if(i==cmd.length()-1){
					System.out.println(x+" "+y+" "+position);
				}
			}
		}
	}
}