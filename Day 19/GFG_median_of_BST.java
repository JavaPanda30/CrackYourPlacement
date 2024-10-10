
class Tree
{
    public static float findMedian(Node root)
    {
        // code here.
        float ans=0;
        List<Float> aman = new ArrayList<>();
        inorder(root,aman);
        // System.out.println(aman);        
        int n = aman.size();
        // System.out.println(n);
        if(n%2!=0){
            ans=aman.get(n/2);
        }else{
            ans = (aman.get((n/2)-1)+aman.get(n/2))/2;
        }
        return ans;
    }
    static void inorder(Node root,List<Float> aman){
        if(root==null){
            return;
        }
        if(root.left!=null)inorder(root.left,aman);
        aman.add((float)root.data);
        if(root.right!=null)inorder(root.right,aman);
    }
}