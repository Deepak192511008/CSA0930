/*Write a program to reverse a word using loop? (Not to use inbuilt functions) 
Sample Input:  
String: TEMPLE 
Sample Output: 
Reverse String: ELPMET*/

class R192511008 {
    public static void main(String[] args) {
        String str = "TEMPLE";
        String rev = "";

        for(int i = str.length()-1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        System.out.println("Reverse String: " + rev);
    }
}
----------------------------------------------------------------------------------------------------------------------------------------------------------------------
/*Write a program to convent the given string to integer?  
Sample Input:  
String: 1234 
Sample Output: 
Out put String: 1234 */

class R192511008 {
    public static void main(String[] args) {
        String str = "1234";
        int num = 0;

        for(int i=0;i<str.length();i++){
            num = num * 10 + (str.charAt(i) - '0');
        }

        System.out.println("Output: " + num);
    }
}
----------------------------------------------------------------------------------------------------------------------------------------------------------------------
/*Write a program to check the entered user name is valid or not. Get both the inputs from the 
user.*/
import java.util.*;

class R192511008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String user = sc.next();

        if(user.length() >= 5) {
            System.out.println("Valid Username");
        } else {
            System.out.println("Invalid Username");
        }
    }
}
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------


