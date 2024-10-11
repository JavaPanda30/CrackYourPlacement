class Solution {
    public String simplifyPath(String path) {
        Stack<String> aman = new Stack<>();
        String ans="";
        String[] sep = path.split("/");
        for(String a:sep){
            System.out.println(a+" _");
        }
        for(int i=0;i<sep.length;i++){
            if(sep[i]!=""){
                if(!aman.isEmpty() && (sep[i]).equals("..")){
                    aman.pop();
                }
                else if((sep[i]).equals(".") || aman.isEmpty() && (sep[i]).equals("..")){
                    continue;
                }
                else{
                aman.push(sep[i]);
                }
            }
        }
        if(aman.isEmpty()){
            ans="/";
        }
        while(!aman.isEmpty()){
            ans="/"+aman.pop()+ans;
        }
        return ans;
    }
}