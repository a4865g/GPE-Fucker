import java.util.*;
class Die{
	int north=2;
	int south=5;
	int east=4;
	int west=3;
	int bottom=6;
	int top=1;
}
public class main{
	public static void main(String[] argv){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int case_cnt=sc.nextInt();
			if(case_cnt==0){
				break;
			}else{
				Die die=new Die();
				while((--case_cnt)>=0){
					String st=sc.next();
					int tmp;
					switch(st){
						case "north":
							tmp=die.north;
							die.north=die.top;
							die.top=die.south;
							die.south=die.bottom;
							die.bottom=tmp;
							break;
						case "south":
							tmp=die.south;
							die.south=die.top;
							die.top=die.north;
							die.north=die.bottom;
							die.bottom=tmp;
							break;
						case "west":
							tmp=die.west;
							die.west=die.top;
							die.top=die.east;
							die.east=die.bottom;
							die.bottom=tmp;
							break;
						case "east":
							tmp=die.east;
							die.east=die.top;
							die.top=die.west;
							die.west=die.bottom;
							die.bottom=tmp;
							break;
					}
				}
				System.out.println(die.top);
			}
		}
	}
}