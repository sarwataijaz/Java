import java.util.*;
public class displayAnArray {
    static void Array(int a[], int index) {
        if(index == a.length)
        return;
        System.out.print(a[index]+" ");
        Array(a, index+1);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int idx = scn.nextInt();
        int n = scn.nextInt();
        int [] a = new int[n];
        for(int i = 0; i<=a.length-1; i++){
            a[i] = scn.nextInt();
        }
        scn.close();
        Array(a,idx);
    }
}
