package lista04.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatter {

    private final DateTimeFormatter formatter;

    public DateFormatter(String pattern) {
        this.formatter = DateTimeFormatter.ofPattern(pattern);
    }

    public String format(LocalDate date) {
        return date.format(formatter);
    }
}
