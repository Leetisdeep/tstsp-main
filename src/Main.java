
public class Main {
    public static void main(String[] args) {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName+" "+firstName+" "+middleName;
        System.out.println("Ф. И. О. сотрудника — "+fullName);
        
        String upperCaseFullName = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — "+upperCaseFullName);
        
        fullName = "Иванов Семён Семёнович";
        String fullNameForSystem = fullName;
        while (fullNameForSystem.contains("ё")) {
            fullNameForSystem=fullNameForSystem.replace('ё','е');
        }
        System.out.println("Данные Ф. И. О. сотрудника — "+fullNameForSystem);
    }

}