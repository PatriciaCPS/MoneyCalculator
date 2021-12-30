
package moneycalculator.Persistence;

import java.util.ArrayList;
import moneycalculator.Model.Currency;

public interface CurrencyLoader {
    ArrayList<Currency>loadAllCurrency();
}
