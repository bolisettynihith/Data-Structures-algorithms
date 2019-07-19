class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++){
            try {
                stack.push(Integer.parseInt(tokens[i]));
            } catch (Exception e){
                int right = stack.pop();
                int left = stack.pop();
                String op = tokens[i];
                if (op.equals("+")){
                    stack.push(right+left);
                }
                else if (op.equals("-")){
                    stack.push(left-right);
                }
                else if (op.equals("/")) {
                    stack.push(left/right);
                }
                else {
                    stack.push(left*right);
                }
            }
        }
        return stack.pop();
    }
        
}
