package Climbing.decision_process;

import org.junit.Test;

public class BuyStocksTest {

    @Test
    public void question() {
        BuyStocks obj = new BuyStocks();
        int args[] = {1, 2, 6, 3, 5, 8, 96, 2, 5};
        System.out.println(obj.question(args));
    }
}