public class recursion_1 {
    public static int recurnum(int n){
        if(n==-1)
         return 0;
        System.out.print(n+ " ");
         return recurnum(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        recurnum(n);
    }
}
