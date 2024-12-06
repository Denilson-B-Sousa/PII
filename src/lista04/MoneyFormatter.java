package lista04;

import java.text.NumberFormat;
import java.util.Locale;

public class MoneyFormatter {

    NumberFormat currency;
    Locale locale;

    public MoneyFormatter() {
        this.locale = new Locale("pt", "BR");
        this.currency = NumberFormat.getCurrencyInstance(locale);
    }

    public String formatter(double valor) {

        return this.currency.format(valor);
    }


}
