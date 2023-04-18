import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestClassOne {
    ClassOne one = new ClassOne();
    @Test
    public void testAnagram(){

        assertEquals(true,  one.checkAnagram("coder" , "coder"));
        assertEquals(false,  one.checkAnagram("hello" , "paper"));
        assertEquals(true,  one.checkAnagram("title" , "tleti"));
    }


    @Test
    public void testRockPaperScissors(){
        assertEquals("Player one Win" , one.RockPaperScissor(0 ,2));
        assertEquals("Player one Win" , one.RockPaperScissor(1 ,0));
        assertEquals("Player two win" , one.RockPaperScissor(0 ,1));
    }

    @Test
    public void testReverseArray(){
        int arr[] = {1,2,3};
        assertEquals( arr[arr.length-1], one.reverseArray(arr,0,2));
    }

    @Test
    public void testCountWord(){
        one.setInputString("Hey !, I love Java");
        assertEquals(4 , one.countWords());
    }

    @Test
    public void testIsomorphic(){

        assertEquals(true , one.isIsomorphic("paper", "title"));
        assertEquals(false, one.isIsomorphic("foo" , "bar"));
    }
}
