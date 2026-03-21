import java.util.*;
class max_int{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        String[] a=s.split(" ");
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            try {
                int num = Integer.parseInt(a[i]);
                if(num > max) {
                    max = num;
                }
            }
            catch(NumberFormatException e) {
            }

        }
        System.out.println(max);
    }
}