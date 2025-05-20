import java.util.Objects;

public class Employee {
    private String lastName; // фамилия
    private String middleName; // оче
    private String firstName; // имя
    private int department;
    private int salary;
    private static int id;

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getDepartment() {
        return this.department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Employee)) {
            return false;
        }
        Employee employee = (Employee) o;
        return Objects.equals(lastName, employee.lastName) && Objects.equals(middleName, employee.middleName) && Objects.equals(firstName, employee.firstName) && department == employee.department && salary == employee.salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, middleName, firstName, department, salary);
    }


    @Override
    public String toString() {
        return "{" +
            " lastName='" + getLastName() + "'" +
            ", middleName='" + getMiddleName() + "'" +
            ", firstName='" + getFirstName() + "'" +
            ", department='" + getDepartment() + "'" +
            ", salary='" + getSalary() + "'" +
            "}";
    }


}