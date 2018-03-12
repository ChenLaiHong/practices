import java.util.Scanner;

/**
 * Created by CHLaih on 2018/3/12.
 * Sample Input

 6

 Sample Output

 #
 ##
 ###
 ####
 #####
 ######

 */
public class Second {
    static void staircase(int n) {
        boolean flag = true;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(flag){
                    for(int k=n-i-1;k>0;k--){
                        System.out.print(" ");
                    }
                    flag=false;
                }
                System.out.print("#");
            }
            flag = true;
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        staircase(n);
        in.close();


    }
}
