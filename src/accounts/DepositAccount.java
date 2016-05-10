
package accounts;


public class DepositAccount extends BankAccount{
    public DepositAccount(int x, String str, String str1, String str2, double y,double k){
    super(x, str, str1, str2, y);
    depositAmount = k;
    countChecks = 0;
    
    }
    double depositAmount;
    int countChecks;

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public int getCountChecks() {
        return countChecks;
    }

    public void setCountChecks(int countChecks) {
        this.countChecks = countChecks;
    }
public void view(){
        super.view();
        System.out.println("institute :" + depositAmount);
        System.out.println("status :" + countChecks);
        
    }
}
