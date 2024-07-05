import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("輸入文本");
        Scanner sc=new Scanner(System.in);
        StringBuilder content = new StringBuilder();
        String s="";
        while (true) {
            s = sc.nextLine();
            if (s.equals("k")) {
                break;
            }
            content.append(s).append(";").append("\n");
        }

        String input=content.toString();

        System.out.println("要加的詞");
        String insert=sc.nextLine();

        System.out.println("要取代的詞");
        ArrayList<String> targets=new ArrayList<String>();
        
        s="";
        while (true) {
            s = sc.nextLine();
            if (s.equals("k")) {
                break;
            }
            targets.add(s);
        }
        
        for (String target:targets){
            input = input.replaceAll("\\b" + target + "\\b", insert + target);
        }

        System.out.println("輸出：\n"+input);
        sc.close();
    }
}
