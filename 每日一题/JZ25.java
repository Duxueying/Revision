package day6_22;

import java.util.ArrayList;
public class JZ24{
    public ArrayList<ArrayList<Integer>> listAll = new ArrayList<ArrayList<Integer>>();
    public ArrayList<Integer> list = new ArrayList<Integer>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target){
        if(root == null){
            return listAll;
        }
        list.add(root.val);
        target=target-root.val;
        if(target == 0 && root.left == null && root.right == null){
            listAll.add(new ArrayList<Integer>(list));//不这样添加，后面操作会更改list
        }
        FindPath(root.left, target);
        FindPath(root.right, target);
        list.remove(list.size()-1);//递归到叶子节点如果还没有找到路径，就要回退到父节点继续
        return listAll;
    }
}