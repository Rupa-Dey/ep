package statePattern;

public class hasOne implements Istate{
    @Override
    public void insertD(vendingM vm) {
        System.out.println("already there has one dollar");
        
    }
    @Override
    public void ejectD(vendingM vm) {
        System.out.println("return money");
        vm.doReturn();
        vm.setCurrS(vm.getidleS());
        
    }
    @Override
    public void dispense(vendingM vm) {
        System.out.println("releasing product");
        vm.releaseProduct();
        if(vm.getCnt()>1)
         vm.setCurrS(vm.getidleS());
         else vm.setCurrS(vm.outS());
        
    }
    
}
