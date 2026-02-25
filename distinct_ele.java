import java.util.*;
class distinct_ele{
    public Integer find_dis(String s,int n){
        if (s == null || n == 0 || s.length() == 0) return -1;
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(s.indexOf(c) == s.lastIndexOf(c)){
                return s.indexOf(c);
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string size:");
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the string:");
        String s=sc.nextLine();
        distinct_ele obj=new distinct_ele();
        Integer res=obj.find_dis(s,n);
        System.out.println(res);
    }
}