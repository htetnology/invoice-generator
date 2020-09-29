import java.math.BigDecimal;

public class ProjectCostDetails {

    private static final BigDecimal VAT_RATE = new BigDecimal(5); 
    private boolean vatApplicable; 
    private BigDecimal totalAmount; 
    private BigDecimal vatAmount; 
    private BigDecimal baseAmount; 

    private Project project;

    public ProjectCostDetails(Project project, boolean vatApplicable) {
        this.project = project;
        this.vatApplicable = vatApplicable;

        calculateTotal();
    }

    public Project getProject() {
        return project;
    }

    public boolean getVatApplicable() {
        return vatApplicable;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public BigDecimal getVatAmount() {
        return vatAmount;
    }

    public BigDecimal getBaseAmount() {
        return baseAmount;
    }

    private void calculateTotal() {
        BigDecimal hourlyRate = project.getHourlyRate();
        BigDecimal hours = new BigDecimal(project.getHoursBilled()); 
        this.baseAmount = hourlyRate.multiply(hours);
        if (vatApplicable) {
            vatAmount = baseAmount.divide(VAT_RATE);
        } else {
            vatAmount = new BigDecimal(0);
        }
        totalAmount = baseAmount.add(vatAmount);
    }
}
