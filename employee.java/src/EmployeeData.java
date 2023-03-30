import java.util.ArrayList;

public class EmployeeData {
    private ArrayList<Employee> employees;

    public EmployeeData() {
        employees = new ArrayList<Employee>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public Employee getEmployeeByNip(int nip) {
        for (Employee employee : employees) {
            if (employee.getNip() == nip) {
                return employee;
            }
        }
        return null;
    }
}
