package day6_20;
/*题目描述**：输入两棵二叉树A，B，判断B是不是A的子结构（ps：我们约定空树不是任意一个树的子结构）
        **解题思路**：树的问题一般都是用递归来解决，先找到对应的那个根节点，然后往下递归遍历。*/

public class Solution {
    public  boolean HasSubtree(TreeNode root1, TreeNode root2) {
        boolean flag= false;
        if (root2!=null&&root1!=null) {//树不为空才能比较
            if(root1.val == root2.val){//找到了root2对应的根节点
                flag= sonTree(root1,root2);//去判断是不是子树
            }
            //如果找不到，就去root的左边找
            if (!flag) {
                flag= HasSubtree(root1.left,root2);
            }
            //如果还找不到，就去root的右边找
            if (!flag) {
                flag=HasSubtree(root1.right,root2);
            }
        }
        return flag;
    }

    public  boolean sonTree(TreeNode node1, TreeNode node2) {
        if (node2 == null) {//Tree2为空了，说明节点都对上了
            return true;
        }
        //Tree2还没有遍历完，Tree1却完了。返回false
        if (node1 == null) {//Tree1还没完，Tree1完了，说明没对上
            return false;
        }
        if (node1.val != node2.val) {  //某一个点没对上，也说明不是
            return false;
        }
        //如果根节点对应的上，那么就分别去子节点里面匹配
        return sonTree(node1.left,node2.left) &&sonTree(node1.right,node2.right);
    }
}
