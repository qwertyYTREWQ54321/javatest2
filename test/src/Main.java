import java.util.Locale;


public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Иванов Иван", 1500),
                new Employee("Петров Петр", 2000),
                new Employee("Сидоров Сидор", 1000)
        };
        //Locale locale = new Locale("ru", "RU"); // локаль для русской версии отчета

        Locale locale2 = new Locale("en", "EN");
        //FullReport.generateFullReport(employees, locale);
        FullReport.generateFullReport(employees, locale2);
    }
}