import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class ClassOne
{
    public Boolean result = true;
    private String inputString;

    public void setInputString(String inputString) {
        this.inputString = inputString;
    }

    public String getInputString() {
        return inputString;
    }


    public int countWords(){
        int count = 0;
        boolean isWord = false;
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            if (Character.isLetter(c)) {
                if (!isWord) {
                    isWord = true;
                    count++;
                }
            } else {
                isWord = false;
            }
        }
        return count;
    }


    public Boolean checkAnagram(String s1 , String s2){
        HashMap<Character , Integer> s1Map = new HashMap<>();
        HashMap<Character , Integer> s2Map = new HashMap<>();

        if(s1.length() != s2.length()){
            return false;
        }


        //  store occuracy of each character appear in string in HashMap (s1Map)
        char[] strArray = s1.toCharArray();
        for (char c : strArray) {
            if (s1Map.containsKey(c)) {
                s1Map.put(c, s1Map.get(c) + 1);
            }
            else {
                s1Map.put(c, 1);
            }
        }

        // store occuracy of each character appear in string in HashMap (s2Map)
        for(int i = 0; i < s2.length(); ++i){
            Character letter = s2.charAt(i);
            if(s2Map.containsKey(letter)){
                s2Map.put(letter , s2Map.get(letter) + 1);
            }
            else{
                s2Map.put(letter , 1);
            }
        }

        // check these the Anagram
        for (Map.Entry entry : s1Map.entrySet()) {
            if(s2Map.containsKey(entry.getKey()) && s2Map.get(entry.getKey()) == entry.getValue()){
                continue;
            }
            else{
                result = false;
                break;
            }
        }
        return result;
    }


    public String RockPaperScissor(int player1 , int player2){
        String result = "";
        String[] choices = {"rock", "paper", "scissors"};
        String player1Choice = choices[player1];
        String player2Choice = choices[player2];

        if(player1Choice.equals(player2Choice)){
            result = "TIE";
        }
        else if (
                (player1Choice.equals("rock") && player2Choice.equals("scissors")

                || (player1Choice.equals("paper") && player2Choice.equals("rock")

                || (player1Choice.equals("scissors") && player2Choice.equals("paper"))
                )))
        {
            result = "Player one Win";

        }
        else {
            result = "Player two win";
        }

        return result;
    }


    public int reverseArray(int arr[] , int start, int end){
        int temp;
        while (start < end)
        {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr[0];
    }



    public  boolean isIsomorphic(String string1, String string2) {
        if (string1.length() != string2.length()) {
            return false;
        }

        Map<Character, Character> map = new HashMap<>();
        Set<Character> used = new HashSet<>();

        for (int i = 0; i < string1.length(); i++) {
            char sChar = string1.charAt(i);
            char tChar = string2.charAt(i);

            if (map.containsKey(sChar)) {
                if (map.get(sChar) != tChar) {
                    return false;
                }
            } else {
                if (used.contains(tChar)) {
                    return false;
                }
                map.put(sChar, tChar);
                used.add(tChar);
            }
        }

        return true;
    }



}