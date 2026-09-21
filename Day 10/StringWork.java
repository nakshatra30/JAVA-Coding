public class StringWork {
    public static void main(String[] args) {
        /*String str= "Java Programming";
        // length()-->length of the string
        int len=str.length();
        System.out.println("Length:"+len);
        //charAt()--> to acces the specific character
        char ch=str.charAt(5) ;
        System.out.println("Acces Char:"+ch);
        /*substring(beginindex,Endindex+1)
         in the substring the first index value is same... 
         in case we have to print the n th value .. we have give the last index value as n+1
        String substr=str.substring(5,12);
        System.out.println("SubString:"+substr);
        // to upper case
        System.out.println("Upper Case:"+str.toUpperCase());
        // to lower  case
        System.out.println("LowerCase:"+str.toLowerCase());
        //compare
        boolean isSame=str.equals("java programming");
        System.out.println("Same Compare:"+isSame);

        //TO CHECK CONTENTS
        
        */
       String name="janani";
       boolean isSame=name.equals("janani") ;
       System.out.println("With Case Sensitive:"+isSame);
       //without case sensitive
       boolean isSameCase=name.equalsIgnoreCase("Janani");
       System.out.println("without Case sensitive:"+isSameCase);

    }
}