import java.util.Scanner;

class PalindromeReverse {
    public  static void  main(String[] args) {
        String reverseString = palindromeReverse();
    }
    public static String palindromeReverse(){
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String reverseString = "";
        int index = string.length()-1;
        while (index>-1){
            reverseString += string.substring(index,index+1);
            index--;
        }
        System.out.println(reverseString);
        if(string.equals(reverseString)){
            System.out.println("It is a palindrome");
        }else System.out.println("It is not a palindrome");
        return reverseString;
    }
}