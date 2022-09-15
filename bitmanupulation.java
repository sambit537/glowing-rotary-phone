//            **********Bitmanupulation***********

// GET bit = to find which number present in the asked location.
// 1st operate to find bitmask= 1<<position.
// perform bitAND opration.
// if the result of AND is zero then the bit is 0,else bit is 1, vice versa.
/*public class bitmanupulation {
    public static void main(String[] args) {
        int n=5;//0101
        int position=0;
        int bitmask=1<<position;
        if((bitmask&n)==0){
            System.out.println("The Asked bit is 0");
        }
        else{
        System.out.println("The Asked bit is 1");
        }
    }
}*/
//SET bit = to change number(0 bit ) in desired position to (1) .
// 1st operate to find bitmask= 1<<position.
// perform bitOR opration and store in a new variable
/*public class bitmanupulation {
    public static void main(String[] args) {
        int n=5;//0101
        int position=3;
        int bitmask=1<<position;
        int newNum=bitmask|n;
        System.out.println(newNum);

    }
}  */

// clear bit = to clear the bit (1) from the desired position and put (0).
// 1st FIND BITMASK=1<<POSITION.
// find negation of BITMASK.
// perform bit and  with negation of bitmask = newNumber.
/*public class bitmanupulation {
    public static void main(String[] args) {
        int n=5;//0101
        int position=2;
        int bitmask=1<<position;
        int negationBitmask=~(bitmask);
        int newNum=negationBitmask&n;
        System.out.println(newNum);

    }
}  */

//      *********UPDATE BIT**********
// It means change the exiting bit (0 to 1) or (1 to 0) from a given position.
//for (1 to 0) --> perform clear bit opration
// for (0 to 1)---> perform set bit operation.
/* import java.util.*;
public class bitmanupulation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        int n= sc.nextInt();
        System.out.println("Enter the disered position:");
        int position= sc.nextInt();
        int bitmask=1<<position;
        System.out.println("Enter 0 or 1 to update the bit");
        int update= sc.nextInt();
        if(update==1){ // to convert 0 to 1
        int newNum=bitmask|n;
        System.out.println(newNum);
        }
        else{ // to convert 1 to 0.
            int negationBitmask=~(bitmask);
            int newNum=negationBitmask&n;
            System.out.println(newNum);
        }

    }
}  */
