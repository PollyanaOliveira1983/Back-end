package services;

import entities.Employee;

public class SalaryService {
    private TaxService taxService;
    private PensionService pensionService;

    public  SalaryService(TaxService taxService, PensionService pensionService) {
        this.taxService = taxService;
        this.pensionService = pensionService;
    }
    public double netSalary(Employee employee) {
        return employee.getGrossSalary() - taxService.tax(employee.getGrossSalary())
                - pensionService.discount(employee.getGrossSalary());
    }
}
