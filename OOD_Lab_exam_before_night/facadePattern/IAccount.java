package facadePattern;

/**
 * IAccount
 */
public interface IAccount {
    public void withdraw(int amt);
    public void transfer(IAccount toAcc, int amt);
    public void deposit(int amt);
    
    
} 
