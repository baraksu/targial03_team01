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
        
        int result = Encryption.add(2,3);
        assertEquals(5,result);
        
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
    public void testAdd(){
        
        String result = Encryption.replace("abu");
        assertEquals("@b&",result);
        
    }
    @Test 
        public void test2(){
            String result = Encryption.replace("onion");
            assertEquals("0n10n",result);
        }
    
}
