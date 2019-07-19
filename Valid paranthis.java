Valid paranthis

class Solution {
    public boolean isValid(String s) {
        int i;
        char c;
        Stack<Character> p = new Stack();
        for(i=0;i<s.length();i++)
        {
            c=s.charAt(i);
            if(c=='(' || c=='[' || c=='{')
            {
                p.push(c);
            }
            else{
                if(c==')')
                {
                    if(p.empty() || p.peek()!='(')
                        return false;
                    else
                    p.pop();
                
                }
                if(c==']'){
                    if(p.empty() || p.peek()!='[')
                        return false;
                
                     else
                         p.pop();
                }
                if(c=='}'){
                    if(p.empty() || p.peek()!='{')
                      return false;
                    else
                        p.pop();
                }
                
            }
        }
        if(p.empty())
             return true;
        else
            return false;
        
        
    }
}