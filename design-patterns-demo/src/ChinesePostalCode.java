public class ChinesePostalCode {

   /*=======================================================*/
   /* Chinese postal code has the form dddddd, where d is   */
   /* any digit from 0 to 9, that is, 6 digit numbers, e.g. */
   /* 150001. Any number of spaces in the input is allowed. */
   /*=======================================================*/
   public boolean isValidChinesePCode(String pcode) {
      char[] p = toNonBlankCharArray(pcode);

      if (p.length != 6)
         return false;

      for (int i = 0; i < p.length; i++) {
         if (Character.isDigit(p[i]) == false)
            return false;
      }
      return true;
   }

   /*====================================================*/
   /* Get rid of all the spaces from the user input      */
   /*====================================================*/
   public char[] toNonBlankCharArray(String postalCode) {
      int m = 0;
      for (int k = 0; k < postalCode.length(); k++) {
         if (Character.isSpaceChar(postalCode.charAt(k)) == false) {
            m++;
         }
      }
      char[] p = new char[m];
      int n = 0;
      for (int k = 0; k < postalCode.length(); k++) {
         if (Character.isSpaceChar(postalCode.charAt(k)) == false) {
            p[n] = postalCode.charAt(k);
            n++;
         }
      }
      return p;
   }
}
