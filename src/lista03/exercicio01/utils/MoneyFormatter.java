package lista03.exercicio01.utils;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class MoneyFormatter {

    private final NumberFormat currencyFormatter;

    public MoneyFormatter() {
        Locale locale = new Locale("pt", "BR");
        this.currencyFormatter = NumberFormat.getCurrencyInstance(locale);
    }

    public String format(BigDecimal value) {
        return currencyFormatter.format(value);
    }
}
