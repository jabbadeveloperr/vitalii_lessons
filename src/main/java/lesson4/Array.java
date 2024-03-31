package lesson4;

public class Array {
    public static void main(String[] args) {
        double[] debts = {44.0, -55.0, -400.3, 43.3, -22.3};
//        System.out.println(debts.length);
//        System.out.println(debts[0]);
//        System.out.println(debts[debts.length - 1]);
//        debts[1] = 0;
//        System.out.println(debts[1]);
//        System.out.println("____________");
        double min = debts[0]; //44
        int indexMin = 0;
        for (int i = 0; i < debts.length; i++) {
            if (min > debts[i]) {
                min = debts[i];
                indexMin = i;
            }
        }

//        for ( double debt : debts) {
//            System.out.println();
//        }
        System.out.println("Min:" + min + "; index:"+ indexMin);
        debts[indexMin] = 0;
    }
}
