import java.util.*;

class TowerOfHanoi{

    static void solve(char s , char d, char h , int num){

        if(num == 1){
            System.out.println("Disk 1 move "+s + " to destination "+d );
            return;
        }
        solve(s, h, d, num-1);

        System.out.println("Disk "+ num +"move "+s + " to destination "+d );

        solve(h, d, s, num-1);
    }

    public static void main(String args[]){
        char s = 'A';
        char d = 'C';
        char h = 'B';
        int n = 3;
        solve(s,d,h,n);

    }
}