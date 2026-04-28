//Full Diamond Pattern
import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 🔺 Upper pyramid
        for(int i=1;i<=n;i++){

            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }

            System.out.println();
        }

        // 🔻 Inverted pyramid
        for(int i=n-1;i>=1;i--){

            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
5
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Right Triangle
import java.util.*;
class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("  *");
            }
            System.out.println();
        }
    }
}

5
  *
  *  *
  *  *  *
  *  *  *  *
  *  *  *  *  *
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Pascal Triangle
class R192511008 {
    public static void main(String[] args) {

        int n = 5;

        for(int i=0;i<n;i++){
            int num = 1;
            for(int j=0;j<=i;j++){
                System.out.print(num+" ");
                num = num * (i-j)/(j+1);
            }
            System.out.println();
        }
    }
}
1 
1 1 
1 2 1 
1 3 3 1 
1 4 6 4 1 
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Diamond Number Pattern
class R192511008 {
    public static void main(String[] args) {

        int n = 4;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }

        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
1 
2 2 
3 3 3 
4 4 4 4 
3 3 3 
2 2 
1 

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Full Pyramid
 import java.util.*;
class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
} 
5
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//3. Inverted Pyramid
import java.util.*;
class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
5
* * * * * 
* * * * 
* * * 
* * 
* 
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//4. Hollow Square
import java.util.*;
class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==1 || i==n || j==1 || j==n)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
6
******
*    *
*    *
*    *
*    *
******
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//LCM & GCD (2 numbers simple)
class R192511008 {
    public static void main(String[] args) {

        int a = 16, b = 20;
        int gcd = 1;

        for(int i=1;i<=a && i<=b;i++){
            if(a%i==0 && b%i==0){
                gcd = i;
            }
        }

        int lcm = (a*b)/gcd;

        System.out.println("GCD = " + gcd);
        System.out.println("LCM = " + lcm);
    }
}
GCD = 4
LCM = 80
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Sum of Digits (single digit)
class R192511008 {
    public static void main(String[] args) {

        int num = 143;

        while(num >= 10){
            int sum = 0;

            while(num > 0){
                sum += num%10;
                num /= 10;
            }

            num = sum;
        }

        System.out.println("Result = " + num);
    }
}
Result = 8
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Multiplication Table
class R192511008 {
    public static void main(String[] args) {

        int m=4, n=5;

        for(int i=1;i<=n;i++){
            System.out.println(i+" x "+m+" = "+(i*m));
        }
    }
}
1 x 4 = 4
2 x 4 = 8
3 x 4 = 12
4 x 4 = 16
5 x 4 = 20
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//5. Factorial
import java.util.*;
class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = 1;

        for(int i=1;i<=n;i++)
        {
            f = f * i;
        }

        System.out.println(f);
    }
}
5
120
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//6. Fibonacci
import java.util.*;
class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0, b = 1;

        for(int i=1;i<=n;i++)
        {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
8
0 1 1 2 3 5 8 13 
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//7. Reverse Number
import java.util.*;
class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = 0;

        while(n > 0)
        {
            r = r * 10 + n % 10;
            n = n / 10;
        }

        System.out.println(r);
    }
}
1234567
7654321
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//8. Armstrong
import java.util.*;
class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = n, s = 0;

        while(n > 0)
        {
            int d = n % 10;
            s = s + d*d*d;
            n = n / 10;
        }

        if(s == t)
            System.out.println("Armstrong");
        else
            System.out.println("Not");
    }
}
153
Armstrong
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//9. Perfect Number
import java.util.*;
class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 0;

        for(int i=1;i<n;i++)
        {
            if(n % i == 0)
            {
                s = s + i;
            }
        }

        if(s == n)
            System.out.println("Perfect");
        else
            System.out.println("Not");
    }
}
6
Perfect
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//10. Leap Year
import java.util.*;
class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();

        if((y%4==0 && y%100!=0) || y%400==0)
        {
            System.out.println("Leap");
        }
        else
        {
            System.out.println("Not");
        }
    }
}
2020
Leap
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//11. Reverse String
import java.util.*;
class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        for(int i=s.length()-1;i>=0;i--)
        {
            System.out.print(s.charAt(i));
        }

        
    }
}
deepak
kapeed
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//12. Count Vowels
import java.util.*;
class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int c = 0;

        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
               ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                c++;
            }
        }

        System.out.println(c);
    }
}
hibye hsdhsweee
5
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Find Character Index
import java.util.*;
class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char x = sc.next().charAt(0);

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==x)
            {
                System.out.println(i);
                break;
            }
        }
    }
}
dehwudsndsfd
h
2
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//14. Frequency of Elements
import java.util.*;
class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            int c = 1;

            if(a[i] == -1)
                continue;

            for(int j=i+1;j<n;j++)
            {
                if(a[i] == a[j])
                {
                    c++;
                    a[j] = -1;
                }
            }

            System.out.println(a[i] + "=" + c);
        }
    }
}



5
1 2 3 2 2
1=1
2=3
3=1
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//15. Matrix Addition
import java.util.*;
class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        int c[][] = new int[2][2];

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                b[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
1 5 7 9
2 4 6 8 
3 9 
13 17 
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//String to Integer
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
Output: 1234
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
