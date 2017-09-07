/**
 * Author: tianyi
 * Time: 2017/9/6
 * Question:求字符串中最长的数字串
 * Source:
 */

import java.util.Scanner;

public class MaxLength {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int count=0;
        int max=Integer.MIN_VALUE;
        String ss="";
        String maxss="";
        for (int i = 0; i <s.length(); i++) {
            if((int)s.charAt(i)>=48&&(int)s.charAt(i)<=57){
                count++;
                ss+=s.charAt(i);
            }
            else{
                count=0;
                ss="";
            }
            if(ss.length()>=maxss.length()){
                maxss=ss;
            }
            max=Math.max(count,max);
        }
        if(max<0){
            System.out.print(""+","+0);

        }
        else {
            System.out.print(maxss+","+max);
        }
    }

}
