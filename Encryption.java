import java.util.*;
public class Encryption
{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Welcome to the Encryption / Decryption Programn\n Enter 1 for Encrypt | 2 for Decrypt");
        int choose = reader.nextInt();
        if(choose == 1)
            System.out.println("goat");
        else if(choose == 2)
        System.out.println("goat");
        else 
            System.out.println("ERROR - no such option");
    }
  public static int countWords(String sentence) {
    if (sentence == null || sentence.isEmpty()) return 0;
    int firstSpace = sentence.indexOf(' ');
    if (firstSpace == -1) return 1;
    int secondSpace = sentence.indexOf(' ', firstSpace + 1);
    if (secondSpace == -1) return 2;
    int thirdSpace = sentence.indexOf(' ', secondSpace + 1);
    if (thirdSpace == -1) return 3;
    System.out.println(sentence + " contains more than 3 words");
    return -1;
}
     public static String shiftWordsRight(String sentence, int senLength){ 
        if (senLength == 1)
            return sentence;
        else if (senLength == 2){
            String firstWord = sentence.substring(0, sentence.indexOf(" "));
            String lastWord = sentence.substring(sentence.indexOf(" ") + 1);
            return lastWord + " " + firstWord;
        }
        else{
            int indexOfLastSpace = sentence.lastIndexOf(" ");
            String thirdWord = sentence.substring(indexOfLastSpace + 1);
            String besideThirdWord = sentence.substring(0, indexOfLastSpace);
            return thirdWord + " " + besideThirdWord;
        }
    }
   public static String replace(String str){
        str = str.replace('u' , '&');
        str = str.replace('o' , '0');
        str = str.replace('i' , '1');
        str = str.replace('e' , '#');
        str = str.replace('a' , '@');
        return str;
    }
public static String str (String str){
        str = str.replace('@' , 'a');
        str = str.replace('0' , 'o');
        str = str.replace('#' , 'e');
        str = str.replace('1' , 'i');
        str = str.replace('&' , 'u');
        return str;
    }
    public static String shiftLeft(String input) {
    
        if (!input.contains(" ")) {
            return input;
        }

        int firstSpace = input.indexOf(" ");
        int lastSpace = input.lastIndexOf(" ");

       
        if (firstSpace == lastSpace) {
            String first = input.substring(0, firstSpace);
            String second = input.substring(firstSpace + 1);
            return second + " " + first;
        }
        String firstWord = input.substring(0, firstSpace);
        String middle = input.substring(firstSpace + 1); 
        return middle + " " + firstWord;
    }
    public static String movingLetters(String str){
        int length1 = str.length();
        int d = str.indexOf(" ");
        int x = str.lastIndexOf(" ");

        str = str.replace("\\s+", " "); 
        str = str.trim();
        str = str.replace(" ", "");
        int length = str.length();
        int diff = length1 - length;
        
        if (diff == 0){
           str = str.substring(1) + str.charAt(0);
           System.out.println(str);
           return str;
                }
        if (diff == 1){
           str = str.substring(2) + str.charAt(0) + str.charAt(1);
           String str1 = str.substring(0,d);
           String str2 = str.substring(d);
           String finalStr = str1 + " " + str2;
           System.out.println(finalStr);
           return finalStr;
        }
        if (diff == 2){
           str = str.substring(3) + str.charAt(0) + str.charAt(1) + str.charAt(2);
           String str1 = str.substring(0,d);
           String str2 = str.substring(d,x);
           String str3 = str.substring(x);
           String finalStr = str1 + " " + str2 + " " + str3;
           System.out.println(finalStr);
           return finalStr;
        }
        return str;
    }
    public static String charright(String str){

    int first = str.indexOf(" ");
    int last = str.lastIndexOf(" ");
    str = str.replace("\\s+" , " ");
    str = str.trim();
    int length = str.length();
    str = str.replace(" " , "");
    int length1 = str.length();
    int diff = length - length1; 
    if  (diff == 0){
        String str1 = str.substring(0 , length - 1);
        char one = str.charAt(length - 1);
        String finalStr = one + str1;
        System.out.println(finalStr);
        return finalStr;
    }else if(diff == 1){
        String str6 = str.substring(0 , length1 - 2);
        String str5 = str.substring(length1 - 2);
        String str1 = str5 + str6;
        String str2 = str1.substring(0 , first);
        String str3 = str1.substring(first);
        String finalStr = str2 + " " + str3;
        System.out.println(finalStr);
        return finalStr;
    }else if(diff == 2){
        String str1 = str.substring(0 , length1 - 3);
        String str2 = str.substring(length1 - 3);
        String str3 = str2 + str1;
        String str4 = str3.substring(0 , first);
        String str5 = str3.substring(first , last);
        String str6 = str3.substring(last);
        String finalStr = str4 + " " + str5 + " " + str6;
        System.out.println(finalStr);
        return finalStr;
    }
    return str;
}       
    

}
