/* Object Adapter: adapts ChinesePostalCode to the ZipCodeValidator
   interface by holding a reference to a ChinesePostalCode object
   (object composition), so the client only sees isValidZipCode(). */
public class ChinesePostalCodeAdapter implements ZipCodeValidator {

   private ChinesePostalCode objChPCode;

   public ChinesePostalCodeAdapter(ChinesePostalCode pCode) {
      objChPCode = pCode;
   }

   public boolean isValidZipCode(String zip, String state) {
      return objChPCode.isValidChinesePCode(zip);
   }
}// end of class
