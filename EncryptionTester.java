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
        
        String result = Encryption.replace1("0bc");
        assertEquals("obc",result);
        
    }
    @Test
    public void test2(){
        
        String result = Encryption.replace1("@bc");
        assertEquals("abc",result);
        
    }
    @Test
    public void test3(){
        
        String result = Encryption.replace1("#bc");
        assertEquals("ebc",result);
        
    }
    @Test
    public void test4(){
        
        String result = Encryption.replace1("1bc");
        assertEquals("ibc",result);
        
    }
    @Test
    public void test5(){
        
        String result = Encryption.replace1("&bc");
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
           @Test 
        public void test11(){
            int result = Encryption.countWords("i am zylberg");
            assertEquals(3,result);
        }
    @Test 
        public void test12(){
            int result = Encryption.countWords("i am");
            assertEquals(2,result);
        }
    @Test 
        public void test13(){
           int result = Encryption.countWords("i");
            assertEquals(1,result);
        }
    @Test 
        public void test14(){
            int result = Encryption.countWords("");
            assertEquals(0,result);
        }
        @Test 
        public void test15(){
            int result = Encryption.countWords("hello world");
            assertEquals(2,result);
        }
      @Test 
        public void test16(){
            String result = Encryption.shiftWordsLeft("think",1);
            assertEquals("think",result);
        }
    @Test 
        public void test17(){
            String result = Encryption.shiftWordsLeft("banana tomato",2);
            assertEquals("tomato banana",result);
        }
    @Test 
        public void test18(){
            String result = Encryption.shiftWordsLeft("lets go hike",3);
            assertEquals("go hike lets",result);
        }
    @Test 
        public void test19(){
            String result = Encryption.shiftWordsLeft("whats up",2);
            assertEquals("up whats",result);
        }
    @Test 
        public void test20(){
            String result = Encryption.shiftWordsLeft("i am saghi",3);
            assertEquals("am saghi i",result);
        }
 @Test 
        public void test21(){
            String result = Encryption.movingLetters("yakir papkin",2);
            assertEquals("kir papkinya",result);
        }
   @Test 
        public void test22(){
            String result = Encryption.movingLetters("azran",1);
            assertEquals("zrana",result);
        }
    @Test 
        public void test23(){
            String result = Encryption.movingLetters("test",1);
            assertEquals("estt",result);
        } 
    @Test 
        public void test24(){
            String result = Encryption.movingLetters("zilberg",1);
            assertEquals("ilbergz",result);
        } 
    @Test 
        public void test25(){
            String result = Encryption.movingLetters("shagi",1);
            assertEquals("hagis",result);
        } 
                           @Test 
        public void test26(){
            String result = Encryption.shiftWordsRight("sahgi and noam",3);
            assertEquals("noam sahgi and",result);
        }
    @Test 
        public void test27(){
            String result = Encryption.shiftWordsRight("hey zylberg",2);
            assertEquals("zylberg hey",result);
        }
    @Test 
        public void test28(){
            String result = Encryption.shiftWordsRight("roni is gooding",3);
            assertEquals("gooding roni is",result);
        }
    @Test 
        public void test29(){
            String result = Encryption.shiftWordsRight("whatsapp web",2);
            assertEquals("web whatsapp",result);
        }
    @Test 
        public void test30(){
            String result = Encryption.shiftWordsRight("i am steve",3);
            assertEquals("steve i am",result);
        }
    @Test
public void test31(){
    String result=Encryption.charright("abc", 1);
    assertEquals("cab",result);
}
    @Test 
        public void test32(){
            String result = Encryption.charright("eitan" , 1);
            assertEquals("neita",result);
        }
    @Test
public void test33(){
    String result=Encryption.charright("hello" , 1);
    assertEquals("ohell",result);
}
    @Test     
        public void test34(){
            String result = Encryption.charright("yakir" , 1);
            assertEquals("ryaki",result);
        }
    @Test
        public void test35(){
        String result=Encryption.charright("z" , 1);
        assertEquals("z",result);
    }
}
