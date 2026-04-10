package BackEnd;

import java.time.LocalDate;


public class Client {

    private String clientName, clientEmail, clientPhoneNum;
    private LocalDate stayStartDate, stayEndDate;

    public Client(String clientName, String clientEmail, String clientPhoneNum, LocalDate stayStartDate, LocalDate stayEndDate) {
        this.clientName = clientName;
        this.clientEmail = clientEmail;
        this.clientPhoneNum = clientPhoneNum;
        this.stayStartDate = stayStartDate;
        this.stayEndDate = stayEndDate;
    }

    public Client() {
        this.clientName = "default";
        this.clientEmail = null;
        this.clientPhoneNum = "000-000-0000";
        this.stayStartDate = null;
        this.stayEndDate = null;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public String getClientPhoneNum() {
        return clientPhoneNum;
    }

    public void setClientPhoneNum(String clieatPhoneNum) {
        this.clientPhoneNum = clientPhoneNum;
    }

    public LocalDate getStayStartDate() {
        return stayStartDate;
    }

    public void setStayStartDate(LocalDate stayStartDate) {
        this.stayStartDate = stayStartDate;
    }

    public LocalDate getStayEndDate() {
        return stayEndDate;
    }

    public void setStayEndDate(LocalDate stayEndDate) {
        this.stayEndDate = stayEndDate;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientName='" + clientName + '\'' +
                ", clientEmail='" + clientEmail + '\'' +
                ", clientPhoneNum='" + clientPhoneNum + '\'' +
                ", stayStartDate=" + stayStartDate +
                ", stayEndDate=" + stayEndDate +
                '}';
    }
}
