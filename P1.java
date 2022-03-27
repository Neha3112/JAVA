import java.util.*;
class P1
{
            public static void main(String args[])
            {
                        int a,b,c,d,flag=0;
                        Scanner scr=new Scanner(System.in);
                        System.out.println("\nEnter the values of a: ");
                        a=scr.nextInt();
  	    System.out.println("\nEnter the values of b: ");
                        b=scr.nextInt();
	       System.out.println("\nEnter the values of c: ");
                        c=scr.nextInt();
                        d=(b*b)-(4*a*c);
                        if(d==0)
                        {
                                    System.out.println("Roots are real and Equal");
                                    flag=1;
                        }
                        else if(d>0)
                        {
                                    System.out.println("Roots are real and UnEqual");
                                    flag=1;
                        }
                        else 
                        	System.out.println("Roots are imaginary");
	  
                        if(flag==1)
                        {
                                    float s1=(float)(-b+Math.sqrt(d))/(2*a);
                                    float s2=(float)(-b-Math.sqrt(d))/(2*a);
                                    System.out.println("Roots are :   "+s1+" ,"+s2);
                        }
            }
}
                       