
public class Main {

    public static Employee generateEmployee(int id){
        Employee newEmployee = new Employee();
        newEmployee.setFirstName("firstName"+id);
        newEmployee.setMiddleName("middleName"+id);
        newEmployee.setLastName("lastName"+id);
        newEmployee.setSalary(id * 1000);
        newEmployee.setDepartment(1);
        return newEmployee;
    }

    public static Employee[] generateEmployees(int amount){
        Employee[] employees = new Employee[amount];
        for (int i = 0; i < 10; i++) {
            employees[i] = generateEmployee(i);
        }
        return employees;

    }

    public static void printEmployeesData(Employee[] employees){
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

    public static double calculateSpending(Employee[] employees){
        double spending = 0;
        for (Employee employee : employees) {
            spending += employee.getSalary();
        }
        return spending;
    }

    public static Employee findMinSalary(Employee[] employees){
        Employee minSalaryEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalaryEmployee.getSalary()){
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }

    public static Employee findMaxSalary(Employee[] employees){
        Employee maxSalaryEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalaryEmployee.getSalary()){
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }

    public static double findAverageSalary(Employee[] employees){
        return calculateSpending(employees) / employees.length;
    }

    public static void printAllNames(Employee[] employees){
       for (Employee employee : employees) {
            System.out.println("ФИО - " + employee.getLastName()+" "+employee.getFirstName()+" "+employee.getMiddleName());
        } 
    }

    public static void main(String[] args) {
        Employee[] storage = generateEmployees(10);

        printEmployeesData(storage);
        System.out.println(calculateSpending(storage));
        System.out.println("Сотрудник с наименьшой ЗП "+findMinSalary(storage).toString());
        System.out.println("Сотрудник с наибольшой ЗП "+findMaxSalary(storage).toString());
        System.out.println("Средняя ЗП среди сотрудников "+findAverageSalary(storage));
        printAllNames(storage);
    }
}