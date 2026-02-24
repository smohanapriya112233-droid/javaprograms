// extract the digit

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

//count the digit
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


