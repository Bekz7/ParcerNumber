package pl.bekz.parserNumber;

public class ConvertStringToInt {
    private Integer NumberInInt;



    public Integer convertingStringToInt(String stringNumber) {
        NumberInInt = null;
     try {
         NumberInInt = Integer.valueOf(stringNumber);
     } catch (NumberFormatException e)
     {
         System.out.println( "Błąd! Podałeś znaki w numerze telefonu" );
     }
     return NumberInInt;
 }
}
