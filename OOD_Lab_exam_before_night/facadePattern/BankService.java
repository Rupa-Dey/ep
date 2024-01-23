package facadePattern;

import java.util.Hashtable;

public class BankService {
    private Hashtable<Integer,IAccount>bAcc;

    BankService(){
        this.bAcc = new Hashtable<Integer, IAccount>();
    }
    public int createAcc(String type, int amt){
        IAccount newA = null;
        switch (type) {
            case "invest":
                newA = new investA(amt);
                break;

            case "saving":
                newA = new savingA(amt);
            break;

            case "checking":
                newA = new checkingA(amt);
                
                break;
        
            default:
              System.out.println("invalid acc type");
                break;
        }
        if(newA!=null){
            this.bAcc.put(1, newA);
            return 1;
        }

        return -1;

    }
    public void transferMoney(int to, int from, int amt){
        IAccount toA = this.bAcc.get(to);
        IAccount frA = this.bAcc.get(from);
        frA.transfer(toA, amt);

    }

    public void withdrawMoney(int fAcc, int amt){
        IAccount frA = this.bAcc.get(fAcc);
        frA.withdraw(amt);

    }

    
}
