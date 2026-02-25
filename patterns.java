/*1)  *****
      *****
      *****
      *****
      *****   */

import java.util.Scanner;
class pat
{
    public static void main(String[] args)
    {
    int a=5;
    for(int i=1;i<=a;i++)
    {
        for(int j=1;j<=a;j++)
        {
            System.out.print("*");
        }
        System.out.println( );
    }
}
}

/* 2)
*
**
***
****
*****  */

import java.util.Scanner;
class pat
{
    public static void main(String[] args)
    {
    int a=5;
    for(int i=1;i<=a;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }
    }
}

/* 3)
***** 
**** 
*** 
** 
* 
*/

import java.util.Scanner;
class pat
{
    public static void main(String[] args)
    {
    int a=5;
    for(int i=1;i<=a;i++)
    {
        for(int j=1;j<=a-i+1;j++)
        {
       System.out.print("*");
        }
    System.out.println( " ");
    }
}
}




