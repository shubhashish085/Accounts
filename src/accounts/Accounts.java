
package accounts;


public abstract class Accounts {

 int accountNumber;
 String holderName;
 String holderType;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public void setHolderType(String holderType) {
        this.holderType = holderType;
    }
    public void view(){
        System.out.println("account Number" + accountNumber);
        System.out.println("holderName" + holderName);
        System.out.println("holderType" + holderType);
    }

    
}
