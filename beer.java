import java.util.Arrays;
import java.util.Scanner;

/*
* 问题描述：一共有m个龙头，n个人，一个人接完以后另一个人马上来接，换人中间时间忽略不计，问都接完需要多少时间
* */
public class beer {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in

        );
        int n = in.nextInt();//人数
        int m = in.nextInt();//龙头数
        int[] nArray = new int[n];//每个人的接酒量
        for (int i = 0; i <= n-1; i++) {
            nArray[i] = in.nextInt();
        }
        int[] res = new int[m];
        for (int i = 0; i <= n - 1; i++) {
            int index = getMinValue(res);
            res[index] += nArray[i];
        }
        Arrays.sort(res);
        System.out.println(res[m - 1]);
    }

    //获取数组中最小元素的index
    public static int getMinValue(int[] nArray) {
        int min = nArray[0];
        int index = 0;
        int n = nArray.length;
        for (int i = 0; i <= n - 1; i++) {
            if (nArray[i] < min) {
                min = nArray[i];
                index = i;
            }
        }
        return index;
    }
}

