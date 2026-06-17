class Solution {
    public boolean isPalindrome(String s) {
        
        String sb = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        char[] ch = sb.toCharArray();
        StringBuilder stb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for(char c1:ch){
            st.push(c1);
        }
        while(!st.isEmpty()){
            stb.append(st.pop());
        }
        if(!stb.toString().equals(sb)){
            return false;
        }

    return true;
    }
}
