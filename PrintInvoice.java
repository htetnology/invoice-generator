import java.io.PrintWriter;
import java.time.LocalDate;

public class PrintInvoice {

    private Invoice invoice;
    private Project project;
    private Client client;
    private Vendor vendor;
    private ProjectCostDetails cost;

    public PrintInvoice(Invoice invoice, Project project, Client client, Vendor vendor, ProjectCostDetails cost) {
        this.invoice = invoice;
        this.project = project;
        this.client = client;
        this.vendor = vendor;
        this.cost = cost;
        writeToFile();
    }

    public Project getProject() {
        return project;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();

        sb.append("***********************************");
        sb.append("\n");
        sb.append("\t\t\t\t" + vendor.getVendorContactName());
        sb.append("\n");
        sb.append("\t\t\t\t" + vendor.getVendorCompanyName());
        sb.append("\n");
        sb.append("\t\t\t\t" + vendor.getVendorAddress());
        sb.append("\n");
        sb.append("\t\t\t\tp: " + vendor.getVendorPhoneNumber());
        sb.append("\n");
        sb.append("\t\t\t\tf: " + vendor.getVendorFaxNumber());
        sb.append("\n");
        sb.append("\t\t\t\te: " + vendor.getVendorEmailAddress());
        sb.append("\n");
        sb.append("\n\n");
        sb.append("To:");
        sb.append("\n");
        sb.append("\t" + client.getClientContactName());
        sb.append("\n");
        sb.append("\t" + client.getClientCompanyName());
        sb.append("\n");
        sb.append("\t" + client.getClientAddress());
        sb.append("\n\n");
        sb.append("Invoice ID: " + invoice.getId());
        sb.append("\n");
        sb.append("Invoice date: " + formatDateForToString(invoice.getInvoiceDate()));
        sb.append("\n");
        sb.append("Project ID: " + project.getId());
        sb.append("\n");
        sb.append("Project name: " + project.getName());
        sb.append("\n");
        sb.append("Project description: " + project.getDescription());
        sb.append("\n");
        sb.append("Start Date: " + formatDateForToString(project.getStartDate()));
        sb.append("\n");
        sb.append("End Date: " + formatDateForToString(project.getEndDate()));
        sb.append("\n");
        sb.append("Billing rate: " + project.getHourlyRate() + " an hour");
        sb.append("\n");
        sb.append("Number of hours billed: " + project.getHoursBilled());
        sb.append("\n\n");
        sb.append("Sub-total: " + cost.getBaseAmount());
        sb.append("\n");
        sb.append("VAT payable: " + cost.getVatApplicable());
        sb.append("\n");
        sb.append("VAT: " + cost.getVatAmount());
        sb.append("\n\n");
        sb.append("Total: " + cost.getTotalAmount());
        sb.append("\n");
        sb.append("***********************************");

        return sb.toString();
    }

    public void writeToFile() {
        String filename = constructFilename();

        PrintWriter writer = null;
        try {
            writer = new PrintWriter(filename, "UTF-8");
        } catch (Exception e) {
            System.err.println("Something went wrong creating PrintWriter: " + e.getMessage());
        }
        writer.print(this); 
        writer.close();
    }

    private String constructFilename() {
        String clientInfo = client.getClientCompanyName();
        String vendorInfo = vendor.getVendorCompanyName();

        String clientName = clientInfo.replace(' ', '-');
        String vendorName = vendorInfo.replace(' ', '-');

        LocalDate dateString = invoice.getInvoiceDate();
        int id = invoice.getId();

        String filename = dateString + "-invoice-" + id + "-for-" + clientName + "-from-" + vendorName + ".txt";
        return filename;
    }

    private String formatDateForToString(LocalDate d) {
        return String.format("%1$te/%1$tm/%1$tY", d);
    }

    private String formatDateForWritingToDisk(LocalDate d) {
        return String.format("%1$tF", d);
    }

}
