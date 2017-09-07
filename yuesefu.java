/**
 * Author: tianyi
 * Time: 2017/9/7
 * Question:一共100个人，行第一个人开始报数，每次报到m的人出局，问最后剩下的m个人初始编号是多少
 * Source:
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class yuesefu{

        public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int m = in.nextInt();
         //不符合条件
            if (m < 1 || m > 100) {
                System.out.println("ERROR!");
            }
            else {
                     List<Integer> list = findLastMan(m);
                     int[] res = list2array(list);
                     String str = "";
                        for(int i=0;i<res.length;i++){
                            str+=res[i];
                            if(i!=res.length-1){
                                str+=",";
                                }
                        }
                         System.out.println(str);
                     }
         }

       public static List<Integer> findLastMan(int m) {
        List<Integer> list = new ArrayList<Integer>();//100人集合
            for (int i = 1; i <= 100; i++) {
                list.add(i);
        }
            int flag = 1;//报数初始值
            int index = 0;//遍历的初始索引
            while (list.size() >= m) {
            if (flag % m == 0) {//每逢m删除一个人
                list.remove(index);
                --index;//移除后需要前置一位
            }
                flag++;//报数自增
            if (index == (list.size() - 1)) {//集合末返回
                index = 0;
            } else {
                index++;//下一次遍历
            }
             }
                return list;
        }

         public static int[] list2array(List<Integer> list){
             int[] arr =new int[list.size()];
             for(int i=0;i<arr.length;i++){
                arr[i] = list.get(i);
            }
                return arr;
         }
        }
