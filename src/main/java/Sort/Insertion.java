package Sort;

/**
 * @program: algsW
 * @description: 插入排序
 *
 * @author: Mr.Wang
 * @create: 2019-07-03 16:32
 **/

public class Insertion {
    public static void main(String[] args) {
        Comparable[] test = {3,5,8,6,7,1,2};
        sort(test);
        SortTemplate.show(test);
    }

    // 将array按照升序排列
    private static void sort(Comparable[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            // 将第i个元素按顺序插入到i之前的元素中
            for (int j = i; j > 0 ; j--) {
                // 如果i比当前元素小，插入当前元素之前，之后的元素加一
                // 将j之前的元素排序，这里选择快排
                if (SortTemplate.isLess(array[j], array[j-1])) {
                    SortTemplate.exchange(array, j, j - 1);

                }
            }
        }

    }
}
