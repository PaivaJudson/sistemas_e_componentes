import entities.Employee;
import service.GeralTaxService;
import service.PensionService;
import service.SalaryService;
import service.TaxService;


void main() {

    Employee employee = new Employee("Leonor", 4000);

    PensionService pensionService = new PensionService();
    GeralTaxService taxService = new TaxService();

    SalaryService salaryService = new SalaryService(pensionService, taxService);

    double netSalary = salaryService.netSalary(employee);
    IO.println("Net Salary: " + netSalary);
}
