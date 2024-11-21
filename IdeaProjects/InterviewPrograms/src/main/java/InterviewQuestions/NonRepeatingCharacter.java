package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NonRepeatingCharacter {
    public static int num(String str) {
        int[] letterCounts = new int[26];

        for (char c : str.toCharArray()) {
            letterCounts[c - 'a']++;
        }
        for(int i=0;i<str.length();i++){
            if(letterCounts[str.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        String str="abcdbc";
        System.out.println(num(str));
    }

}


