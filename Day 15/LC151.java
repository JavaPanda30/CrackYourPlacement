class Solution {
    public String reverseWords(String ans) {
        ans=ans.trim();
        String answ[]=ans.split(" ");
        String a="";
        for(int i=answ.length-1;i>=0;i--)
        {
            if(answ[i]!="") {
                a += answ[i] + " ";
            }
        }
		return a.trim();

    }
}