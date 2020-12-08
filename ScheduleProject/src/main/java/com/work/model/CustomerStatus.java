public class CustomerStatus {

    private String completionStatus;
    private String urgencyStatus;

    public CustomerStatus() {
    }

    public CustomerStatus(String completionStatus, String urgencyStatus) {
        this.completionStatus = completionStatus;
        this.urgencyStatus = urgencyStatus;
    }

    public void setCompletionStatus(String completionStatus) {
        this.completionStatus = completionStatus;
    }

    public String getCompletionStatus() {
        return completionStatus;
    }

    public void setUrgencyStatus(String urgencyStatus) {
        this.urgencyStatus = urgencyStatus;
    }

    public String getUrgencyStatus() {
        return urgencyStatus;
    }
}
