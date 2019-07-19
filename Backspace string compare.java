Backspace string compare


class Solution {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> s = new Stack();
        Stack<Character> t = new Stack();
        char c;
        for(int i=0;i<S.length();i++){
            c = S.charAt(i);
            if(c!='#'){
                s.push(c);
            }
            else if(!s.empty()){
                s.pop();
                
            }
           
                
        }
         for(int i=0;i<T.length();i++){
             c=T.charAt(i);
            if(c!='#'){
                t.push(c);
            }
            else if(!t.empty()){
                t.pop();
            
            }
         }
        while(!s.empty() && !t.empty()){
            if(s.peek()!=t.peek()){
                return false;
            }
            else{
                s.pop();
                t.pop();
            }
            
        }
       if(!s.empty() || !t.empty()){
           return false;
       }
        return true;
        
    
    }
}