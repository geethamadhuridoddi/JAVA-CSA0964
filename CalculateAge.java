import java.time.LocalDate;
import java.time.Period;

public class CalculateAge {
    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(2005, 10, 13);

        LocalDate currentDate = LocalDate.now();

        Period period = Period.between(birthDate, currentDate);
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();

        System.out.println("Age: " + years + " years, " + months + " months, " + days + " days");
    }
}