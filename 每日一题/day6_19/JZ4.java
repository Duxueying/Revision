package day6_19;


/*题目描述**：输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的
结果中都不含重复的数字。例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，
则重建二叉树并返回。
解题思路：因为是树的结构，一般都是用递归来实现。假设最后一步，就是root的左右子树都已经重建好了，
那么我只要考虑将root的左右子树安上去即可。根据前序遍历的性质，第一个元素必然就是root，
那么下面的工作就是如何确定root的左右子树的范围。根据中序遍历的性质，root元素前面都是root的左子树，
后面都是root的右子树。那么我们只要找到中序遍历中root的位置，就可以确定好左右子树的范围。
这里用了Arrays的copyOfRange方法。*/

import java.util.Arrays;
public class JZ4{
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre.length==0||pre.length!=in.length){//合法性判断
            return null;
        }
        TreeNode node=new TreeNode(pre[0]);
        for(int i=0;i<in.length;i++){
            if(pre[0]==in[i]){//找根节点
                node.left=reConstructBinaryTree(Arrays.copyOfRange(pre,1,i+1),
                        Arrays.copyOfRange(in,0,i));//三个参数分别是数组和要复制的下标
                node.right=reConstructBinaryTree(Arrays.copyOfRange(pre,i+1,pre.length),
                        Arrays.copyOfRange(in,i+1,in.length));
            }
        }
        return node;
    }
}