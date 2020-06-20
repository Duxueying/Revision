package day6_20;
/*��Ŀ����**���������ö�����A��B���ж�B�ǲ���A���ӽṹ��ps������Լ��������������һ�������ӽṹ��
        **����˼·**����������һ�㶼���õݹ�����������ҵ���Ӧ���Ǹ����ڵ㣬Ȼ�����µݹ������*/

public class Solution {
    public  boolean HasSubtree(TreeNode root1, TreeNode root2) {
        boolean flag= false;
        if (root2!=null&&root1!=null) {//����Ϊ�ղ��ܱȽ�
            if(root1.val == root2.val){//�ҵ���root2��Ӧ�ĸ��ڵ�
                flag= sonTree(root1,root2);//ȥ�ж��ǲ�������
            }
            //����Ҳ�������ȥroot�������
            if (!flag) {
                flag= HasSubtree(root1.left,root2);
            }
            //������Ҳ�������ȥroot���ұ���
            if (!flag) {
                flag=HasSubtree(root1.right,root2);
            }
        }
        return flag;
    }

    public  boolean sonTree(TreeNode node1, TreeNode node2) {
        if (node2 == null) {//Tree2Ϊ���ˣ�˵���ڵ㶼������
            return true;
        }
        //Tree2��û�б����꣬Tree1ȴ���ˡ�����false
        if (node1 == null) {//Tree1��û�꣬Tree1���ˣ�˵��û����
            return false;
        }
        if (node1.val != node2.val) {  //ĳһ����û���ϣ�Ҳ˵������
            return false;
        }
        //������ڵ��Ӧ���ϣ���ô�ͷֱ�ȥ�ӽڵ�����ƥ��
        return sonTree(node1.left,node2.left) &&sonTree(node1.right,node2.right);
    }
}
