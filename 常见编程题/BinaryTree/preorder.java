package src.niuKe.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class preorder {
    List<Integer> list=new ArrayList<>();
    public List<Integer> preorder(TreeNode root){
        if(root!=null){
            list.add(root.val);
            preorder(root.left);
            preorder(root.right);
        }
       return list;
    }
}
    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> list=new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();
        if(root==null){
            return list;
        }
        stack.push(root);
        while(!stack.isEmpty()){
            root=stack.pop();
            list.add(root.val);
            if(root.right!=null){
                stack.push(root.right);
            }
            if(root.left!=null){
                stack.push(root.left);
            }
        }
        return list;
    }