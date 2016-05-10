package accounts;

public class BankAccount extends Accounts {

    public BankAccount(int x, String str, String str1, String str2, double y) {
        setAccountNumber(x);
        setHolderName(str);
        setHolderType(str1);
        bankName = str2;
        balance = y;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    String bankName;
    double balance;

    public void view() {
        super.view();
        System.out.println("institute :" + bankName);
        System.out.println("status :" + balance);

    }
}
