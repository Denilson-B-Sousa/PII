package lista04;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class MoneyFormatter {

    NumberFormat currency;
    Locale locale;

    public MoneyFormatter() {
        this.locale = new Locale("pt", "BR");
        this.currency = NumberFormat.getCurrencyInstance(locale);
    }

    public String currencyFormatter(BigDecimal valor) {

        return this.currency.format(valor);
    }


}
