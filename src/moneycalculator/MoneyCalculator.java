
package moneycalculator;

import java.io.FileNotFoundException;
import moneycalculator.Persistence_File.FileCurrencyLoader;
import moneycalculator.Persistence_File.WebserviceCurrencyLoader;
import java.util.ArrayList;
import moneycalculator.Model.Currency;


public class MoneyCalculator {

    
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        
        
       FileCurrencyLoader fileCurrencyLoader =  
               new FileCurrencyLoader("C:\\Users\\lacue\\Documents\\NetBeansProjects\\MoneyCalculator\\src\\moneycalculator");
       
       /*WebserviceCurrencyLoader webserviceCurrencyLoader =
               new WebserviceCurrencyLoader("...");*/
       
       ArrayList<Currency> loadAllCurrencuesfromfile = fileCurrencyLoader.loadAllCurrencies();
    }
    
}
