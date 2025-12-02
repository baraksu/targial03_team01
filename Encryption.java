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
    public static void countWords(String sentence, int wordsSoFar) {
        sentence = sentence.trim();
        if (sentence.isEmpty()) {
            System.out.println("מספר המילים במשפט: " + wordsSoFar);
            return;
        }
        if (wordsSoFar >= 3 && sentence.contains(" ")) {
            System.out.println("שגיאה: אסור להכניס יותר מ-3 מילים");
            return;
        }
        int firstSpaceIndex = sentence.indexOf(' ');
        if (firstSpaceIndex == -1) {
            wordsSoFar++;
            if (wordsSoFar > 3) {
                System.out.println("שגיאה: אסור להכניס יותר מ-3 מילים");
            } else {
                System.out.println("מספר המילים במשפט: " + wordsSoFar);
            }
            return;
        }
        String remaining = sentence.substring(firstSpaceIndex + 1);
        countWords(remaining, wordsSoFar + 1);
    }
    public static String shiftWordsRight(String sentence, int shiftCount) {
        sentence = sentence.trim();
        if (sentence.isEmpty() || shiftCount <= 0)
            return sentence;
        int lastSpaceIndex = sentence.lastIndexOf(' ');
        if (lastSpaceIndex == -1 || shiftCount == 0)
            return sentence;
        String lastWord = sentence.substring(lastSpaceIndex + 1);
        String remainingSentence = sentence.substring(0, lastSpaceIndex);
        return shiftWordsRight(lastWord + " " + remainingSentence, shiftCount - 1);
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

}
