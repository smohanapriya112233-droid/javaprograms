//1)extract the digit

class demo
{
public static void main(String[] args)
{
int n=123;
while(n>0)
{
int d=n%10;
System.out.print(d);
n=n/10;
}
}
}

//2)count the digit
//method 1
class count
{
public static void main(String[] args)
{
int n=123;
int count=0;
while(n>0)
{
n=n/10;
count++;
}
System.out.println(count);
}
}

//method 2

class count
{
public static void main(String[] args)
{
int n=12345;
int count=(int)Math.log10(n)+1;
System.out.println(count);
}
}

//method 3

class count
{
public static void main(String[] args)
{
int n=1234;
int len=Integer.toString(n).length();
System.out.println(len);
}
}

//3)reverse the number
//method 1
class demo
{
public static void  main(String[] args)
{
int a=12345;
int rev=0;
while(a!=0)
{
int d=a%10;
rev=rev*10+d;
a=a/10;
}
System.out.print(rev);
}
}

//method 2
class demo
{
public static void main(String[] args)
{
int i=12345;
for(i=5;i>0;i--)
System.out.println(i);
}
}

// 4)min and max number
class demo
{
public static void main(String[] args)
{
int n =12345;
int max=0;
int min=9;
while(n>0)
{
int digit=n%10;
if(digit>max)
{
max=digit;
}
else if(digit<min)
{
 min=digit;
}

n=n/10;
}
System.out.println(max);
System.out.println(min);
}
}


// 5)Odd Even count
class demo
{
public static void main(String[] args)
{
int n =123456789;
int oddcount=0;
int evencount=0;
while(n>0)
{
int d=n%10;
if(d%2==0)
{
evencount++;
}
else
{
oddcount++;
}
n=n/10;
}
System.out.println(oddcount);
System.out.println(evencount);
}
}

//6) palindrome or not
class demo
 {
  public static void main(String[] args)
  {
   int x=121;
   int org=x;
   int rev=0;
   while(x>0)
    {
     int d=x%10;
     rev=rev*10+d;
     x=x/10;
    }
   if(org==rev)
   {
    return true;
   }
   else
   {
    return false;
   }
  }
 }

//7)factorial number
import java.util.Scanner;
class factorial
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}

//8)fibonacci number
import java.util.Scanner;
class fibonacci 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        System.out.println("Fiboacci series:");
        for(int i=2;i<=n;i++)
        {
            System.out.print(a +" ");
            int c=a+b;
            a=b;
            b=c;
        }
       
    }
}

//9)leap year or not
import java.util.Scanner;
class number
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the year:");
        int n=sc.nextInt();
        if(n%4==0)
        {
            System.out.println(n +" " +"is leap year");
        }
        else if(n%400==0)
        {
            System.out.println(n +" "+"is not a leap year");
        }
        else if(n%100==0)
        {
            System.out.println(n +" "+"is leap year");
        }
        else
        {
            System.out.println(n +" "+"not a leap year");
        }
    }
}

10)prime number
import java.util.Scanner;
class number{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            count++;
        }
        if(count==2)
        {
            System.out.println(n +" "+"is a prime number");
        }
        else
        {
             System.out.println(n +" "+"is not a prime number");
        }
    }
}

//11)composite number or not
import java.util.Scanner;
class number{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            count++;
        }
        if(count>2)
        {
            System.out.println(n +" "+"is a composite number");
        }
        else
        {
             System.out.println(n +" "+"is not a composite number");
        }
    }
}
