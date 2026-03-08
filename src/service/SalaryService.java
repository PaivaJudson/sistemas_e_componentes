package service;

import entities.Employee;

public class SalaryService {

    private PensionService pensionService;
    private GeralTaxService geralTaxService;

    public SalaryService(PensionService pensionService, GeralTaxService geralTaxService) {
        this.pensionService = pensionService;
        this.geralTaxService = geralTaxService;
    }

    public double netSalary(Employee employee){

        double salary = employee.getGrossSalary();

        return employee.getGrossSalary()
                - geralTaxService.tax(salary)
                - pensionService.discount(salary);
    }
}
