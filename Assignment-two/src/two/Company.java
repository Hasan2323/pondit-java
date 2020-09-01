package two;

import java.util.List;

/**
 * @Author Muhammad Saimon
 * @since Jul 7/18/20 1:34 PM
 */

public class Company {
    private long companyBankAcc;

    private List<Employee> employees;

    public Company(long companyBankAcc, List<Employee> employees) {
        this.companyBankAcc = companyBankAcc;
        this.employees = employees;
    }

    public Company() {
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public long getCompanyBankAcc() {
        return companyBankAcc;
    }

    public void setCompanyBankAcc(long companyBankAcc) {
        this.companyBankAcc = companyBankAcc;
    }


}
