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
    }
   public static String replace(){
        Scanner reader = new Scanner(System.in);
        String str = reader.next();
        str.replace('u' , '&');
        str.replace('o' , '0');
        str.replace('i' , '1');
        str.replace('e' , '#');
        str.replace('a' , '@');
        return str;
        
    }
public static String str (){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        str = str.replace('@' , 'a');
        str = str.replace('0' , 'o');
        str = str.replace('#' , 'e');
        str = str.replace('1' , 'i');
        str = str.replace('&' , 'u');
        return str;
    }
}
