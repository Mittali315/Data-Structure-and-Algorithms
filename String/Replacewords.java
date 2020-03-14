 package string;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Replacewords {
	
public static String replaceWords(List<String> dict, String sentence) {
	
              Set<String> rootset = new HashSet<String>();
        for (String root: dict) 
        	rootset.add(root);

        StringBuilder ans = new StringBuilder();
        for (String word: sentence.split(" ")) {
            String prefix = " ";
            for (int i = 1; i <= word.length(); ++i) {
                prefix = word.substring(0, i);
                if (rootset.contains(prefix)) 
                	break;
            }
            if (ans.length() > 0) 
            	ans.append(" ");
            ans.append(prefix);
        }
        return ans.toString();
    }
 
public static void main(String args[]) 
{ 
	List<String> dict=new ArrayList<String>(); 
	dict.add("cat");
	dict.add("bat");
	dict.add("rat");
	
	String sent ="the cattle was rattled by the battery";
	replaceWords(dict,sent);
	System.out.print(replaceWords(dict,sent));
}	

}
