// 24931:Extend to Palindromes
import java.util.*;
public class Extend_to_Palindromes {
    public static void  main(String[] args){
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){

            String a;
            String ans="";
            a=scanner.next();
            char aa[]=new char[a.length()];
            char bb[]=new char[a.length()];
            for (int i=0;i<a.length();i++){
                aa[i]=a.charAt(i);
                bb[a.length()-1-i]=a.charAt(i);
            }
            boolean c;
            for (int i=0;i<a.length();i++){
                c=false;
                if(aa[i]==bb[0]){
                    c=true;
                    for (int j=i;j<a.length();j++){
                        if(aa[j]!=bb[j-i]){
                            c=false;
                            break;
                        }
                    }
                }
                if(c){
                    int size=a.length()+i;
                    char cc[]=new char[size];
                    for(int k=0;k<size;k++){
                        if(k<a.length())
                            cc[k]=aa[k];
                        else
                            cc[k]=bb[k-i];
                    }
                    ans=String.valueOf(cc);
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}
