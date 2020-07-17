package GuangLianDa;

import java.util.Scanner;

//知某次聚会敏感词有N个人参加，这N个人来自26个地区，现在将26个地区使用数字0-25表示，
// 使用整数数组Locations存储这N个人的地区, 请返回一个bool值, True代表所有人的地区全都不同，
// False代表存在相同地区。要求：不能使用额外的存储结构。
public class Region {
        static int person_num;
        static char[] location = "abcdefghi".toCharArray();
        public static void main(String[] args){
            Scanner reader = new Scanner(System.in);
            if(judgeLoc(location)){
                System.out.println("there is  no same nation here. ");
            }else{
                System.out.println("there is same nation here.");
            }


        }
        public static boolean judgeLoc(char[] loc){
            int len = loc.length;
            int[] countLoc =  new int[26];
            int index;
//如果人数大于26，肯定存在相同的名族
            if(len > 26){
                return false;
            }else{
//遍历整个loc数组，统计每一个字母出现的次数，如果出现的次数大于1，即存在相同名族
                for(int i = 0; i < len; i++ ){
                    index = loc[i] - 'a';
                    countLoc[index]++;
                }
                for(int i = 0; i < 26; i++){
                    if(countLoc[i] > 1){
                        return false;
                    }
                }
            }
            return true;

        }
    }
