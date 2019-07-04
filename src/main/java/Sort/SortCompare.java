package Sort;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

/**
 * @program: algsW
 * @description: 排序算法 时间比较
 * @author: Mr.Wang
 * @create: 2019-07-03 17:36
 **/

public class SortCompare {

    public static void main(String[] args) {
        int n = 1000;   // 数组数量
        int t = 100;    // 数组长度

        double t1 = timeRandomInput("Insertion", n, t);
        double t2 = timeRandomInput("Selection", n, t);
        double t3 = timeRandomInput("Shell", n, t);

        System.out.println("Insertion time" + t1);
        System.out.println("Selection time" + t2);
        System.out.println("Shell time" + t3);
        System.out.println("时间比例Insertion/Selection= " + t3/t1);
    }

    public static double time(String alg, Double[] a) {
        Stopwatch timer = new Stopwatch();
        if (alg.equals("Insertion")) Sort.Insertion.sort(a);
        if (alg.equals("Selection")) Sort.Selection.sort(a);
        if (alg.equals("Shell")) Sort.Shell.sort(a);
//        if (alg.equals("Insertion")) Sort.Insertion.sort(a);
//        if (alg.equals("Insertion")) Sort.Insertion.sort(a);
//        if (alg.equals("Insertion")) Sort.Insertion.sort(a);
        return timer.elapsedTime();

    }

    // 使用alg算法将T个长度为N的数组排序
    public static double timeRandomInput(String alg, int N, int T) {
        double total = 0.0;
        Double[] a = new Double[N];
        for (int t = 0; t < T; t++) {
            for (int i = 0; i < N; i++) {
                a[i] = StdRandom.uniform();
            }
            total += time(alg, a);
        }
        return total;
    }
}
