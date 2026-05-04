//1. Matrix Multiplication
import java.util.*;

class R192511008 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int r1=2,c1=2,r2=2,c2=2;

        int a[][] = new int[r1][c1];
        int b[][] = new int[r2][c2];
        int res[][] = new int[r1][c2];

        for(int i=0;i<r1;i++)
            for(int j=0;j<c1;j++)
                a[i][j]=sc.nextInt();

        for(int i=0;i<r2;i++)
            for(int j=0;j<c2;j++)
                b[i][j]=sc.nextInt();

        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++)
                    res[i][j]+=a[i][k]*b[k][j];
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
----------------------------------------------------------------------------------------------------
//2. Largest Number
import java.util.*;

class R192511008 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int max=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            if(x>max) max=x;
        }

        System.out.println("Largest="+max);
    }
}
----------------------------------------------------------------------------------------------------
//3. Smallest Number
import java.util.*;

class R192511008 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int min=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            int x=sc.nextInt();
            if(x<min) min=x;
        }

        System.out.println("Smallest="+min);
    }
}
----------------------------------------------------------------------------------------------------
//4. Palindrome (Number/String)
import java.util.*;

class R192511008 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        String rev = new StringBuilder(s).reverse().toString();

        if(s.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
----------------------------------------------------------------------------------------------------
//5. Decimal → Binary & Octal
import java.util.*;

class R192511008 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println("Binary="+Integer.toBinaryString(n));
        System.out.println("Octal="+Integer.toOctalString(n));
    }
}
----------------------------------------------------------------------------------------------------
//6. Binary → Decimal → Octal
import java.util.*;

class R192511008 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String bin = sc.next();

        int dec = Integer.parseInt(bin,2);

        System.out.println("Decimal="+dec);
        System.out.println("Octal="+Integer.toOctalString(dec));
    }
}
----------------------------------------------------------------------------------------------------
//7. Prime & Composite Separation
import java.util.*;

class R192511008 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            int c=0;

            for(int j=2;j<=num/2;j++){
                if(num%j==0){
                    c++;
                    break;
                }
            }

            if(num>1 && c==0)
                System.out.println(num+" Prime");
            else
                System.out.println(num+" Composite");
        }
    }
}
----------------------------------------------------------------------------------------------------
//8. Remove Duplicates
import java.util.*;

class R192511008 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        Set<Integer> set=new LinkedHashSet<>();

        for(int i=0;i<n;i++)
            set.add(sc.nextInt());

        System.out.println(set);
    }
}
----------------------------------------------------------------------------------------------------
  //9. Avg Positive & Negative
import java.util.*;

class R192511008 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n;
        int pos=0,neg=0,pc=0,nc=0;

        while(true){
            n=sc.nextInt();
            if(n==-1) break;

            if(n>=0){
                pos+=n; pc++;
            } else{
                neg+=n; nc++;
            }
        }

        if(pc>0) System.out.println("Pos Avg="+(pos/(double)pc));
        if(nc>0) System.out.println("Neg Avg="+(neg/(double)nc));
    }
}
----------------------------------------------------------------------------------------------------
  //10. Sum & Difference of Max & Min
import java.util.*;

class R192511008 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int a[]=new int[n];

        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();

        Arrays.sort(a);

        int min=a[0];
        int max=a[n-1];

        System.out.println("Sum="+(min+max));
        System.out.println("Diff="+(max-min));
    }
}
----------------------------------------------------------------------------------------------------
  //11. N Perfect Numbers
import java.util.*;

class R192511008 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int count=0,num=1;

        while(count<n){
            int sum=0;

            for(int i=1;i<=num/2;i++){
                if(num%i==0)
                    sum+=i;
            }

            if(sum==num){
                System.out.print(num+" ");
                count++;
            }
            num++;
        }
    }
}
----------------------------------------------------------------------------------------------------
  //12. Nth Largest Number
import java.util.*;

class R192511008 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int a[]=new int[n];

        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();

        Arrays.sort(a);

        int k=sc.nextInt();

        System.out.println(k+"th Largest="+a[n-k]);
    }
}
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  //Q1 – Prime & Composite Count
import java.util.*;

