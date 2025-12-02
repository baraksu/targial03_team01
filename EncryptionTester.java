import static org.junit.Assert.*;
import org.junit.Test;


/**
 * Write a description of class EncryptionTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EncryptionTester
{
        
    
    @Test
    public void test1(){
        
        String result = Encryption.replace("0bc");
        assertEquals("obc",result);
        
    }
    @Test
    public void test2(){
        
        String result = Encryption.replace("@bc");
        assertEquals("abc",result);
        
    }
    @Test
    public void test3(){
        
        String result = Encryption.replace("#bc");
        assertEquals("ebc",result);
        
    }
    @Test
    public void test4(){
        
        String result = Encryption.replace("1bc");
        assertEquals("ibc",result);
        
    }
    @Test
    public void test5(){
        
        String result = Encryption.replace("&bc");
        assertEquals("ubc",result);
        
    }
    @Test
    public void test6(){
        
        String result = Encryption.replace("abu");
        assertEquals("@b&",result);
        
    }
    @Test 
        public void test7(){
            String result = Encryption.replace("onion");
            assertEquals("0n10n",result);
        }
    @Test 
        public void test8(){
            String result = Encryption.replace("eitan");
            assertEquals("#1t@n",result);
        }
    @Test 
        public void test9(){
            String result = Encryption.replace("noam");
            assertEquals("n0@m",result);
        }
    @Test 
        public void test10(){
            String result = Encryption.replace("qreuba");
            assertEquals("qr#&b@",result);
        }
}
