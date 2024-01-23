package statePattern;

public class outStock implements Istate {
    @Override
    public void insertD(vendingM vm) {
        System.out.println("out of stock. no money inserted");
        
    }
    @Override
    public void ejectD(vendingM vm) {
        System.out.println("no money to return");
        
    }
    @Override
    public void dispense(vendingM vm) {
        System.out.println("out of stock");
        
    }
    
}
