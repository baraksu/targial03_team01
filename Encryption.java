import java.util.*;
public class Encryption{
    public static void main(String[] args){
        Scanner reader=new Scanner(System.in);
        System.out.println("Welcome to the Encryption / Decryption Programn\n Enter 1 for Encrypt | 2 for Decrypt");
        int choose=reader.nextInt();
        reader.nextLine();
        if(choose==1){
            System.out.println("Enter up to 3 words sentence");
            String str=reader.nextLine();
            int senLength=countWords(str);
            str=shiftWordsRight(str,senLength);
            str=charright(str);
            str=replace(str);
            System.out.println("The encrypted sentence:"+str);
        }else if(choose==2){
            System.out.println("sentence words 3 to up Enter");
            String str=reader.nextLine();
            int senLength=countWords(str);
            str=replace1(str);
            str=movingLetters(str);
            str=shiftWordsLeft(str,senLength);
            System.out.println("The decrypted sentence:"+str);
        }else{
            System.out.println(choose+" is not a valid choice");
        }
    }

    public static int countWords(String sentence){//eytan zylberg
        if(sentence==null||sentence.trim().isEmpty())return 0;
        sentence=sentence.trim().replaceAll("\\s+"," ");
        int firstSpace=sentence.indexOf(' ');
        if(firstSpace==-1)return 1;
        int secondSpace=sentence.indexOf(' ',firstSpace+1);
        if(secondSpace==-1)return 2;
        int thirdSpace=sentence.indexOf(' ',secondSpace+1);
        if(thirdSpace==-1)return 3;
        System.out.println(sentence+" contains more than 3 words");
        return -1;
    }

    public static String shiftWordsRight(String str,int senLength){//eytan zylberg
        str=str.trim().replaceAll("\\s+"," ");
        if(senLength==1)return str;
        if(senLength==2){
            int space=str.indexOf(" ");
            return str.substring(space+1)+" "+str.substring(0,space);
        }
        int lastSpace=str.lastIndexOf(" ");
        return str.substring(lastSpace+1)+" "+str.substring(0,lastSpace);
    }

    public static String shiftWordsLeft(String str,int senLength){
        str=str.trim().replaceAll("\\s+"," ");
        if(senLength==1)return str;
        if(senLength==2){
            int space=str.indexOf(" ");
            return str.substring(space+1)+" "+str.substring(0,space);
        }
        int firstSpace=str.indexOf(" ");
        return str.substring(firstSpace+1)+" "+str.substring(0,firstSpace);
    }

    public static String charright(String str){
        int length1 = str.length();
        int d = str.indexOf(" ");
        int x = str.lastIndexOf(" ");

        str = str.replace("\\s+", " "); 
        str = str.trim();
        str = str.replace(" ", "");
        int length = str.length();
        int diff = length1 - length;
        
        
        if(diff==0){
        String str1 = str.substring(0 , length - 1);
        char one = str.charAt(length - 1);
        String finalStr = one + str1;
        return finalStr;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
        }if(diff == 1){
            String str1 = str.substring(0 , length - 2);
            String str2 = str.substring(length - 2);
            String str3 = str2 + str1;
            String str4 = str3.substring(0 , d);
            String str5 = str3.substring(d);
            String finalStr = str4 + " " + str5;
            return finalStr;
        }else{
            String str1 = str.substring(0 , length - 3);
            String str2 = str.substring(length - 3);
            String str3 = str2 + str1;
            String str4 = str3.substring(0 , d);
            String str5 = str3.substring(d, x);
            String str6 = str3.substring(x);
            String finalStr = str4 + " " + str5 + " " + str6;
            return finalStr;
        }

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
           String str1 = str.substring(2); 
           String str2 = str.substring(0 , 2);
           String str3 = str1 + str2;
           String str4 = str3.substring(0 ,d -1);
           String str5 = str3.substring(d);
           String finalStr = str3.charAt(0) + str4 + " " + str5;
           System.out.println(finalStr);
           return finalStr;
        }
        if (diff == 2){
           String str1 = str.substring(3); 
           String str2 = str.substring(0 , 3);
           String str3 = str1 + str2;
           String str4 = str3.substring(0 , d);
           String str5 = str3.substring(d  , x -2);
           String str6 = str3.substring(x -2 );
           String finalStr = str4 + " " + str5 + " " + str6;
           System.out.println(finalStr);
           return finalStr;
        }
        return str;
    }

    public static String replace(String str){
        str=str.replace('u','&');
        str=str.replace('o','0');
        str=str.replace('i','1');
        str=str.replace('e','#');
        str=str.replace('a','@');
        return str;
    }

    public static String replace1(String str){
        str=str.replace('@','a');
        str=str.replace('0','o');
        str=str.replace('#','e');
        str=str.replace('1','i');
        str=str.replace('&','u');
        return str;
    }
}
