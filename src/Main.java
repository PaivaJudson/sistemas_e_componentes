import entities.Employee;
import service.PensionService;
import service.SalaryService;
import service.TaxService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Employee employee = new Employee("Leonor", 4000);
    SalaryService salaryService = new SalaryService();

    double netSalary = salaryService.netSalary(employee);
    IO.println("Net Salary: " + netSalary);

}
