public class SeperateDuplicates
{
   public static void main(String[] args)
   {
      
      System.out.println(seperateDuplicatesChars("Hello"));
      System.out.println(seperateDuplicatesChars("Bookkeeper"));
      System.out.println(seperateDuplicatesChars("Yellowwood door"));
      System.out.println(seperateDuplicatesChars("Chicago Cubs"));
      
   }
   
   public static String seperateDuplicatesChars(String str)
   {  
      String result = "";
      for(int i=1; i<str.length(); i++)
      {  
         result += str.charAt(i-1);
         if(str.charAt(i) == str.charAt(i-1))
         {
            result += "-";
         }
         
      }
      result += str.charAt(str.length()-1);
      return result;
      
      
     }
   
  }

