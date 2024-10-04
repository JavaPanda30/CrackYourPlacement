class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> str1 = checkString(s);
        Stack<Character> str2 = checkString(t);
        return str1.equals(str2);
    }

    static Stack<Character> checkString(String st){
        Stack<Character> str1 = new Stack<>();
        for(char ch:st.toCharArray()){
            if(ch=='#'){ 
             if(!str1.isEmpty()){
                str1.pop();
            }else{
            continue;}
            }
            else{
            str1.push(ch);
            }
        }
        return str1;
    }
}