# kuttypula14
import java.io.*;
import java.util.*;
public class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner (System.in);
    int a,b,num,c,temp=0;
    System.out.println("Enter the ranges number");
    a=sc.nextInt();
    b=sc.nextInt();
    System.out.println("The armstronger of  given range");
    for(int i=a;i<=b;i++)
    {
      num=i;
        temp=0;      
      while(num!=0)
    {
        c=num%10;
        num=num/10;
      temp=temp+(c*c*c);
      }
      
      if(temp==i)
      {
        System.out.println(i);
      }
      }
    }
  }
  
