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

//7)
