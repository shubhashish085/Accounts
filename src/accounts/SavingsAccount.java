package accounts;

public class SavingsAccount extends BankAccount {

    double depositAmount;
    double withdrawalAmount;
    int passbookNo;
    float rateInterest = (float) 0.06;
    float Interest;

    public SavingsAccount(int x, String str, String str1, String str2, double y, double d, double withdraw, int k) {
        super(x, str, str1, str2, y);
        depositAmount = d;
        withdrawalAmount = withdraw;
        passbookNo = k;
        setBalance(getBalance() + depositAmount - withdrawalAmount);
        
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public void setWithdrawalAmount(double withdrawalAmount) {
        this.withdrawalAmount = withdrawalAmount;
    }

    public void setPassbookNo(int passbookNo) {
        this.passbookNo = passbookNo;
    }

    public void setRateInterest(float rateInterest) {
        this.rateInterest = rateInterest;
    }

    public void view() {
        super.view();
        System.out.println(" depositAmount :" + depositAmount);
        System.out.println(" withdrawalAmount :" + withdrawalAmount);

    }

}
