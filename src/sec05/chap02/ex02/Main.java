package sec05.chap02.ex02;

public class Main {
    public static void main(String[] args) {

        int[] ary1 = {3, 5, 9, 2, 8, 1, 4};
        int[] ary2 = {382, 194, 27, 915, 134};

        IntArrayInfo aryInfo1 = new IntArrayInfo(ary1);
        IntArrayInfo aryInfo2 = new IntArrayInfo(ary2);

        int ary1Max = aryInfo1.max;
        double ary2Avg = aryInfo2.average;
        int ary1n2Sum = aryInfo1.sum + aryInfo2.sum;
    }
}
