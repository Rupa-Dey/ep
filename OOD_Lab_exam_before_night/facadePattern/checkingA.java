package facadePattern;

public class checkingA implements IAccount{
    private int blnc;


    public checkingA(int amt){
        this.blnc = amt;

    }
    @Override
    public void withdraw(int amt) {
        if(amt>this.blnc){
            System.out.println("insufficient balance");
            return;
        }
        this.blnc-=amt;
        System.out.println("withdraw successfully");
    }
    @Override
    public void transfer(IAccount toAcc, int amt) {
        if(amt>this.blnc){
            System.out.println("insuffient balnc");
            return;
        }
        this.blnc-=amt;
        toAcc.deposit(amt);
        System.out.println("transfer successfully");
        
    }
    @Override
    public void deposit(int amt) {
        this.blnc+=amt;
    }
    
}


