package BackEnd;

import java.util.Date;

/**
 * The client class handles the information related to a client or customer of the North Shore Hotel.
 * @Author Zachary Sandness
 */
public class Client {

    private String clientName, clientEmail, clientPhoneNum;


    public Client(String clientName, String clientEmail, String clientPhoneNum) {
        this.clientName = clientName;
        this.clientEmail = clientEmail;
        this.clientPhoneNum = clientPhoneNum;
    }

    public Client() {
        this.clientName = "default";
        this.clientEmail = null;
        this.clientPhoneNum = "000-000-0000";
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

    public void setClientPhoneNum(String clientPhoneNum) {
        this.clientPhoneNum = clientPhoneNum;
    }


    @Override
    public String toString() {
        return "Client{" +
                "clientName='" + clientName + '\'' +
                ", clientEmail='" + clientEmail + '\'' +
                ", clientPhoneNum='" + clientPhoneNum + '\'' +
                '}';
    }
}
