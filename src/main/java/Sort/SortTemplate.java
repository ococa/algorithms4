package Sort;

import edu.princeton.cs.algs4.StdOut;
import jdk.nashorn.internal.objects.annotations.Function;

/**
 * @program: algsW
 * @description: 基础排序算法入口
 * @author: Mr.Wang
 * @create: 2019-07-03 15:52
 **/

public class SortTemplate {


    /**
     * 如果v<w返回 true 否则返回false
     * @param v
     * @param w
     * @return
     */
    public static boolean isLess(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    // 交换数组中i 和j位置的元素
    public static void exchange(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    // 打印数组
    public static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            StdOut.print(a[i] + "");
        }
        StdOut.println();
    }

    // 判断数组是否已经被排序
    public static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (isLess(a[i], a[i-1])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] a = {};

    }
}
