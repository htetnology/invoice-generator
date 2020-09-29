public class Client {

    private String clientCompanyName;
    private String clientContactName;
    private String clientAddress;
    private String clientPhoneNumber;
    private String clientFaxNumber;
    private String clientEmailAddress;

    public Client(String clientCompanyName,
            String clientContactName, String clientAddress,
            String clientPhoneNumber, String clientFaxNumber,
            String clientEmailAddress) {
        this.clientCompanyName = clientCompanyName;
        this.clientContactName = clientContactName;
        this.clientAddress = clientAddress;
        this.clientPhoneNumber = clientPhoneNumber;
        this.clientFaxNumber = clientFaxNumber;
        this.clientEmailAddress = clientEmailAddress;
    }

    public String getClientCompanyName() {
        return clientCompanyName;
    }

    public String getClientContactName() {
        return clientContactName;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public String getClientPhoneNumber() {
        return clientPhoneNumber;
    }

    public String getClientFaxNumber() {
        return clientFaxNumber;
    }

    public String getClientEmailAddress() {
        return clientEmailAddress;
    }
}
