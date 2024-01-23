package statePattern;

public class mainSP {
    public static void main(String[] args) {
        vendingM vm = new vendingM(2);

        vm.insertD();
        vm.dispense();

        vm.dispense();
        vm.ejectD();
    }
    
}
