package Sort;

/**
 * @program: algsW
 * @description: 希尔排序
 * @author: Mr.Wang
 * @create: 2019-07-04 10:33
 **/

public class Shell {
    public static void main(String[] args) {
        Comparable[] test = {3,4,5,6,8,2};
        Comparable[] test2 = {9,3,4,5,6,8,2};
        sort(test);
        sort(test2);
        SortTemplate.show(test);
        SortTemplate.show(test2);
    }

    public static void sort(Comparable[] a) {
        int length = a.length;
        int h = 1;
        while (h < length/3) {
            h = 3*h + 1;
        }
        while (h >= 1) {
            for (int i = h; i < length; i++) {
                for (int j = i; j >= h && SortTemplate.isLess(a[j], a[j-h]); j -= h) {
                    SortTemplate.exchange(a, j, j-h);
                }
            }
            h = h/3;
        }
    }
}
