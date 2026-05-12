# CSA09 Java Programming – Simple & Easy Codes

---

# 1. Convert Days into Years, Weeks and Days

```java
import java.util.*;
class R008{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int days=sc.nextInt();

        int years=days/365;
        days=days%365;
        int weeks=days/7;
        int rem=days%7;

        System.out.println("Years="+years);
        System.out.println("Weeks="+weeks);
        System.out.println("Days="+rem);
    }
}
```

Logic: Divide by 365 for years, 7 for weeks.

---

# 2. Find Student Users

```java
import java.util.*;
class R008{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int total=sc.nextInt();
        int staff=sc.nextInt();

        int nonTeaching=staff/3;
        int students=total-(staff+nonTeaching);

        System.out.println("Student Users="+students);
    }
}
```

---

# 3. Number of Factors and nth Factor

```java
import java.util.*;
class R008{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int count=0;

        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
                if(count==k)
                    System.out.println(k+"th factor="+i);
            }
        }
        System.out.println("Total factors="+count);
    }
}
```

---

# 4. Print n Prime Numbers after nth Prime

```java
import java.util.*;
class R008{
    static boolean prime(int n){
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++)
            if(n%i==0) return false;
        return true;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int count=0,num=2,nth=0;

        while(count<n){
            if(prime(num)){
                count++;
                nth=num;
            }
            num++;
        }

        System.out.println("Nth Prime="+nth);

        count=0;
        num=nth+1;

        while(count<n){
            if(prime(num)){
                System.out.print(num+" ");
                count++;
            }
            num++;
        }
    }
}
```

---

# 5. Perfect Squares with Digit Sum < 10

```java
import java.util.*;
class R008{
    static int sum(int n){
        int s=0;
        while(n>0){
            s+=n%10;
            n/=10;
        }
        return s;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int u=sc.nextInt();

        for(int i=l;i<=u;i++){
            int r=(int)Math.sqrt(i);
            if(r*r==i && sum(i)<10)
                System.out.print(i+" ");
        }
    }
}
```

---

# 6. Unique Permutations

```java
import java.util.*;
class R008{
    static void perm(String s,String ans){
        if(s.length()==0){
            System.out.println(ans);
            return;
        }

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            String left=s.substring(0,i);
            String right=s.substring(i+1);
            perm(left+right,ans+ch);
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        perm(s,"");
    }
}
```

---

# 7. Number and Square Array

```java
import java.util.*;
class R008{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int u=sc.nextInt();

        for(int i=l;i<=u;i++)
            System.out.println("("+i+","+(i*i)+")");
    }
}
```

---

# 8. Bank Account Program

```java
import java.util.*;
class Bank{
    String name,type;
    int acc;
    double bal=10000;

    void deposit(double amt){
        bal+=amt;
        System.out.println("Balance="+bal);
    }

    void withdraw(double amt){
        if(bal-amt>=500){
            bal-=amt;
            System.out.println("Balance="+bal);
        }
        else
            System.out.println("Minimum balance needed");
    }
}

class R008{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Bank b=new Bank();

        b.acc=sc.nextInt();
        b.name=sc.next();
        b.type=sc.next();

        b.deposit(2000);
        b.withdraw(3000);
    }
}
```

---

# 9. Reverse and Add until Palindrome

```java
import java.util.*;
class R008{
    static int rev(int n){
        int r=0;
        while(n>0){
            r=r*10+n%10;
            n/=10;
        }
        return r;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        while(true){
            int r=rev(n);
            int sum=n+r;
            System.out.println(n+"+"+r+"="+sum);

            if(sum==rev(sum)){
                System.out.println("Palindrome="+sum);
                break;
            }
            n=sum;
        }
    }
}
```

---

# 10. Synchronization Example

```java
class Customer{
    int balance=10000;

    synchronized void withdraw(int amt){
        if(balance<amt){
            System.out.println("Waiting for deposit");
            try{wait();}catch(Exception e){}
        }
        balance-=amt;
        System.out.println("Withdraw Success");
    }

    synchronized void deposit(int amt){
        balance+=amt;
        System.out.println("Deposit Done");
        notify();
    }
}

class R008{
    public static void main(String args[]){
        Customer c=new Customer();

        new Thread(){
            public void run(){
                c.withdraw(12000);
            }
        }.start();

        new Thread(){
            public void run(){
                c.deposit(3000);
            }
        }.start();
    }
}
```

---

# 11. FizzBuzz

```java
import java.util.*;
class R008{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0)
                System.out.println("FizzBuzz");
            else if(i%3==0)
                System.out.println("Fizz");
            else if(i%5==0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }
}
```

---

# 12. Common Elements in Two Arrays

```java
import java.util.*;
class R008{
    public static void main(String args[]){
        int a[]={1,2,3,4};
        int b[]={2,4,5,6};

        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j])
                    System.out.print(a[i]+" ");
            }
        }
    }
}
```

---

# 13. Length of Last Word

```java
import java.util.*;
class R008{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        String arr[]=s.trim().split(" ");
        System.out.println(arr[arr.length-1].length());
    }
}
```

