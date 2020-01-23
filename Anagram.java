
import java.util.Arrays;
import java.util.Scanner;
public class Anagram 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        char c[]=a.toLowerCase().toCharArray();
        char d[]=b.toLowerCase().toCharArray();
        if(c.length!=d.length)
        {
            System.out.println("Not Anagrams");
            return;
        }
        Arrays.sort(c);
        Arrays.sort(d);
        for(int i=0;i<c.length;i++)
        {
            if(c[i]!=d[i])
            {
                System.out.println("Not Anagrams");
                return;
            }
        }
        System.out.println("Anagrams");
    }
}
