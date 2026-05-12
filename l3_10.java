
1. Permutations

import java.util.*;

class R008
{
    static void perm(String s,String ans)
    {
        if(s.length()==0)
        {
            System.out.println(ans);
            return;
        }

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);

            String left=s.substring(0,i);
            String right=s.substring(i+1);

            perm(left+right,ans+ch);
        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        String s=sc.next();

        perm(s,"");
    }
}

--------------------------------------------------

2. Ransom Note Problem

import java.util.*;

class R008
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        String ransom=sc.next();
        String mag=sc.next();

        boolean flag=true;

        for(char c:ransom.toCharArray())
        {
            int index=mag.indexOf(c);

            if(index==-1)
            {
                flag=false;
                break;
            }

            mag=mag.substring(0,index)+mag.substring(index+1);
        }

        System.out.println(flag);
    }
}

--------------------------------------------------

3. Reverse Add Palindrome

import java.util.*;

class R008
{
    static int reverse(int n)
    {
        int rev=0;

        while(n>0)
        {
            rev=rev*10+n%10;
            n=n/10;
        }

        return rev;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        while(true)
        {
            int rev=reverse(n);

            int sum=n+rev;

            System.out.println(n+" + "+rev+" = "+sum);

            if(sum==reverse(sum))
            {
                System.out.println("Palindrome = "+sum);
                break;
            }

            n=sum;
        }
    }
}

--------------------------------------------------

4. Perfect Number

import java.util.*;

class R008
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int sum=0;

        for(int i=1;i<n;i++)
        {
            if(n%i==0)
                sum=sum+i;
        }

        if(sum==n)
            System.out.println("Perfect Number");
        else
            System.out.println("Not Perfect");
    }
}

--------------------------------------------------

5. Common Elements in Arrays

class R008
{
    public static void main(String args[])
    {
        int a[]={1,2,3,4};
        int b[]={2,4,5,6};

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<b.length;j++)
            {
                if(a[i]==b[j])
                    System.out.print(a[i]+" ");
            }
        }
    }
}

--------------------------------------------------

6. Perfect Squares

import java.util.*;

class R008
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int l=sc.nextInt();
        int u=sc.nextInt();

        for(int i=l;i<=u;i++)
        {
            int r=(int)Math.sqrt(i);

            if(r*r==i)
                System.out.print(i+" ");
        }
    }
}

--------------------------------------------------

7. Elements and Square Root

import java.util.*;

class R008
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int l=sc.nextInt();
        int u=sc.nextInt();

        for(int i=l;i<=u;i++)
        {
            System.out.println(i+" -> "+Math.sqrt(i));
        }
    }
}

--------------------------------------------------

8. Palindrome Addition

import java.util.*;

class R008
{
    static int reverse(int n)
    {
        int rev=0;

        while(n>0)
        {
            rev=rev*10+n%10;
            n=n/10;
        }

        return rev;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int rev=reverse(n);

        int sum=n+rev;

        System.out.println("Sum = "+sum);

        if(sum==reverse(sum))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}

--------------------------------------------------

9. Days into Years Weeks Days

import java.util.*;

class R008
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int days=sc.nextInt();

        int years=days/365;

        days=days%365;

        int weeks=days/7;

        int rem=days%7;

        System.out.println("Years = "+years);
        System.out.println("Weeks = "+weeks);
        System.out.println("Days = "+rem);
    }
}

--------------------------------------------------

10. Nth Factor of Given Number

import java.util.*;

class R008
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int k=sc.nextInt();

        int count=0;

        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;

                if(count==k)
                {
                    System.out.println(k+"th Factor = "+i);
                    break;
                }
            }
        }
    }
}