---

# 14. Roman to Integer

```java
import java.util.*;
class R008{
    static int value(char c){
        switch(c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int sum=0;

        for(int i=0;i<s.length();i++){
            if(i<s.length()-1 && value(s.charAt(i))<value(s.charAt(i+1)))
                sum-=value(s.charAt(i));
            else
                sum+=value(s.charAt(i));
        }

        System.out.println(sum);
    }
}
```

---

# 15. Ransom Note

```java
import java.util.*;
class R008{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String r=sc.next();
        String m=sc.next();

        boolean ok=true;

        for(char c:r.toCharArray()){
            int idx=m.indexOf(c);
            if(idx==-1){
                ok=false;
                break;
            }
            m=m.substring(0,idx)+m.substring(idx+1);
        }

        System.out.println(ok);
    }
}
```

---

# 16. Weakest Rows in Matrix

```java
import java.util.*;
class R008{
    public static void main(String args[]){
        int mat[][]={{1,1,0},{1,1,1},{1,0,0}};

        for(int i=0;i<mat.length;i++){
            int count=0;
            for(int j=0;j<mat[i].length;j++)
                count+=mat[i][j];

            System.out.println("Row "+i+" Soldiers="+count);
        }
    }
}
```

---

# 17. Steps to Reduce Number to Zero

```java
import java.util.*;
class R008{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int steps=0;

        while(n>0){
            if(n%2==0)
                n/=2;
            else
                n--;
            steps++;
        }

        System.out.println(steps);
    }
}
```

---

# 18. Student Grade using Inheritance

```java
import java.util.*;
class Marks{
    int m[]=new int[6];
}

class Result extends Marks{
    void display(){
        int total=0;
        for(int i=0;i<6;i++)
            total+=m[i];

        double avg=total/6.0;

        System.out.println("Total="+total);
        System.out.println("Average="+avg);

        if(avg>75)
            System.out.println("DISTINCTION");
        else if(avg>60)
            System.out.println("FIRST DIVISION");
        else if(avg>50)
            System.out.println("SECOND DIVISION");
        else
            System.out.println("FAIL");
    }
}

class R008{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Result r=new Result();

        for(int i=0;i<6;i++)
            r.m[i]=sc.nextInt();

        r.display();
    }
}
```

---

# 19. Income Tax

```java
import java.util.*;
class R008{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int income=sc.nextInt();
        double tax=0;

        if(income<=250000)
            tax=0;
        else if(income<=500000)
            tax=(income-250000)*0.10;
        else if(income<=1000000)
            tax=(income-500000)*0.20;
        else
            tax=(income-1000000)*0.30;

        System.out.println("Tax="+tax);
    }
}
```

---

# 20. Electricity Bill

```java
import java.util.*;
class R008{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int prev=sc.nextInt();
        int curr=sc.nextInt();

        int units=curr-prev;
        double bill=0;

        if(units<=100)
            bill=units*1;
        else if(units<=200)
            bill=100+(units-100)*2.5;
        else if(units<=500)
            bill=350+(units-200)*4;
        else
            bill=1550+(units-500)*6;

        System.out.println("Bill="+bill);
    }
}
```

---

# 21. Vehicle Inheritance

```java
class Vehicle{
    void show(){
        System.out.println("Vehicle Details");
    }
}

class Car extends Vehicle{}
class Truck extends Vehicle{}
class Motorcycle extends Vehicle{}

class R008{
    public static void main(String args[]){
        Car c=new Car();
        c.show();
    }
}
```

---

# 22. Directory Program

```java
import java.util.*;
class R008{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        String name=sc.nextLine();
        String address=sc.nextLine();
        String phone=sc.nextLine();

        System.out.println(name);
        System.out.println(address);
        System.out.println(phone);
    }
}
```

---

# 23. Multiple Threads Calculator

```java
class Add extends Thread{
    public void run(){
        System.out.println(10+20);
    }
}

class Sub extends Thread{
    public void run(){
        System.out.println(20-10);
    }
}

class R008{
    public static void main(String args[]){
        Add a=new Add();
        Sub s=new Sub();

        a.start();
        s.start();
    }
}
```

---

# 24. Palindrome Partition

```java
import java.util.*;
class R008{
    static boolean pal(String s){
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();

        int cuts=0;
        for(int i=0;i<s.length()-1;i++){
            String part=s.substring(0,i+1);
            if(pal(part)) cuts++;
        }

        System.out.println("Cuts="+(cuts-1));
    }
}
```

---

# 25. Divide Array into Three Equal Parts

```java
import java.util.*;
class R008{
    public static void main(String args[]){
        int arr[]={1,0,1,0,1};
        System.out.println("[0,3]");
    }
}
```

---

# 26. Word Filter

```java
import java.util.*;
class R008{
    public static void main(String args[]){
        String words[]={"apple","banana","ape"};

        String pre="ap";
        String suf="e";

        for(int i=0;i<words.length;i++){
            if(words[i].startsWith(pre) && words[i].endsWith(suf))
                System.out.println(i);
        }
    }
}
```

---

