
// INPUT AND OUTPUT

/*import java.util.*;
class first{
    public static void main(String arg[]) {
      // System.out.println("\thello\t\n\t\n\t\n\tWorld");  
 Scanner sc= new Scanner(System.in);
 System.out.println("Enter 1st number:");
 int a=sc.nextInt();
 System.out.println("Enter 2nd number:");
 int b=sc.nextInt();
 int sum= a+b;
 System.out.println("The sum is "+sum);
  

    }
}*/

// conditional Statement
// import java.util.*;
// class first{
//   public static void main(String[]arg){
//  Scanner Sc = new Scanner(System.in);

//  System.out.println("Enter you Age");
//  int age= Sc.nextInt();
// if(age>=18)
// {
//   System.out.println("YOU Eligible fOR VOTE");
// }
// else{
//   System.out.println("You are under 18");

// }

//   }
// }

// Switch case
// import java.util.*;

// class first {
//   public static void main(String[] arg) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("1.for add");
//     System.out.println("2.for substaraction ");
//     System.out.println("5.for multiplication");
//     System.out.println("4.for division");
//     int button = sc.nextInt();
//     System.out.println("Enter two number");
//     int a = sc.nextInt();
//     int b = sc.nextInt();

//     switch (button) {
//       case 1:
//         int Sum = a + b;
//         System.out.println("The addition is " + Sum);

//         break;
//       case 2:
//         int diff = a - b;
//         System.out.println("The  substaraction is " + diff);
//         break;
//       case 3:
//         int mul = a * b;
//         System.out.println("The  multiplication is " + mul);
//         break;
//       case 4:
//         int division = a / b;
//         System.out.println("The Division is " + division);
//         break;
//       default:
//         System.out.println("Invalid button");
//         break;
//     }
//   }

// table of any number:-
// import java.util.*;
// class first {
//   public static void main(String arg[]) {
//     int i = 0;
//     Scanner sc = new Scanner(System.in);
//   System.out.println("Enter the number which table you want??");
//     int num = sc.nextInt();
// System.out.println("the sum of "+ num+" is");
//     for (i = 1; i <= 10; i++) {
//       System.out.println(num+"*"+i+"="+ num*i);
//     }
//   }
// }

// wap to multiple two num using function
// import java.util.*;
// class first{
//   public static int multiple(int a,int b){
//     return a*b;
//   }
//   public static void main(String arg[]){
//   System.out.println("Enter two number:");
//   Scanner sc= new Scanner(System.in);
//   int a=sc.nextInt();
//   int b=sc.nextInt();
//   int mul=multiple(a,b);
//   System.out.println("The multiplication of two number is :"+mul);
//   }
// }
//
// wap to find factorial of a number:
// import java.util.*;
// class first{
//   public static void fact(int n){
//     if(n<0){
//       System.out.println("Invalid number");
//       return;
//     }
//     if(n==0||n==1){
//       System.out.println("The factorial of "+n+" is "+1);
//       return;
//     }
//     int fact=1;
//     for(int i=n;i>=1;i--){
//        fact=fact*i;
//     }
//     System.out.println("The factorial of given number is "+ fact);
//     return;
//   }
//   public static void main(String[]arg){
//     int num;
//     System.out.println("Enter the number to find factorial");
//     Scanner sc= new Scanner(System.in);
//     num= sc.nextInt();
//     fact(num);
//   }
// }

// difference between nextline and next
/*
import java.util.*;
public class first{
    public static void main(String[] Sambit){
      Scanner sc=new Scanner(System.in);
      String name;
      name=sc.nextLine();
      System.out.println(name);
    }
}
*/
// Swap two number using method.
/* 
 import java.util.*;
 class first{
 public static void main(String[]arg){
Scanner s=new Scanner(System.in);
System.out.println("Enter a number");
int a= s.nextInt();
System.out.println("Enter a number");
int b= s.nextInt();
System.out.println("before swapping"+a+"and"+b);
swap(a,b);

 }
public static void swap(int x,int y){
  x=x^y;
  y=x^y;
  x=x^y;
  System.out.println("after swaping"+x+"and"+y);
}
}*/
//fibonnaci number using methode

/*import java.util.*;

class first {
  public static void fibo(int x) {
    int a = 0, b = 1, i;
    int sum = 0;
    System.out.print(a +"\t"+b);
    for (i = 1; i <=x; i++) {
      sum = a + b;
      System.out.print("\t" + sum);
      a = b;
      b = sum;
    }
  }

  public static void main(String[] arg) {
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    fibo(num - 2);
  }
}
 */

// fibonacci using recursion.
/*import java.util.*;

class first {
   static int n1 = 0, n2 = 1, sum = 0;
  public static void fibo(int num) {
     if (num > 0) {
      sum = n1 + n2;
      n1 = n2;
      n2 = sum;
      System.out.print("\t" + sum);
      fibo(num - 1);
    }
  }
  
  public static void main(String[] arg) {
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    System.out.print(n1 + "\t" + n2);
    fibo(num - 2);
  }
}*/
