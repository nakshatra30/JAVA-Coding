public class RemoveSpace {
    public static void main(String[] args) {
        String str = "How are you?";

        //APPROACH - 1 -> USING REPLACE
        String strReplace = str.replace(" ","");
        System.out.println("After Replacement: "+strReplace);

        //APPROACH - 2 -> USING FOR LOOP
        String newString = "";
        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            if(ch != ' '){
                newString = newString + ch;
            }
        }
        System.out.println("After remove space: "+newString);
    }
    
}
