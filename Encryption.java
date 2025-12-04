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
            if(senLength==-1)return;
            str=shiftWordsRight(str,senLength);
            str=charright(str);
            str=replace(str);
            System.out.println("The encrypted sentence:"+str);
        }else if(choose==2){
            System.out.println("sentence words 3 to up Enter");
            String str=reader.nextLine();
            int senLength=countWords(str);
            if(senLength==-1)return;
            str=replace1(str);
            str=movingLetters(str);
            str=shiftWordsLeft(str,senLength);
            System.out.println("The decrypted sentence:"+str);
        }else{
            System.out.println(choose+" is not a valid choice");
        }
    }

    public static int countWords(String sentence){
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

    public static String shiftWordsRight(String str,int senLength){
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
        str=str.trim().replaceAll("\\s+"," ");
        int firstSpace=str.indexOf(" ");
        int lastSpace=str.lastIndexOf(" ");
        if(firstSpace==-1)return str.substring(str.length()-1)+str.substring(0,str.length()-1);

        if(lastSpace==firstSpace){
            String word1=str.substring(0,firstSpace);
            String word2=str.substring(firstSpace+1);
            word1=word1.substring(word1.length()-1)+word1.substring(0,word1.length()-1);
            word2=word2.substring(word2.length()-1)+word2.substring(0,word2.length()-1);
            return word1+" "+word2;
        }else{
            String word1=str.substring(0,firstSpace);
            String word2=str.substring(firstSpace+1,lastSpace);
            String word3=str.substring(lastSpace+1);
            word1=word1.substring(word1.length()-1)+word1.substring(0,word1.length()-1);
            word2=word2.substring(word2.length()-1)+word2.substring(0,word2.length()-1);
            word3=word3.substring(word3.length()-1)+word3.substring(0,word3.length()-1);
            return word1+" "+word2+" "+word3;
        }
    }

    public static String movingLetters(String str){
        str=str.trim().replaceAll("\\s+"," ");
        int firstSpace=str.indexOf(" ");
        int lastSpace=str.lastIndexOf(" ");
        if(firstSpace==-1)return str.substring(1)+str.charAt(0);

        if(lastSpace==firstSpace){
            String word1=str.substring(0,firstSpace);
            String word2=str.substring(firstSpace+1);
            word1=word1.substring(1)+word1.charAt(0);
            word2=word2.substring(1)+word2.charAt(0);
            return word1+" "+word2;
        }else{
            String word1=str.substring(0,firstSpace);
            String word2=str.substring(firstSpace+1,lastSpace);
            String word3=str.substring(lastSpace+1);
            word1=word1.substring(1)+word1.charAt(0);
            word2=word2.substring(1)+word2.charAt(0);
            word3=word3.substring(1)+word3.charAt(0);
            return word1+" "+word2+" "+word3;
        }
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
