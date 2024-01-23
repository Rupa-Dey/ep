package statePattern;

public class idleS implements Istate {

    @Override
    public void insertD(vendingM vm) {
        System.out.println("money inserted");
    }
    @Override
    public void ejectD(vendingM vm) {
        System.out.println("no return");
        
    }
    @Override
    public void dispense(vendingM vm) {
        System.out.println("payment is required");
        
    }
}
