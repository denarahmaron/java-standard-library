package classes;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigNumberApp {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("1000000000000000000000000");
        BigInteger b = new BigInteger("1000000000000000000000000");
        BigInteger result = a.add(b);
        System.out.println(result);

        BigDecimal c = new BigDecimal("1000.10101010101010001010010");
        BigDecimal d = new BigDecimal("10.1");
        BigDecimal e = c.subtract(d);
        System.out.println(e);
    }
}
