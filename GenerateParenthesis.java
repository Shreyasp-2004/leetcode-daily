import java.util.*;
public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        solve("",0,0,n,list);
        return list;
    }
    private static void solve(String curr, int open, int closed, int total,List<String>list){
        if(curr.length()==2*total){
            list.add(curr);
            return;
        }
        if(open<total){
            solve(curr+"(",open+1,closed,total,list);
        }
        if(closed<open){
            solve(curr+")",open,closed+1,total,list);
        }
    }
}