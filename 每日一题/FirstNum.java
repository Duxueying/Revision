
public class FirstNum{
    //Insert one char from stringstream
    public int[] cc = new int[256];
    public static int index = 1;//记录元素的下标
    public void Insert(char ch)
    {
        //每插入一个元素，下标+1
        if(cc[ch]==0){//当前位置为0，说明该字符是第一次出现
            cc[ch]=index ++; //将其设为其下标
        }else{//不是第一次出现，将其设为-1
            cc[ch]=-1;
        }
        //index ++;
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        int temp = Integer.MAX_VALUE;
        char res = '#';
        for(int i = 0; i<256; i ++) {//如果其对应=0，说明一次都没出现；=-1.出现不止1次；其余是出现一次，取值为元素对应下标，应找到只出现1次且下标最小的，为第一个只出现1次的元素
            if(cc[i] != 0 && cc[i] != -1 && cc[i] < temp) {
                temp = cc[i];
                res = (char)i;
            }
        }
        return res;
    }
}