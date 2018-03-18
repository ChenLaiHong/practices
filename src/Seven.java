import java.util.Scanner;

/**
 * Created by CHLaih on 2018/3/18.
 * Sample Input

 2 3
 2 4
 16 32 96
 Sample Output

 3
 Explanation

 2 and 4 divide evenly into 4, 8, 12 and 16.
 4, 8 and 16 divide evenly into 16, 32, 96.

 4, 8 and 16 are the only three numbers for which each element of A is a factor and each is a factor of all elements of B.
 */
public class Seven {
    static int getTotalX(int[] a, int[] b) {
        int x=1,r=0,j=0,count=0;
        int[] d = new int[101];
        for(x=1;x<101;x++){
            int c=0;
            for(int i=0;i<a.length;i++) {
                if(x%a[i]==0&&x>=a[i]){
                    c++;
                }
            }
            if(c==a.length){
                d[j]=x;
                r++;
                j++;
            }
        }
        for(j=0;j<r;j++){
            int c=0;
            for(int i=0;i<b.length;i++){
                if(b[i]%d[j]==0){
                    c++;
                }
            }
            if(c==b.length){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
        in.close();
    }
}
