
public class Customer {

    private String firstName;
    private String lastName;
    private CustomerDates projectDate;
    private String status;

    public Customer(String firstName, String lastName, CustomerDates projectDate, String status) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.projectDate = projectDate;
        this.status = status;
    }

    public Customer() {
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setProjectDate(CustomerDates projectDate) {
        this.projectDate = projectDate;
    }

    public CustomerDates getProjectDate() {
        return projectDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}