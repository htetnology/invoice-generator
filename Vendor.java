//Thinzar Htet 180295461

public class Vendor {

    private String vendorCompanyName;
    private String vendorContactName;
    private String vendorAddress;
    private String vendorPhoneNumber;
    private String vendorFaxNumber;
    private String vendorEmailAddress;

    public Vendor(String vendorCompanyName,
            String vendorContactName, String vendorAddress,
            String vendorPhoneNumber, String vendorFaxNumber,
            String vendorEmailAddress) {
        this.vendorCompanyName = vendorCompanyName;
        this.vendorContactName = vendorContactName;
        this.vendorAddress = vendorAddress;
        this.vendorPhoneNumber = vendorPhoneNumber;
        this.vendorFaxNumber = vendorFaxNumber;
        this.vendorEmailAddress = vendorEmailAddress;
    }

    public String getVendorCompanyName() {
        return vendorCompanyName;
    }

    public String getVendorContactName() {
        return vendorContactName;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public String getVendorPhoneNumber() {
        return vendorPhoneNumber;
    }

    public String getVendorFaxNumber() {
        return vendorFaxNumber;
    }

    public String getVendorEmailAddress() {
        return vendorEmailAddress;
    }
}
