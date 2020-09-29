import java.io.PrintWriter;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Invoice {

    private int id;
    private LocalDate invoiceDate;

    public Invoice(int id, LocalDate invoiceDate) {
        this.id = id;
        this.invoiceDate = invoiceDate;
    }

    public int getId() {
        return id;
    }

    public LocalDate getInvoiceDate() {
        return invoiceDate;
    }
}
