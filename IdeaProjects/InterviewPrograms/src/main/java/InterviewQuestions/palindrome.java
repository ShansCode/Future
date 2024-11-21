package InterviewQuestions;

public class palindrome {
    public static void main(String[] args){
        String s="SaS";
        String a=reversedString(s);

        if(s.equalsIgnoreCase(a)){
            System.out.println("palindrome");
        }
        System.out.println(a);
    }
    public static String reversedString(String input){
        StringBuffer reversed=new StringBuffer();
        for(int i=input.length()-1;i>=0;i--){
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }
}
