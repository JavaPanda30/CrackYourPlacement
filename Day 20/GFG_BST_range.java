
class Solution
{
    int getCount(Node root,int l, int h)
    {
        //Your code here
        if(root==null){
            return 0;
        }
        int left = 0;
        if(root.data>l){
            left=getCount(root.left,l,h);
        }
        int right = 0;
        if(root.data<=h){
        right=getCount(root.right,l,h);
        }
        if(root.data>=l && root.data<=h){
        return left+right+1;
        }
        return left+right;
    }
}
