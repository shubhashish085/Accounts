
package accounts;


public class BasicAccount extends BankAccount{
    public BasicAccount(int x, String str, String str1, String str2, double y,double k,int j){
     super(x, str, str1, str2, y);
    checkbookNo = j;
    countChecks = 1;
    checkAmount = k;
    }
    double checkAmount;
    int countChecks;
    int checkbookNo;


    public void setCountChecks(int countChecks) {
        this.countChecks = countChecks;
    }

    public int getCheckbookNo() {
        return checkbookNo;
    }

    public void setCheckbookNo(int checkbookNo) {
        this.checkbookNo = checkbookNo;
    }
public void view(){
        super.view();
        System.out.println("checkAmount :" + checkAmount);
        System.out.println("countChecks " + countChecks);
        System.out.println("checkbookNo :" + checkbookNo);
        
    }
}
