import javax.annotation.processing.SupportedSourceVersion;
import java.sql.Struct;
import java.util.*;


/*
11019:Die Game
correct(1.00)
*/

class Die{
    public int up,down,north,east,south,west;
}
public class Die_Game {
    public static void main(String[] argv){
        Die d = new Die();
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int i=scanner.nextInt();
            if(i==0)break;
            d.up=1;
            d.down=6;
            d.north=2;
            d.south=5;
            d.east=4;
            d.west=3;
            while (i>0){
                String s=scanner.next();
                if(s.charAt(0)=='s'){
                    d.south=d.up;
                    d.up=d.north;
                    d.down=7-d.up;
                    d.north=7-d.south;
                }
                if(s.charAt(0)=='n'){
                    d.south=d.down;
                    d.down=d.north;
                    d.up=7-d.down;
                    d.north=7-d.south;
                }
                if(s.charAt(0)=='w'){
                    d.west=d.up;
                    d.up=d.east;
                    d.down=7-d.up;
                    d.east=7-d.west;
                }
                if(s.charAt(0)=='e') {
                    d.east = d.up;
                    d.up = d.west;
                    d.down = 7 - d.up;
                    d.west = 7 - d.east;
                }
                i--;
            }
            System.out.println(d.up);
        }
    }
}
