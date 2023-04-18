import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class TestPhoneBook {
//    @Test
//    public void testName(){
//        PhoneBook phoneBook = new PhoneBook();
//        phoneBook.addName("Ahtasham" , "+923487114127");
//
//        assertEquals("+923487114127" , phoneBook.searchName("Ahtasham"));
//    }
//    @Test
//    public void testConsistance(){
//        PhoneBook phoneBook = new PhoneBook();
//        phoneBook.addName("Ahtasham" , "+923487114126");
//        phoneBook.addName("Ali" , "+923487114128");
//        phoneBook.addName("Zeeshan" , "+923487114126");
//
//        assertEquals(false , phoneBook.isConsistance("Ahtasham"));
//    }
//
//    @Test
//    public void testEmptySet(){
//
//    }
    static List<Object[]> testPhoneData()
    {
        return Arrays.asList(new Object[][]
                {
                        {"true" , "ali"},
                        {"false" , "Ahtasham"},
                });
    }

    public void testPhoneBook(String expected , String name , String number){
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addName("Ahtasham" , "+923487114126");
        phoneBook.addName("Ali" , "+923487114128");
        phoneBook.addName("Zeeshan" , "+923487114126");
        assertEquals(expected , phoneBook.isConsistance(name));
    }

}