class R192511008 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, prime = 0, comp = 0;

        System.out.print("Enter count: ");
        n = sc.nextInt();

        for(int i=0;i<n;i++){
            int num = sc.nextInt();
            if(num <= 1) continue;

            int c = 0;
            for(int j=2;j<=num/2;j++){
                if(num % j == 0){
                    c++;
                    break;
                }
            }
            if(c==0) prime++;
            else comp++;
        }

        System.out.println("Prime number:"+prime);
        System.out.println("Composite number:"+comp);
    }
}
----------------------------------------------------------------------------------------------------
//Q2 – Mth Max & Nth Min
import java.util.*;

class R192511008 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];

        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();

        Arrays.sort(a);

        int M = sc.nextInt();
        int N = sc.nextInt();

        int max = a[n-1-M];
        int min = a[N-1];

        System.out.println("Max = "+max);
        System.out.println("Min = "+min);
        System.out.println("Sum = "+(max+min));
        System.out.println("Diff = "+(max-min));
    }
}
----------------------------------------------------------------------------------------------------
//Q3 – ATM Balance
import java.util.*;

class R192511008 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int total = 0;

        for(int i=1;i<=4;i++){
            int d = sc.nextInt();
            int n = sc.nextInt();
            total += d*n;
        }

        System.out.println("Total Balance = "+total);
    }
}
----------------------------------------------------------------------------------------------------
//Q4 – Palindrome (String / Number)
import java.util.*;

class R192511008 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();

        if(choice==1){
            String s = sc.next();
            String rev = new StringBuilder(s).reverse().toString();

            if(s.equals(rev))
                System.out.println("Palindrome");
            else
                System.out.println("Not Palindrome");
        }
        else{
            int n = sc.nextInt();
            int temp=n, rev=0;

            while(n>0){
                rev = rev*10 + n%10;
                n/=10;
            }

            if(temp==rev)
                System.out.println("Palindrome");
            else
                System.out.println("Not Palindrome");
        }
    }
}
----------------------------------------------------------------------------------------------------
// Q5 – Decimal to Binary & Octal
import java.util.*;

class R192511008 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println("Binary = "+Integer.toBinaryString(n));
        System.out.println("Octal = "+Integer.toOctalString(n));
    }
}
----------------------------------------------------------------------------------------------------
  //Q6 – Employee Bonus
import java.util.*;

class R192511008 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        char grade = sc.next().charAt(0);
        double salary = sc.nextDouble();
        double bonus = 0;

        if(grade=='A') bonus = 0.05 * salary;
        else if(grade=='B') bonus = 0.10 * salary;

        if(salary < 10000)
            bonus += 0.02 * salary;

        System.out.println("Salary="+salary);
        System.out.println("Bonus="+bonus);
        System.out.println("Total="+(salary+bonus));
    }
}
----------------------------------------------------------------------------------------------------
  //Q7 – Perfect Numbers
import java.util.*;

class R192511008 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0, num = 1;

        while(count < n){
            int sum = 0;

            for(int i=1;i<=num/2;i++){
                if(num % i == 0)
                    sum += i;
            }

            if(sum == num){
                System.out.print(num+" ");
                count++;
            }
            num++;
        }
    }
}
----------------------------------------------------------------------------------------------------
  //Q8 – Student Grade
import java.util.*;

class R192511008 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();

        double total = a+b+c+d;
        double avg = total/4;

        System.out.println("Total="+total);
        System.out.println("Aggregate="+avg);

        if(avg>=75) System.out.println("DISTINCTION");
        else if(avg>=60) System.out.println("FIRST");
        else if(avg>=50) System.out.println("SECOND");
        else if(avg>=40) System.out.println("THIRD");
        else System.out.println("FAIL");
    }
}
----------------------------------------------------------------------------------------------------
  //Q9 – Avg Positive & Negative
import java.util.*;

class R192511008 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n;
        int pos=0, neg=0, pc=0, nc=0;

        while(true){
            n = sc.nextInt();
            if(n == -1) break;

            if(n >= 0){
                pos += n;
                pc++;
            }
            else{
                neg += n;
                nc++;
            }
        }

        if(nc!=0)
            System.out.println("Neg Avg="+(neg/(double)nc));
        if(pc!=0)
            System.out.println("Pos Avg="+(pos/(double)pc));
    }
}
----------------------------------------------------------------------------------------------------
  //Q10 – Count Upper/Lower/Digits
import java.util.*;

