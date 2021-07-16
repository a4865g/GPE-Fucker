import java.util.*;

//Not yet

public class Uncompress {
    public static void main(String[] argv){
        Scanner scanner=new Scanner(System.in);

        String[] list = new String[100000];

        int list_l = 0;
        boolean ck_z=true;
        while (scanner.hasNext()||ck_z) {
            String input = scanner.nextLine();
            int input_index = 0;
            char ch;
            ck_z = true;
            while (input_index < input.length()) {
                ch = input.charAt(input_index);
                if (is_Number(ch)) {
                    if (ch == '0') {
                        ck_z = false;
                        break;
                    }
                    int num = 0;
                    while (is_Number(ch)) {
                        num = num * 10 + Integer.parseInt(String.valueOf(ch));
                        input_index++;
                        ch = input.charAt(input_index);
                    }
                    System.out.print(list[num - 1]);
                    String word = list[num - 1];
                    String[] tmp = list;
                    int same_index = -1;
                    for (int i = 0; i < list_l; i++) {
                        if (list[i] == word) {
                            same_index = i;
                            break;
                        }
                    }
                    if (same_index == -1) {
                        list[0] = word;
                        for (int i = 0; i < list_l; i++) {
                            list[i + 1] = tmp[i];
                        }
                        list_l++;
                    } else if (same_index > 0) {
                        list[0] = word;
                        for (int i = 0; i < list_l; i++) {
                            if (i < same_index) {
                                list[i + 1] = tmp[i];
                            } else if (i > same_index) {
                                list[i] = tmp[i];
                            }
                        }
                    }
                    System.out.println();
                    System.out.print("N Check list:");
                    for(int i=0;i<list_l;i++){
                        System.out.print(list[i]);
                    }
                } else if (is_abc(ch)) {
                    String word = "";
                    while (is_abc(ch)) {
                        word += ch;
                        input_index++;
                        ch = input.charAt(input_index);
                    }
                    System.out.print(word);
                    String[] tmp = list;
                    int same_index = -1;
                    for (int i = 0; i < list_l; i++) {
                        if (list[i] == word) {
                            same_index = i;
                            break;
                        }
                    }
                    if (same_index == -1) {
                        list[0] = word;
                        for (int i = 0; i < list_l; i++) {
                            list[i + 1] = tmp[i];
                            System.out.println("tmp["+i+"]: "+tmp[i]);
                        }
                        list_l++;
                    } else if (same_index > 0) {
                        list[0] = word;
                        for (int i = 0; i < list_l; i++) {
                            if (i < same_index) {
                                list[i + 1] = tmp[i];
                            } else if (i > same_index) {
                                list[i] = tmp[i];
                            }
                        }
                    }
                    System.out.println();
                    System.out.print("Check list:");
                    for(int i=0;i<list_l;i++){
                        System.out.print(list[i]);
                    }
                } else {
                    System.out.print(ch);
                    input_index++;
                }
            }
            System.out.println();
        }
    }

    private static boolean is_abc(char ch) {
        return ('a'<=ch&&ch<='z')||('A'<=ch&&ch<='Z');
    }

    private static boolean is_Number(char ch) {
        return '0' <= ch && ch <= '9';
    }
}
