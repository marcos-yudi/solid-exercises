package isp;

public class FinancialReportService implements ReportGenerator {
    @Override
    public void generateReport() {
        System.out.println("Gerando relatório financeiro...");
    }
}