class R192511008 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int upper=0, lower=0, num=0;
        char ch;

        while(true){
            ch = sc.next().charAt(0);
            if(ch=='*') break;

            if(Character.isUpperCase(ch)) upper++;
            else if(Character.isLowerCase(ch)) lower++;
            else if(Character.isDigit(ch)) num++;
        }

        System.out.println("Upper="+upper);
        System.out.println("Lower="+lower);
        System.out.println("Numbers="+num);
    }
}
----------------------------------------------------------------------------------------------------
  //Q11 – Factorial (Recursion)
import java.util.*;

class R192511008 {

    static int fact(int n){
        if(n==0 || n==1) return 1;
        return n * fact(n-1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n<0) System.out.println("Invalid");
        else System.out.println("Factorial="+fact(n));
    }
}
----------------------------------------------------------------------------------------------------
  //Q12 – Nth Largest
import java.util.*;

class R192511008 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];

        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();

        Arrays.sort(a);

        int k = sc.nextInt();

        System.out.println(k+"th Largest="+a[n-k]);
    }
}
----------------------------------------------------------------------------------------------------
  //Q13 – Binary to Decimal & Octal
import java.util.*;

class R192511008 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String bin = sc.next();

        int dec = Integer.parseInt(bin,2);

        System.out.println("Decimal="+dec);
        System.out.println("Octal="+Integer.toOctalString(dec));
    }
}
----------------------------------------------------------------------------------------------------
  //Q14 – Count Special Characters
import java.util.*;

class R192511008 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int count=0;

        for(char c: s.toCharArray()){
            if(!Character.isLetterOrDigit(c) && c!=' ')
                count++;
        }

        System.out.println("Special="+count);
    }
}
----------------------------------------------------------------------------------------------------
  //Q15 – Remove Duplicates
import java.util.*;

class R192511008 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Set<Integer> set = new LinkedHashSet<>();

        for(int i=0;i<n;i++){
            set.add(sc.nextInt());
        }

        System.out.println(set);
    }
}
----------------------------------------------------------------------------------------------------
  //Q16 – Bank Interest (Method Override)
class Bank {
    double getRate(){
        return 0;
    }
}

class SBI extends Bank {
    double getRate(){ return 8.4; }
}

class ICICI extends Bank {
    double getRate(){ return 7.3; }
}

class AXIS extends Bank {
    double getRate(){ return 9.7; }
}

class R192511008 {
    public static void main(String args[]) {
        Bank b;

        b = new SBI();
        System.out.println("SBI: "+b.getRate());

        b = new ICICI();
        System.out.println("ICICI: "+b.getRate());

        b = new AXIS();
        System.out.println("AXIS: "+b.getRate());
    }
}
----------------------------------------------------------------------------------------------------
  //Q17 – Inheritance + super() + hiding
class Parent {
    int x;
    Parent(int x){
        this.x = x;
    }
}

class Child extends Parent {
    int x;
    Child(int a, int b){
        super(a);
        this.x = b;
    }

    void display(){
        System.out.println(super.x + ", " + x);
    }
}

class R192511008 {
    public static void main(String args[]){
        Child c = new Child(100, 200);
        c.display();
    }
}
----------------------------------------------------------------------------------------------------
  //Q18 – Multiplication using Threads
class T1 extends Thread {
    int n;
    T1(int n){ this.n=n; }

    public void run(){
        for(int i=1;i<=5;i++)
            System.out.println(n+" x "+i+" = "+(n*i));
    }
}

class R192511008 {
    public static void main(String args[]){
        T1 t1 = new T1(5);
        T1 t2 = new T1(10);

        t1.start();
        t2.start();
    }
}
----------------------------------------------------------------------------------------------------
  //Q19 – Fibonacci using Runnable
class Fib implements Runnable {
    int n;
    Fib(int n){ this.n=n; }

    public void run(){
        int a=0,b=1;
        for(int i=0;i<n;i++){
            System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;
        }
    }
}

class R192511008 {
    public static void main(String args[]){
        Thread t = new Thread(new Fib(5));
        t.start();
    }
}
----------------------------------------------------------------------------------------------------
  //Q20 – Sum with Exception
import java.util.*;

class R192511008 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        try{
            int n = sc.nextInt();
            int a[] = new int[n];
            int sum=0;

            for(int i=0;i<=n;i++){ // intentional error
                a[i] = sc.nextInt();
                sum += a[i];
            }

            System.out.println("Sum="+sum);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception Occurred");
        }
    }
}
----------------------------------------------------------------------------------------------------
  //Q21 – Prime using Runnable
