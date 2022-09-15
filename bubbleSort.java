public class bubbleSort {
    int a,b;
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void swap(bubbleSort sn){
        int t=sn.a;
        sn.a=sn.b;
        sn.b=t;
    
    }
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1,0};
        bubbleSort sn= new bubbleSort();
        // bubble sort
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                //swap
                sn.a=arr[j];
                 sn.b=arr[j+1];
                // arr[j]^=arr[j+1];
                // arr[j+1]=arr[j]^arr[j+1];
                // arr[j]=arr[j]^arr[j+1];
                swap(sn);
                arr[j]=sn.a;
                arr[j+1]=sn.b;
                }
            }
        }
        printArray(arr);
    }
}
