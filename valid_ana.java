import java.util.*;
class valid_ana{
    public static boolean valid_ana(String s1,String s2){
        int n1=s1.length();
        int n2=s2.length();
        if(n1!=n2) return false;
        int[] freq=new int[26];
        for(int i=0;i<n1;i++){
            freq[s1.charAt(i)-'a']++;
        }
        for(int j=0;j<n2;j++){
            freq[s2.charAt(j)-'a']--;
        }
        for( int cnt:freq){
            if(cnt!=0) return false;
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();
        boolean res=valid_ana(s,t);
        System.out.println("Strings are valid anagrams of each other?");
        System.out.println(res);
    }
}