class Prime implements Runnable {
    int n;
    Prime(int n){ this.n=n; }

    public void run(){
        int c=0;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                c++;
                break;
            }
        }

        if(c==0 && n>1)
            System.out.println(n+" is Prime");
        else
            System.out.println(n+" is Not Prime");
    }
}

class R192511008 {
    public static void main(String args[]){
        Thread t = new Thread(new Prime(5));
        t.start();
    }
}
----------------------------------------------------------------------------------------------------
  //Q22 – Multi-Catch Exception
class R192511008 {
    public static void main(String args[]){
        try{
            int a = 10/0;
            int b[] = new int[2];
            b[5] = 10;
            String s = null;
            System.out.println(s.length());
        }
        catch(ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e){
            System.out.println("Handled Exception");
        }
    }
}
----------------------------------------------------------------------------------------------------
  //Q23 – FileWriter & FileReader
import java.io.*;

class R192511008 {
    public static void main(String args[]){
        try{
            FileWriter fw = new FileWriter("file.txt");
            fw.write("Computer Science and Engineering");
            fw.close();

            FileReader fr = new FileReader("file.txt");
            int i;
            while((i=fr.read())!=-1)
                System.out.print((char)i);
            fr.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
----------------------------------------------------------------------------------------------------
  //Q24 – Volume of Box (Constructor)
class Box {
    int l=2,b=3,h=4;

    Box(){
        int vol = l*b*h;
        System.out.println("Volume="+vol);
    }
}

class R192511008 {
    public static void main(String args[]){
        new Box();
    }
}
----------------------------------------------------------------------------------------------------
  //Q25 – String Operations
import java.util.*;

class R192511008 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println("Replaced: "+s.replace("Saveetha","College"));
        System.out.println("Length: "+s.length());
        System.out.println("Upper: "+s.toUpperCase());
    }
}
----------------------------------------------------------------------------------------------------
  //Q26 – HashTable Operations
import java.util.*;

class R192511008 {
    public static void main(String args[]){
        Hashtable<Integer,String> ht = new Hashtable<>();

        ht.put(1,"Deepak");
        ht.put(2,"Raj");
        ht.put(3,"Kumar");

        System.out.println("Size="+ht.size());

        ht.clear();

        System.out.println("After clear size="+ht.size());
    }
}
----------------------------------------------------------------------------------------------------
  //Q27 – Map (Employee)
import java.util.*;

class R192511008 {
    public static void main(String args[]){
        Map<Integer,String> map = new HashMap<>();

        map.put(1,"A");
        map.put(2,"B");

        System.out.println("Is Empty: "+map.isEmpty());

        map.remove(1);

        map.clear();
    }
}
----------------------------------------------------------------------------------------------------
  //Q28 – Generics Sorting
import java.util.*;

class Gen<T extends Comparable<T>> {
    void sort(T a[]){
        Arrays.sort(a);
        for(T i:a) System.out.print(i+" ");
    }
}

class R192511008 {
    public static void main(String args[]){
        Integer a[] = {5,2,8,1};
        new Gen<Integer>().sort(a);
    }
}
----------------------------------------------------------------------------------------------------
  //Q29 – ListIterator Reverse + Append
import java.util.*;

class R192511008 {
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<>(
            Arrays.asList("C","A","E","B","D","F")
        );

        ListIterator<String> it = list.listIterator();

        while(it.hasNext()){
            it.set(it.next()+"+");
        }

        while(it.hasPrevious()){
            System.out.print(it.previous()+" ");
        }
    }
}
----------------------------------------------------------------------------------------------------
  //Q30 – Arithmetic Exception
import java.util.*;

class R192511008 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println("Divide by zero error");
        }
    }
}
----------------------------------------------------------------------------------------------------
  //Q31 – 3 Threads Natural Numbers
class T extends Thread {
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(i);
            try{ sleep(500); }catch(Exception e){}
        }
    }
}

class R192511008 {
    public static void main(String args[]){
        new T().start();
        new T().start();
        new T().start();
    }
}
----------------------------------------------------------------------------------------------------
  //Q32 – Missing Number
import java.util.*;

class R192511008 {
    public static void main(String args[]){
        int a[] = {1,4,5,3,7,8,6};
        int n = 8;

        int sum = n*(n+1)/2;
        int arrSum=0;

        for(int i:a) arrSum+=i;

        System.out.println("Missing="+(sum-arrSum));
    }
}
----------------------------------------------------------------------------------------------------
  //Q33 – Parent & Child
