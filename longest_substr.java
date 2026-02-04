import java.util.*;
class longest_substr{
    public static int longest_Substr(String s){
        int n=s.length();
        if(n==0||n==1) return n;
        int res=0;
        boolean[] vis=new boolean[26];
        int l=0,r=0;
        while(r<n){
            while(vis[s.charAt(r)-'a']==true){
                vis[s.charAt(l)-'a']=false;
                l++;
            }
            vis[s.charAt(r)-'a']=true;
            res=Math.max(res,(r-l+1));
            r++;
        }
        return res;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String ip=sc.nextLine();
        int ans=longest_Substr(ip);
        System.out.println("Length of longest substring without repeating characters:");
        System.out.println(ans);
    }
}