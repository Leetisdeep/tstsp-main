
public class Main {

    public static Employee generateEmployee(int id){
        Employee newEmployee = new Employee("lastName"+id,
                                            "middleName"+id, 
                                            "firstName"+id, 
                                            1, 
                                            id*1000
                                            );
        return newEmployee;
    }

    public static Employee[] generateEmployees(int amount){
        Employee[] employees = new Employee[amount];
        for (int i = 0; i < amount; i++) {
            employees[i] = generateEmployee(i);
            employees[i].setId(i);
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
        System.out.println("Затраты "+calculateSpending(storage));
        System.out.println("Сотрудник с наименьшой ЗП "+findMinSalary(storage).toString());
        System.out.println("Сотрудник с наибольшой ЗП "+findMaxSalary(storage).toString());
        System.out.println("Средняя ЗП среди сотрудников "+findAverageSalary(storage));
        printAllNames(storage);
    }
}