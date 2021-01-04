import java.util.Arrays;
 import java.util.Scanner;

public class LCM {
    static int lcm =1;
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] arr = new int[n];

    for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
    }
    System.out.println("lcm = "+lcm(arr));

    }

    // find the factor
    public static int divisor(int x[]){
        Arrays.sort(x);
        int num=0;
        for(int i=x.length-1; i>=0; i--){
            if(x[i] != 1 )
            num=x[i];
        }
        for(int j=2; j<=num; j++){
            if(num%j==0){
            return j;}
        }
        return num;
    }

    //finding the lcm
    public static int lcm(int arr[]){
        while(true){

        int j = divisor(arr);
        if(j==0){break;}
        lcm = lcm*j;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%j==0){
            arr[i] = arr[i]/j;}
        System.out.print(arr[i]+",");
        }
        System.out.println( " factor= "+lcm);
        return lcm(arr);
        }
        return lcm;
    }
}