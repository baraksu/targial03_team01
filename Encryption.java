import java.util.*;
public class Encryption {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Welcome to the Encryption / Decryption Programn\n Enter 1 for Encrypt | 2 for Decrypt");
        int choose = reader.nextInt();
        reader.nextLine();
        if (choose == 1) {
            System.out.println("Enter up to 3 words sentence");
            String str = reader.nextLine();
            int senLength = countWords(str);
            if (senLength > 3) {
                System.out.println("Contains more than 3 words");
                return;
            }
            str = shiftWordsRight(str, senLength);
            str = charright(str, senLength);
            str = replace(str);
            System.out.println("The encrypted sentence:" + str);
        } else if (choose == 2) {
            System.out.println("sentence words 3 to up Enter");
            String str = reader.nextLine();
            int senLength = countWords(str);
            if (senLength > 3) {
                System.out.println("Contains more than 3 words");
                return;
            }
            str = replace1(str);
            str = movingLetters(str, senLength);
            str = shiftWordsLeft(str, senLength);
            System.out.println("The decrypted sentence:" + str);
        } else {
            System.out.println(choose + " is not a valid choice");
        }
    }
    public static int countWords(String sentence) {
    if (sentence == null || sentence.trim().isEmpty()) return 0;
    sentence = sentence.trim().replaceAll("\\s+", " ");
    int firstSpace = sentence.indexOf(' ');
    if (firstSpace == -1) return 1;
    int secondSpace = sentence.indexOf(' ', firstSpace + 1);
    if (secondSpace == -1) return 2;
    int thirdSpace = sentence.indexOf(' ', secondSpace + 1);
    if (thirdSpace == -1) return 3;
    return -1; 
}
    public static String shiftWordsRight(String str, int diff) {
        str = str.trim().replaceAll("\\s+", " ");
        if (diff == 1) return str;
        if (diff == 2) {
            int space = str.indexOf(" ");
            return str.substring(space + 1) + " " + str.substring(0, space);
        }
        if (diff == 3) {
             int firstSpace = str.indexOf(" ");
            int secondSpace = str.indexOf(" ", firstSpace + 1);
            String first = str.substring(0, firstSpace);
            String second = str.substring(firstSpace + 1, secondSpace);
            String third = str.substring(secondSpace + 1);
            return third + " " + first + " " + second;
        }
        return str;
    }
    public static String shiftWordsLeft(String str, int diff) {
        str = str.trim().replaceAll("\\s+", " ");
        if (diff == 1) return str;
        if (diff == 2) {
            int space = str.indexOf(" ");
            return str.substring(space + 1) + " " + str.substring(0, space);
        }
        if (diff == 3) {
            int firstSpace = str.indexOf(" ");
            int secondSpace = str.indexOf(" ", firstSpace + 1);
            String first = str.substring(0, firstSpace);
            String second = str.substring(firstSpace + 1, secondSpace);
            String third = str.substring(secondSpace + 1);
            return second + " " + third + " " + first;
        }
        return str;
    }
    public static String charright(String str, int diff) {
    int length = str.length();
    if (length == 0) return str;
    if (diff == 1 && length >= 1) {
        return str.substring(length - 1) + str.substring(0, length - 1);
    } else if (diff == 2 && length >= 2) {
        return str.substring(length - 2) + str.substring(0, length - 2);
    } else if (diff == 3 && length >= 3) {
        return str.substring(length - 3) + str.substring(0, length - 3);
    }
    return str;
}
public static String movingLetters(String str, int diff) {
    int length = str.length();
    if (length == 0) return str;
    if (diff == 1 && length >= 1) {
        return str.substring(1) + str.substring(0, 1);
    } else if (diff == 2 && length >= 2) {
        return str.substring(2) + str.substring(0, 2);
    } else if (diff == 3 && length >= 3) {
        return str.substring(3) + str.substring(0, 3);
    }
    return str;
}
    public static String replace(String str) {
        str = str.replace("u", "&");
        str = str.replace("o", "0");
        str = str.replace("i", "1");
        str = str.replace("e", "#");
        str = str.replace("a", "@");
        return str;
    }
    public static String replace1(String str) {
        str = str.replace("&", "u");
        str = str.replace("0", "o");
        str = str.replace("1", "i");
        str = str.replace("#", "e");
        str = str.replace("@", "a");
        return str;
    }
}
