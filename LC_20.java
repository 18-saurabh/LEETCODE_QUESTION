import java.util.Stack;

public class LC_20{
     public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        for (char it: s.toCharArray()){
            if(it=='{'||it=='('||it=='['){
                st.push(it);
            }
            else{
                if(st.isEmpty()) return false;
                char ch=st.pop();
                if(ch=='{'&&it=='}'||ch=='['&&it==']'||ch=='('&&it==')') continue;
                else return false;
            }
        }
        return st.isEmpty();
    }
}