class Parent {
    void show(){
        System.out.println("This is parent class");
    }
}

class Child extends Parent {
    void display(){
        System.out.println("This is child class");
    }
}

class R192511008 {
    public static void main(String args[]){
        Parent p = new Parent();
        Child c = new Child();

        p.show();
        c.display();
        c.show();
    }
}
----------------------------------------------------------------------------------------------------
  //Q34 – Student Constructor
class Student {
    String name;
    int reg;
    int m1,m2,m3,m4,m5;

    Student(String n,int r,int a,int b,int c,int d,int e){
        name=n; reg=r;
        m1=a;m2=b;m3=c;m4=d;m5=e;

        int total = m1+m2+m3+m4+m5;
        double avg = total/5.0;

        System.out.println(name+" "+reg);
        System.out.println("Total="+total);
        System.out.println("Avg="+avg);
    }
}

class R192511008 {
    public static void main(String args[]){
        new Student("Deepak",101,80,90,85,70,75);
    }
}
----------------------------------------------------------------------------------------------------
  //Q35 – Count Words, Lines, Characters
import java.io.*;

class R192511008 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));

        int ch=0, words=0, lines=0;
        String s;

        while((s=br.readLine())!=null){
            lines++;
            words += s.split(" ").length;
            ch += s.length();
        }

        System.out.println("Lines="+lines);
        System.out.println("Words="+words);
        System.out.println("Chars="+ch);
    }
}
----------------------------------------------------------------------------------------------------
  //Q36 – Multiply Strings
class R192511008 {
    public static void main(String args[]){
        String a="12", b="3";

        int x = Integer.parseInt(a);
        int y = Integer.parseInt(b);

        System.out.println("Result="+(x*y));
    }
}
----------------------------------------------------------------------------------------------------
  //Q37 – Power (x^n)
class R192511008 {
    public static void main(String args[]){
        double x = 2;
        int n = 10;

        System.out.println(Math.pow(x,n));
    }
}
----------------------------------------------------------------------------------------------------
  //Q38 – Max Subarray (Kadane)
class R192511008 {
    public static void main(String args[]){
        int a[] = {-2,1,-3,4,-1,2,1,-5,4};

        int max = a[0], cur = a[0];

        for(int i=1;i<a.length;i++){
            cur = Math.max(a[i], cur+a[i]);
            max = Math.max(max, cur);
        }

        System.out.println("Max Sum="+max);
    }
}
----------------------------------------------------------------------------------------------------
  //Q39 – Single Object (Exception)
class Single {
    static int count=0;

    Single(){
        count++;
        if(count>1)
            throw new RuntimeException("Only one object allowed");
    }
}

class R192511008 {
    public static void main(String args[]){
        Single s1 = new Single();
        // Single s2 = new Single(); // will throw error
    }
}
----------------------------------------------------------------------------------------------------
  //Q40 – Exam Room
import java.util.*;

class ExamRoom {
    int n;
    TreeSet<Integer> set = new TreeSet<>();

    ExamRoom(int n){
        this.n=n;
    }

    int seat(){
        if(set.isEmpty()){
            set.add(0);
            return 0;
        }

        int prev=-1, max=0, seat=0;

        for(int s:set){
            if(prev==-1){
                if(s>max){
                    max=s;
                    seat=0;
                }
            }
            else{
                int d=(s-prev)/2;
                if(d>max){
                    max=d;
                    seat=prev+d;
                }
            }
            prev=s;
        }

        if(n-1-set.last()>max)
            seat=n-1;

        set.add(seat);
        return seat;
    }

    void leave(int p){
        set.remove(p);
    }
}

class R192511008 {
    public static void main(String args[]){
        ExamRoom er = new ExamRoom(10);

        System.out.println(er.seat());
        System.out.println(er.seat());
        System.out.println(er.seat());
        System.out.println(er.seat());
        er.leave(4);
        System.out.println(er.seat());
    }
}
----------------------------------------------------------------------------------------------------
  //Q41 – Tile Possibilities
import java.util.*;

class R192511008 {
    static Set<String> set = new HashSet<>();

    static void solve(String prefix, String str){
        if(prefix.length()>0)
            set.add(prefix);

        for(int i=0;i<str.length();i++){
            solve(prefix+str.charAt(i),
                  str.substring(0,i)+str.substring(i+1));
        }
    }

