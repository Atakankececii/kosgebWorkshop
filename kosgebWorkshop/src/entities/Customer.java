package entities;

import java.util.List;

public class Customer extends User{
    private String customerNumber;
    private List<ApplicationStatus> applicationStatuses;

public Customer(){

}

    public Customer(int id, String email, String password, List<AuthorityOfUser> authorityOfUsers, String customerNumber, List<ApplicationStatus> applicationStatuses) {
        super(id, email, password, authorityOfUsers);
        this.customerNumber = customerNumber;
        this.applicationStatuses = applicationStatuses;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public List<ApplicationStatus> getApplicationStatuses() {
        return applicationStatuses;
    }

    public void setApplicationStatuses(List<ApplicationStatus> applicationStatuses) {
        this.applicationStatuses = applicationStatuses;
    }
}
