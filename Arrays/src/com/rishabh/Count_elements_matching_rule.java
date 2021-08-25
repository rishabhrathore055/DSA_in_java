import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Count_elements_matching_rule{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String ruleKey = in.next();
        String ruleValue =  in.next();
        List<List<String>> items = new ArrayList<>();
        for(int i=0; i<n; i++){
            List<String> temp =new ArrayList<>();
            String type=in.next();
            String color=in.next();
            String name= in.next();
            temp.add(type);
            temp.add(color);
            temp.add(name);
            items.add(temp);
        }
        System.out.println(countMatches(items, ruleKey, ruleValue));

    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int c = 0,in;
        if(ruleKey.equals("type"))
            in = 0;
        else if(ruleKey.equals("color"))
            in = 1;
        else
            in = 2;
        for(int i=0;i<items.size();i++)
            if(items.get(i).get(in).equals(ruleValue))
                c++;
        return c;
    }
}