    public static void main(String args[]){
        String s = "AAB";
        solve("",s);
        System.out.println(set.size());
    }
}
----------------------------------------------------------------------------------------------------
  //Q42 – Copy File
import java.io.*;

class R192511008 {
    public static void main(String args[]) throws Exception {
        FileInputStream in = new FileInputStream("a.txt");
        FileOutputStream out = new FileOutputStream("b.txt");

        int i;
        while((i=in.read())!=-1)
            out.write(i);

        in.close();
        out.close();
    }
}
----------------------------------------------------------------------------------------------------
  //Q43 – FileReader & FileWriter
import java.io.*;

class R192511008 {
    public static void main(String args[]) throws Exception {
        FileWriter fw = new FileWriter("file.txt");
        fw.write("Hello Java");
        fw.close();

        FileReader fr = new FileReader("file.txt");
        int i;
        while((i=fr.read())!=-1)
            System.out.print((char)i);
        fr.close();
    }
}
----------------------------------------------------------------------------------------------------
  //Q44 – BufferedReader
import java.io.*;

class R192511008 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));

        String s;
        while((s=br.readLine())!=null)
            System.out.println(s);

        br.close();
    }
}
----------------------------------------------------------------------------------------------------
  //Q45 – Count File Data
import java.io.*;

class R192511008 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));

        int ch=0, words=0, lines=0;
        String s;

        while((s=br.readLine())!=null){
            lines++;
            words += s.split(" ").length;
            ch += s.length();
        }

        System.out.println("Lines="+lines);
        System.out.println("Words="+words);
        System.out.println("Chars="+ch);
    }
}
----------------------------------------------------------------------------------------------------
  //Q46 – Matrix Row & Column
import java.util.*;

class R192511008 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[][] = new int[n][n];

        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                a[i][j]=sc.nextInt();

        System.out.println("Row wise:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                System.out.print(a[i][j]+" ");
            System.out.println();
        }

        System.out.println("Column wise:");
        for(int j=0;j<n;j++){
            for(int i=0;i<n;i++)
                System.out.print(a[i][j]+" ");
            System.out.println();
        }
    }
}
----------------------------------------------------------------------------------------------------
  //Q47 – Interface add & sub
interface IterF1 {
    void add(int a,int b);
    void sub(int a,int b);
}

class Calc implements IterF1 {
    public void add(int a,int b){
        System.out.println("Add="+(a+b));
    }
    public void sub(int a,int b){
        System.out.println("Sub="+(a-b));
    }
}

class R192511008 {
    public static void main(String args[]){
        Calc c = new Calc();
        c.add(5,3);
        c.sub(5,3);
    }
}
----------------------------------------------------------------------------------------------------
  //Q48 – PF Interest (try-catch-finally)
class R192511008 {
    public static void main(String args[]){
        try{
            double pf = 10000;
            double rate = 8;
            double interest = (pf*rate)/100;

            System.out.println("Interest="+interest);
        }
        catch(Exception e){
            System.out.println("Error");
        }
        finally{
            System.out.println("Done");
        }
    }
}
----------------------------------------------------------------------------------------------------
  //Q49 – Thread + super()
class MyThread extends Thread {
    MyThread(){
        super("Child Thread");
        start();
    }

    public void run(){
        for(int i=1;i<=3;i++)
            System.out.println(getName()+" "+i);
    }
}

class R192511008 {
    public static void main(String args[]){
        new MyThread();

        for(int i=1;i<=3;i++)
            System.out.println("Main "+i);
    }
}
----------------------------------------------------------------------------------------------------
  //Q50 – Custom Exception
class AgeNotWithinRangeException extends Exception {
    AgeNotWithinRangeException(String msg){
        super(msg);
    }
}

class NameNotValidException extends Exception {
    NameNotValidException(String msg){
        super(msg);
    }
}

class Student {
    int age;
    String name;

    Student(int age,String name) throws Exception {
        if(age<15 || age>21)
            throw new AgeNotWithinRangeException("Invalid Age");

        if(!name.matches("[a-zA-Z]+"))
            throw new NameNotValidException("Invalid Name");

        this.age=age;
        this.name=name;

        System.out.println("Valid Student");
    }
}

class R192511008 {
    public static void main(String args[]){
        try{
            new Student(18,"Deepak");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
