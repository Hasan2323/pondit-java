package two;

/**
 * @Author Muhammad Saimon
 * @since Jul 7/18/20 1:42 PM
 */

public class BankAccount {

    private String bankAccType;
    private String bankAccName;
    private String bankAccNumber;
    private long currentBalance;
    private String bankName;
    private String branchName;

    public BankAccount(String bankAccType, String bankAccName, String bankAccNumber, long currentBalance, String bankName, String branchName) {
        this.bankAccType = bankAccType;
        this.bankAccName = bankAccName;
        this.bankAccNumber = bankAccNumber;
        this.currentBalance = currentBalance;
        this.bankName = bankName;
        this.branchName = branchName;
    }

    public BankAccount() {
    }

    public String getBankAccType() {
        return bankAccType;
    }

    public void setBankAccType(String bankAccType) {
        this.bankAccType = bankAccType;
    }

    public String getBankAccName() {
        return bankAccName;
    }

    public void setBankAccName(String bankAccName) {
        this.bankAccName = bankAccName;
    }

    public String getBankAccNumber() {
        return bankAccNumber;
    }

    public void setBankAccNumber(String bankAccNumber) {
        this.bankAccNumber = bankAccNumber;
    }

    public long getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(long currentBalance) {
        this.currentBalance = currentBalance;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }
}
