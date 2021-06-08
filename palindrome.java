import java.util.Scanner;
class palindrome
{
public static void main(String args[])
{
 Scanner s=new Scanner(System.in);
 int n=s.nextInt();
 int rev=0,rem;
int tmp=n;
 while( n != 0)
 {
   rem=tmp%10;
   rev=rev*10+rem;
   tmp=tmp/10;
 }
if(n==rev)
System.out.print("palindrome");
else
System.out.print(" not palindrome");
}
}