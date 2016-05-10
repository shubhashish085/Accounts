package accounts;

public class StudentAccount extends Accounts {

    String institute;
    String status;

    public StudentAccount(int x, String str, String str1, String str2, String ins, String sta) {
        setAccountNumber(x);
        setHolderName(str);
        setHolderType(str1);
        institute = ins;
        status = sta;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public void view(){
        super.view();
        System.out.println("institute :" + institute);
        System.out.println("status :" + status);
        
    }
}
