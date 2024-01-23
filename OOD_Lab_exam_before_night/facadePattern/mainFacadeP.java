package facadePattern;

public class mainFacadeP {
    public static void main(String[] args) {
        BankService bankService = new BankService();

        int mySavA = bankService.createAcc("saving", 1000);

        int checkA = bankService.createAcc("checking", 100 );
        
        bankService.withdrawMoney(mySavA, 1200);
        bankService.transferMoney(checkA, mySavA, 50);
    }
}


