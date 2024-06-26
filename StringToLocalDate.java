import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringToLocalDate {
    public static void main(String[] args) {
        String dateString = "2022-07-25";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.parse(dateString, formatter);

        System.out.println("Local Date: " + localDate);
    }
}
