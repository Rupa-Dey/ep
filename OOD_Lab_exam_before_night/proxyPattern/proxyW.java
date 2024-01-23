package proxyPattern;

import java.util.List;

public class proxyW implements Iorder {
    List<RealW> realWs;
    public proxyW(List<RealW> realWs){
        this.realWs = realWs;
    }
    @Override
    public void fulfilOder(Order order) {
        for(Item itm: order.itmL){
            boolean chkOrder = false;
            String itmNm = itm.itmN;
            for(RealW rw: realWs){
                if(rw.currentInventory(itm)>0){
                    Order o1 = new Order(List.of(itm));
                    rw.fulfilOder(o1);
                    chkOrder = true;
                    break;
                }
            }
            if(!chkOrder) 
              System.out.println("unavailable product "+itmNm);
        }
    }
    
}
 