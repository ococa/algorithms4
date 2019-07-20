package Sort;

/**
 * @program: algsW
 * @description: 归并排序
 * @author: Mr.Wang
 * @create: 2019-07-04 13:42
 **/

public class Merge {

    public static void main(String[] args) {
        Comparable[] test = {3,5,8,6,7,1,2};
        Comparable[] test1 = {3,5,8,6,7,1,2,3};
        sort(test);
        sortBU(test1);
        SortTemplate.show(test);
        SortTemplate.show(test1);
    }

    /**
     * 辅助数组
     */
    private static Comparable[] aux;

    public static void sort(Comparable[] a) {
        aux = new Comparable[a.length];
        sort(a, 0, a.length - 1);
    }

    /**
     * 自定向下的归并排序
     * @param a
     * @param start
     * @param end
     */
    private static void sort(Comparable[] a, int start, int end) {
        if (start >= end) return;
        int mid = start + (end - start) / 2;
        sort(a, start, mid);
        sort(a, mid + 1, end);
        merge(a, start, mid, end);
    }

    /**
     * 原地归并，合并过程，辅助方法
     * @param a
     * @param start
     * @param mid
     * @param end
     */
    public static void merge(Comparable[] a, int start, int mid, int end) {

        int left = start;
        int right = mid + 1;

        for (int k = start; k <= end; k++) {
            aux[k] = a[k];
        }

        for (int k = start; k <= end; k++) {
            // 如果左边为空，取右边元素
            if (left > mid)                                         a[k] = aux[right++];
            // 如果右边为空，取左边元素
            else if (right > end)                                   a[k] = aux[left++];
            // 如果当前右边元素小于当前左边当前元素，取右边元素
            else if (SortTemplate.isLess(aux[right], aux[left]))    a[k] = aux[right++];
            // 如果当前左边元素小于当前右边元素，取左边元素
            else                                                    a[k] = aux[left++];
        }
    }


    /**
     * 归并排序，自底向上
     * @param a
     */
    public static void sortBU(Comparable[] a) {
        int length = a.length;
        aux = new Comparable[length];

        for (int size = 1; size < length; size *= 2) {
            for (int lo = 0; lo + size < length; lo += size + size) {
                merge(a, lo, lo + size - 1, Math.min(lo + size + size - 1, length - 1));
            }
        }
    }
}
