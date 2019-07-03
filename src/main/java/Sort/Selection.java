package Sort;

import com.sun.tools.javac.util.Assert;

/**
 * @program: algsW
 * @description: 选择排序
 * @author: Mr.Wang
 * @create: 2019-07-03 16:04
 **/

public class Selection {
    public static void main(String[] args) {
        Comparable[] test = {3,4,5,6,8,2};
        sort(test);
        SortTemplate.show(test);
    }

    private static void sort(Comparable[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            // 如果i+1到length-1中最小的数小于array[i];
            // 将array[i+1] 到array[length-1]中最小的数和array[i]交换
            for (int j = i + 1; j < length; j++) {
                if (SortTemplate.isLess(array[j], array[i])) {
                    SortTemplate.exchange(array, i, j);
                }
            }
        }

    }
}
