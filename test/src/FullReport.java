import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class FullReport {
    //private static final String name = "report";


    public static void generateFullReport(Employee[] employees, Locale locale) {

        ResourceBundle resourceBundle = ResourceBundle.getBundle("report", locale);


        System.out.println(resourceBundle.getString("name")+ "\t\t\t\t\t\t" + resourceBundle.getString( "salary")+"\t\t\t\t");

        //System.out.println(resourceBundle.getString(salary)+ "/t");


        //
        NumberFormat numberFormat = NumberFormat.getNumberInstance(locale);
        for (Employee employee : employees) {
            String formattedSalary = numberFormat.format(employee.getSalary());
            System.out.printf("%-20s %10s%n", employee.getFullname(), formattedSalary);
        }
    }
}

