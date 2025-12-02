import java.util.*;
public class Encryption
{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Welcome to the Encryption / Decryption Programn\n Enter 1 for Encrypt | 2 for Decrypt");
        int choose = reader.nextInt();
        reader.nextLine();
        if(choose == 1){
            System.out.println("Enter up to 3 words sentence");
            String str = reader.nextLine();
            int senLength = Encryption.countWords(str);
            str = Encryption.shiftWordsRight(str , senLength);
            str = Encryption.charright(str);
            str = Encryption.replace(str);
            System.out.println("The encrypted sentence:" +str);
        }else if(choose == 2){
            System.out.println("sentence words 3 to up Enter");
            String str = reader.nextLine();
            int senLength = Encryption.countWords(str);
            str = Encryption.replace1(str);
            str = Encryption.movingLetters(str);
            str = Encryption.shiftLeft(str);
            System.out.println("The decrypted sentence:" +str);
        }   else {
            System.out.println(choose + "is not a valid choice");
            return;
        }
    }
  public static int countWords(String sentence) {//eytan zylberg
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
     public static String shiftWordsRight(String str , int senLength){ //eytan zylberg
        if (senLength == 1)
            return str;
        else if (senLength == 2){
            String firstWord = str.substring(0, str.indexOf(" "));
            String lastWord = str.substring(str.indexOf(" ") + 1);
            return lastWord + " " + firstWord;
        }
        else{
            int indexOfLastSpace = str.lastIndexOf(" ");
            String thirdWord = str.substring(indexOfLastSpace + 1);
            String besideThirdWord = str.substring(0, indexOfLastSpace);
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
public static String replace1(String str){
        str = str.replace('@' , 'a');
        str = str.replace('0' , 'o');
        str = str.replace('#' , 'e');
        str = str.replace('1' , 'i');
        str = str.replace('&' , 'u');
        return str;
    }
public static String shiftWordsLeft(String str, int senLength) {
    if (senLength == 1)
        return str;
      if (senLength == 2) {
        int space = str.indexOf(" ");
        String first = str.substring(0, space);
        String second = str.substring(space + 1);
        return second + " " + first;
    }
    int firstSpace = str.indexOf(" ");
    String firstWord = str.substring(0, firstSpace);
    String afterFirst = str.substring(firstSpace + 1);
    return afterFirst + " " + firstWord;
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
           
           return str;
                }
        if (diff == 1){
           str = str.substring(2) + str.charAt(0) + str.charAt(1);
           String str1 = str.substring(0,d);
           String str2 = str.substring(d);
           String finalStr = str1 + " " + str2;
           
           return finalStr;
        }
        if (diff == 2){
           str = str.substring(3) + str.charAt(0) + str.charAt(1) + str.charAt(2);
           String str1 = str.substring(0,d);
           String str2 = str.substring(d,x);
           String str3 = str.substring(x);
           String finalStr = str1 + " " + str2 + " " + str3;
           
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
        
        return finalStr;
    }else if(diff == 1){
        String str6 = str.substring(0 , length1 - 2);
        String str5 = str.substring(length1 - 2);
        String str1 = str5 + str6;
        String str2 = str1.substring(0 , first);
        String str3 = str1.substring(first);
        String finalStr = str2 + " " + str3;
        
        return finalStr;
    }else if(diff == 2){
        String str1 = str.substring(0 , length1 - 3);
        String str2 = str.substring(length1 - 3);
        String str3 = str2 + str1;
        String str4 = str3.substring(0 , first);
        String str5 = str3.substring(first , last);
        String str6 = str3.substring(last);
        String finalStr = str4 + " " + str5 + " " + str6;
        
        return finalStr;
    }
    return str;
}       
    

}
