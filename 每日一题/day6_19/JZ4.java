package day6_19;


/*��Ŀ����**������ĳ��������ǰ���������������Ľ�������ؽ����ö����������������ǰ����������������
����ж������ظ������֡���������ǰ���������{1,2,4,7,3,5,6,8}�������������{4,7,2,1,5,3,8,6}��
���ؽ������������ء�
����˼·����Ϊ�����Ľṹ��һ�㶼���õݹ���ʵ�֡��������һ��������root�������������Ѿ��ؽ����ˣ�
��ô��ֻҪ���ǽ�root��������������ȥ���ɡ�����ǰ����������ʣ���һ��Ԫ�ر�Ȼ����root��
��ô����Ĺ����������ȷ��root�����������ķ�Χ������������������ʣ�rootԪ��ǰ�涼��root����������
���涼��root������������ô����ֻҪ�ҵ����������root��λ�ã��Ϳ���ȷ�������������ķ�Χ��
��������Arrays��copyOfRange������*/

import java.util.Arrays;
public class JZ4{
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre.length==0||pre.length!=in.length){//�Ϸ����ж�
            return null;
        }
        TreeNode node=new TreeNode(pre[0]);
        for(int i=0;i<in.length;i++){
            if(pre[0]==in[i]){//�Ҹ��ڵ�
                node.left=reConstructBinaryTree(Arrays.copyOfRange(pre,1,i+1),
                        Arrays.copyOfRange(in,0,i));//���������ֱ��������Ҫ���Ƶ��±�
                node.right=reConstructBinaryTree(Arrays.copyOfRange(pre,i+1,pre.length),
                        Arrays.copyOfRange(in,i+1,in.length));
            }
        }
        return node;
    }
}