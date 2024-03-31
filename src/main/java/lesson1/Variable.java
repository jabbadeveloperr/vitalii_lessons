package lesson1;

import java.math.BigDecimal;

public class Variable {
    public static void main(String[] args) {
        byte myByte = 127;
        byte mySecondByte = 127;
        byte myThirdByte = (byte) (myByte + mySecondByte);

        System.out.println(2.3);

        double db1 = 0.0000000000000000000000000001;
        double db2 = 100000000000000000000.0;
        double db3 = 100000000000000000000d;

        float f1 = (float) 4.4;
        float f2 = 4.4f;

        System.out.println((4.4f + 5.6f));
    }
}
