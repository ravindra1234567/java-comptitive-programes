import java.util.*;
public class CutSticks {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n;
        n = scan.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>(n);
        for(int i=0;i<n;i++)
            arr.add(scan.nextInt());
        StringBuffer sb = new StringBuffer();
        for(int j=0;j<arr.size();j++){
            if((arr.get(0))==0){
                arr.remove(0);
                j=-1;
                continue;
            }
            sb.append(arr.size()).append("\n");
            if(arr.size()>1){
            Collections.sort(arr);
            int min = arr.get(0);
           for(int i=0;i<arr.size();i++)
               arr.set(i,(arr.get(i))-min);
            }
        }
        System.out.println(sb);
        }
    }
    