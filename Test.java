//Thinzar Htet 180295461

//The new classes work as per expected. 
//Under the main method of the Test class, each object uses the relevant input values to create an instance of itself.
//For example, the Client object uses client details to create an instance called "client".
//New instances of the Client, Vendor, Project, Invoice and ProjectCostDetails objects are first created.
//Upon success, the PrintInvoice object uses the newly created object instances as input values to create an instance of itself.
//The whole operation is deemed successful when there is an output file containing all of the invoice details generated in the computer.

import java.math.BigDecimal;
import java.time.LocalDate;

public class Test {

    public static void main(String[] args) {
        Client client = new Client("Client Industries", "Bob Thornton", "1 Client Drive, London W1", "5551234", "5551235", "bob.t@clientinc.com");
        Vendor vendor = new Vendor("Vendor Industries", "Tony Stark", "99 Vendor Lane, London E1", "5559876", "5559875", "t.stark@vendorinc.com");
        Project project = new Project(102, "Project 1", "Vend awesome things to Client Industries", LocalDate.now(), LocalDate.now(), 10, new BigDecimal(20), client, vendor);
        Invoice invoice = new Invoice(105, LocalDate.now());
        ProjectCostDetails cost = new ProjectCostDetails(project, true);
        PrintInvoice print = new PrintInvoice(invoice, project, client, vendor, cost);
    }
}