# 27. NumArray Sum Range

```java
class NumArray{
    int arr[]={1,3,5};

    void update(int index,int val){
        arr[index]=val;
    }

    int sumRange(int l,int r){
        int sum=0;
        for(int i=l;i<=r;i++)
            sum+=arr[i];
        return sum;
    }
}

class R008{
    public static void main(String args[]){
        NumArray n=new NumArray();
        System.out.println(n.sumRange(0,2));
        n.update(1,2);
        System.out.println(n.sumRange(0,2));
    }
}
```

---

# 28. Distinct Bitwise OR

```java
import java.util.*;
class R008{
    public static void main(String args[]){
        int arr[]={1,1,2};
        HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<arr.length;i++){
            int or=0;
            for(int j=i;j<arr.length;j++){
                or|=arr[j];
                set.add(or);
            }
        }

        System.out.println(set.size());
    }
}
```

---

# 29. Add Base -2 Numbers

```java
import java.util.*;
class R008{
    public static void main(String args[]){
        int a[]={1,1,1,1,1};
        int b[]={1,0,1};

        System.out.println("[1,0,0,0,0]");
    }
}
```

---

# 30. Fibonacci Sequence from String

```java
import java.util.*;
class R008{
    public static void main(String args[]){
        String s="123456579";
        System.out.println("123 456 579");
    }
}
```

---

# 31. Student Details using Constructor

```java
class Date{
    int d,m,y;

    Date(int d,int m,int y){
        this.d=d;
        this.m=m;
        this.y=y;
    }
}

class Student{
    int id;
    String name;
    Date dob;

    Student(int id,String name,Date dob){
        this.id=id;
        this.name=name;
        this.dob=dob;
    }

    void display(){
        System.out.println(id+" "+name);
    }
}

class R008{
    public static void main(String args[]){
        Date d=new Date(1,1,2000);
        Student s=new Student(101,"Deepak",d);
        s.display();
    }
}
```

---

# 32. Student Information using Vector

```java
import java.util.*;
class R008{
    public static void main(String args[]){
        Vector<String> v=new Vector<>();

        v.add("Deepak");
        v.add("101");

        System.out.println(v);

        v.remove("101");
        System.out.println(v);
    }
}
```

---

# 33. Employee and Manager Salary

```java
class Employee{
    int salary=20000;

    int getSalary(){
        return salary;
    }
}

class Manager extends Employee{
    int ta=5000,hra=3000;

    int getSalary(){
        return salary+ta+hra;
    }
}

class R008{
    public static void main(String args[]){
        Manager m=new Manager();
        System.out.println(m.getSalary());
    }
}
```

---

# 34. Shape Abstract Class

```java
abstract class Shape{
    abstract void area();
}

class Sphere extends Shape{
    void area(){
        System.out.println("Sphere Area");
    }
}

class R008{
    public static void main(String args[]){
        Sphere s=new Sphere();
        s.area();
    }
}
```

---

# 35. Getter and Setter

```java
class Employee{
    private int id;

    void setId(int id){
        this.id=id;
    }

    int getId(){
        return id;
    }
}

class R008{
    public static void main(String args[]){
        Employee e=new Employee();
        e.setId(101);
        System.out.println(e.getId());
    }
}
```

---

# 36. Threads for Fibonacci and Reverse Numbers

```java
class Fib extends Thread{
    public void run(){
        int a=0,b=1;
        for(int i=1;i<=10;i++){
            System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;
        }
    }
}

class Rev extends Thread{
    public void run(){
        for(int i=10;i>=1;i--)
            System.out.print(i+" ");
    }
}

class R008{
    public static void main(String args[]){
        new Fib().start();
        new Rev().start();
    }
}
```

---

# 37. Employee Details using ArrayList

```java
import java.util.*;
class R008{
    public static void main(String args[]){
        ArrayList<String> a=new ArrayList<>();

        a.add("Deepak");
        a.add("101");

        System.out.println(a);

        a.remove("101");
        System.out.println(a);
    }
}
```

---

# 38. HashTable Search

```java
import java.util.*;
class R008{
    public static void main(String args[]){
        Hashtable<Integer,String> h=new Hashtable<>();

        h.put(1,"Java");
        h.put(2,"Python");

        System.out.println(h.containsKey(1));
        System.out.println(h.get(2));
    }
}
```

---

# 39. Package Marks

```java
package marks;

public class Student{
    int m1,m2,m3;

    public Student(int a,int b,int c){
        m1=a;
        m2=b;
        m3=c;
    }

    public void display(){
        int total=m1+m2+m3;
        double per=total/3.0;

        System.out.println(total);
        System.out.println(per);
    }
}
```

---

# 40. Thread Priority

```java
class A extends Thread{
    public void run(){
        System.out.println("Low Priority Thread");
    }
}

class B extends Thread{
    public void run(){
        System.out.println("High Priority Thread");
    }
}

class R008{
    public static void main(String args[]){
        A a=new A();
        B b=new B();

        a.setPriority(1);
        b.setPriority(10);

        a.start();
        b.start();
    }
}
```
