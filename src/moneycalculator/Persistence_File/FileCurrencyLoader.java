
package moneycalculator.Persistence_File;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import moneycalculator.Model.Currency;
import java.util.ArrayList;
import java.util.logging.Logger;


public class FileCurrencyLoader {

    private final String filepathname;

    public FileCurrencyLoader(String filepathname) {
        this.filepathname = filepathname;
        
    }
    
    
   
    public ArrayList<Currency> loadAllCurrencies() throws FileNotFoundException{
    
        ArrayList<Currency> arrayList = new ArrayList<Currency>();
        try{
        BufferedReader bufferedReader = new BufferedReader(new FileReader( new File(this.filepathname)));
            
            while(true){
                String line = bufferedReader.readLine();
                
                if (line == null ) break;
                arrayList.add(currencyOf(line));
            
            }
        
        
        }catch (FileNotFoundException ex){
            System.out.println("FileNotFoundException, FileCurrencyLoader :: ");
        } catch (IOException ex) {
            Logger.getLogger("FileNotFoundException, FileCurrencyLoader :: ");
        }
        
        
        
        return arrayList;
    }

    private Currency currencyOf(String line) {
        
        String[]split = line.split(",");
        
        return new Currency(split[0], split[1], split[2]);
        
        
    }
}

