import entities.Employee;
import service.PensionService;
import service.SalaryService;
import service.TaxService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Employee employee = new Employee("Leonor", 4000);

    PensionService pensionService = new PensionService();
    TaxService taxService = new TaxService();

    SalaryService salaryService = new SalaryService(pensionService, taxService);

    double netSalary = salaryService.netSalary(employee);
    IO.println("Net Salary: " + netSalary);

}
