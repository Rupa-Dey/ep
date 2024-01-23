package proxyPattern;

import java.util.Hashtable;

public class RealW implements Iorder{
    Hashtable<String, Integer> stock;

    
    public RealW(){
        this.stock = new Hashtable<>();

    }

    @Override
    public void fulfilOder(Order order) {
        for(Item itm: order.itmL){
            String itmNm = itm.itmN;
            if(stock.get(itmNm)>0 && stock.containsKey(itmNm)){
                stock.put(itmNm, stock.get(itmNm)-1);
                System.out.println("Order is delvered "+itmNm);
            }
            else System.out.println("unavailable product");
        }
    }

    public int currentInventory(Item itm){
        String itmNm = itm.itmN;
        if(stock.containsKey(itmNm)){
            return stock.get(itmNm);
        }
        return 0;
    }
    
}
