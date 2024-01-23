package proxyPattern;

import java.util.List;

public class RetailStore {
   public static void main(String[] args) {
    RealW w1 = new RealW();
    w1.stock.put("Biscuit", 10);
    w1.stock.put("tea", 20);
    w1.stock.put("wax", 1);
    w1.stock.put("pesta", 50);

    List<RealW> w = List.of(w1);
    proxyW wp = new proxyW(w);

    Item i1 = new Item("choco");
    Item i2 = new Item("tea");

    Order o1 = new Order(List.of(i1,i2));
    wp.fulfilOder(o1);
   }
    
}
